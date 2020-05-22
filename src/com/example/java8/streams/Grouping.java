package com.example.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Grouping {

	public static void main(String ...arg) {
		
		ArrayList<BlogPost> posts = new ArrayList<BlogPost>();
		posts.add(new BlogPost("Java 8","Larry",5,BlogPostType.GUIDE));
		posts.add(new BlogPost("Strems","Larry",5,BlogPostType.GUIDE));
		posts.add(new BlogPost("Funcational Interfaces","Larry",5,BlogPostType.GUIDE));
		posts.add(new BlogPost("Collectors","James",5,BlogPostType.REVIEW));
		posts.add(new BlogPost("Reduction","James",5,BlogPostType.NEWS));
		posts.add(new BlogPost("Grouping","James",5,BlogPostType.GUIDE));
		
		// Simple Grouping
		Map<BlogPostType,List<BlogPost>> postPerType = posts.stream().collect(Collectors.groupingBy(BlogPost::getBlogPostType));
		
		// Complex Grouping
		Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
				  .collect(Collectors.groupingBy(post -> new Tuple(post.getBlogPostType(), post.getAuthor())));
	
		// MultipleFields Grouping
	    Map<String,Map<BlogPostType,List<BlogPost>>> postGrpByAuthorAndType = posts.stream()
	    		.collect(Collectors.groupingBy(BlogPost::getAuthor,Collectors.groupingBy(BlogPost::getBlogPostType)));
	
	    // Average likes by BlogPostType
	    Map<BlogPostType,Double> averageLikesPerType = posts.stream().collect(Collectors.groupingBy(BlogPost::getBlogPostType,Collectors.averagingDouble(BlogPost::getLikes)));
	   
	    // Sum of likes by Author
	    Map<String,Integer> sumOfLikesPerAuthor = posts.stream().collect(Collectors.groupingBy(BlogPost::getAuthor,Collectors.summingInt(BlogPost::getLikes)));
	    
	    // Grouping blog Post by max number of likes
	    Map<BlogPostType,Optional<BlogPost>> blogPost = posts.stream().collect(Collectors.groupingBy(BlogPost::getBlogPostType,Collectors.maxBy(Comparator.comparingInt(BlogPost::getLikes))));
	    
	    System.out.println("---- Simple Grouping by PostType ----");
	    postPerType.entrySet().forEach(System.out::println);
	    
	    System.out.println("---- Complex Grouping by PostType ----");
	    postsPerTypeAndAuthor.entrySet().forEach(System.out::println);
	    
	    System.out.println("---- MultipleFields Grouping ----");
	    postGrpByAuthorAndType.entrySet().forEach(System.out::println);
	    
	    System.out.println("---- Average likes by BlogPostType ----");
	    averageLikesPerType.entrySet().forEach(System.out::println);
	    
	    System.out.println("---- Sum of likes by Author ----");
	    sumOfLikesPerAuthor.entrySet().forEach(System.out::println);
	    
	    System.out.println("---- Grouping blog Post by max number of likes ----");
	    blogPost.entrySet().forEach(System.out::println);
	}
}
