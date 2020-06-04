package main.com.example.java8.streams;


public class Tuple {

	private BlogPostType blogPostType;
	private String author;
	

	public Tuple(BlogPostType blogPostType, String author) {
		this.blogPostType = blogPostType;
		this.author = author;
	}

	public BlogPostType getBlogPostType() {
		return blogPostType;
	}

	public void setBlogPostType(BlogPostType blogPostType) {
		this.blogPostType = blogPostType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		int prime = 23;
		int result = 1;
		result = prime * result + ((blogPostType == null) ? 0 : blogPostType.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple other = (Tuple) obj;
		if (blogPostType == null) {
			if (other.blogPostType != null)
				return false;
		} else if (!blogPostType.equals(other.blogPostType))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return author+" - "+blogPostType;
	}
}
