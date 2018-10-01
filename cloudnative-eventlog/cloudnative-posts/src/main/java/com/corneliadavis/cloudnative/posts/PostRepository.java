package com.corneliadavis.cloudnative.posts;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by corneliadavis on 9/4/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findByUserId(Long userId);

    @Query("select p.title as title, p.body as body, p.date as date, u.username as username "
            + "from Post p inner join p.user u where u.username = :username")
    Iterable<IPostApi> findByUsername(@Param("username") String username);

    @Query("select p.title as title, p.body as body, p.date as date, u.username as username "
            + "from Post p inner join p.user u")
    Iterable<IPostApi> findAllPosts();

}
