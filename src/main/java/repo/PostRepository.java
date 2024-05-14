package repo;

import org.springframework.data.repository.CrudRepository;
import models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
