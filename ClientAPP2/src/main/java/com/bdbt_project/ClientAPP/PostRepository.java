package com.bdbt_project.ClientAPP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bdbt_project.ClientAPP.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
