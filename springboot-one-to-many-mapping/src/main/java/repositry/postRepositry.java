package repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Post;

@Repository 
public interface postRepositry extends JpaRepository<Post, Long> {

}
