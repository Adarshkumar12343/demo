package com.example.demo.Validator;

import com.example.demo.Models.ProjectModel;
import org.springframework.stereotype.Component;

@Component
public class ProjectModelValidator {
    public void validatePost(ProjectModel projectModel) throws Exception {
        if(projectModel.getName()==null){
            throw new Exception("Name can not be null");
        }
    }

    public void validateUpdate(Integer id) throws Exception {
        if(id>99999 || id<=0){
            throw new Exception("Id is either too large or to short");
        }
    }
}
