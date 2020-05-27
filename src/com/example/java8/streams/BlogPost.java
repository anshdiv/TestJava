package com.example.java8.streams;

public class BlogPost{
	
	private String title;
	private String author;
	private int likes;
	private BlogPostType blogPostType;
	
	
	public BlogPost(String title, String author, int likes, BlogPostType blogPostType) {
		super();
		this.title = title;
		this.author = author;
		this.likes = likes;
		this.blogPostType = blogPostType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public BlogPostType getBlogPostType() {
		return blogPostType;
	}
	public void setBlogPostType(BlogPostType blogPostType) {
		this.blogPostType = blogPostType;
	}
	
	@Override
	public String toString() {
		return title+"("+blogPostType+") written by - "+author+" having "+likes+" Likes.";
	}
	
	
}
