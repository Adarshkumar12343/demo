package com.example.demo.Service;

import com.example.demo.Models.ProjectModel;

import java.util.List;

public interface ProjectServiceInterface {

    List<ProjectModel> findAllProject();

    ProjectModel findProjectById(Integer id);

    void createProject(ProjectModel projectModel);

    void deleteProjectById(Integer id);

    void updateProjectById(String name, Integer id);
}
