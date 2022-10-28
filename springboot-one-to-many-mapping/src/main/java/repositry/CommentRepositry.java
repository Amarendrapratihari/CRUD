package repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Comment;

@Repository
public interface CommentRepositry extends JpaRepository<Comment, Long> {

}
