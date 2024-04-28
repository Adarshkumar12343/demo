package com.example.demo.Controller;

import com.example.demo.Exception.PMSException;
import com.example.demo.Models.ProjectModel;
import com.example.demo.Service.ProjectService;
import com.example.demo.Validator.ProjectModelValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/pms")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @Autowired
    ProjectModelValidator projectModelValidator;

    @GetMapping("/fetchAll")
    public List<ProjectModel> fetchAll(){
        return projectService.findAllProject();
    }

    @GetMapping("/fetchById/{id}")
    public ProjectModel fetch(@PathVariable Integer id){
        return projectService.findProjectById(id);
    }

    @PostMapping("/post")
    public void save(@RequestBody @Validated ProjectModel projectModel){
        try {
            projectModelValidator.validatePost(projectModel);
        } catch (Exception e) {
            throw new PMSException("Name can not be null");
        }
        projectService.createProject(projectModel);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
         projectService.deleteProjectById(id);
    }

    @PutMapping("/updateById/{id}/{name}")
    public void update(@PathVariable Integer id, @PathVariable String name){
        try {
            projectModelValidator.validateUpdate(id);
        } catch (Exception e) {
            throw new PMSException("Id is either too long or short.");
        }
        projectService.updateProjectById(name,id);
    }
}
