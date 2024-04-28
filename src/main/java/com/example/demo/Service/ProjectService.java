package com.example.demo.Service;


import com.example.demo.Models.ProjectModel;
import com.example.demo.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectService implements  ProjectServiceInterface{

    @Autowired
    ProjectRepository projectRepository;

    public List<ProjectModel> findAllProject(){
        return projectRepository.findAll();
    }

    public ProjectModel findProjectById(Integer id){
        Optional<ProjectModel> optional = projectRepository.findById(id);
        return optional.get();
    }

//    private void updateProjectById(Integer id){
//        projectRepository.
//    }

    public void createProject(ProjectModel projectModel){

        projectRepository.save(projectModel);
    }

    public void deleteProjectById(Integer id){
        projectRepository.deleteById(id);
    }

    public void updateProjectById(String name,Integer id){
        projectRepository.updatePProjectById(name,id);
    }
}
