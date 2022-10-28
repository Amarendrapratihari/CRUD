package repositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.Comment;
import entity.Post;

@SpringBootApplication
public class Demo implements CommandLineRunner {
	
	public static void main(String [] args) {
		SpringApplication.run(Demo.class, args);
	} 
    @Autowired
    private postRepositry  postRepositry;
	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("One To Many Mapping", "One To Many Mapping");
		
		Comment comment = new Comment();
		Comment comment1 = new Comment();
		Comment comment2 = new Comment();
		
		post.getComments().add(comment);
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		
		this.postRepositry.save(post);
		
		
	 
		
	}

}
