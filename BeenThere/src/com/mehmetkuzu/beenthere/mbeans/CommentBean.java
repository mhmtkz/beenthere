package com.mehmetkuzu.beenthere.mbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import com.mehmetkuzu.beenthere.business.PlaceService;
import com.mehmetkuzu.beenthere.domain.Comment;

@SessionScoped
@ManagedBean
public class CommentBean implements Serializable{

	private List<Comment> comments;
	
	private Comment comment = new Comment();
	

	public CommentBean() {
		
	}
	@EJB
	private PlaceService placeService;
	
	@PostConstruct
	public void allComments()
	
	{
		this.comments = placeService.getAllComments();
	}
	
	public void addComment()
	{
		placeService.addComment(comment);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	
	
	
}
