package com.example.demo.Repository;

import com.example.demo.Models.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectModel,Integer> {
    @Modifying
    @Query("update ProjectModel p set p.name =:name where p.id =:id")
    void updatePProjectById(@Param("name") String name,@Param("id") Integer id);
}
