package net.alexdixon.soccercompetitiontracker.models.data;

import net.alexdixon.soccercompetitiontracker.models.forms.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface BlogDao extends CrudRepository<Blog, Integer> {


    @Query(value = "SELECT * FROM blog ORDER BY created DESC ", nativeQuery = true)
    List<Blog> findByCreated();


}