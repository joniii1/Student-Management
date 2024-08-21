package com.example.studentmanagement.Controller;


import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.StudentDAO;
import com.example.studentmanagement.Service.CourseService;
import com.example.studentmanagement.Repository.StudentRepository;
import com.example.studentmanagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
        private CourseService service;

    @Autowired
        private StudentService services;

    @Autowired
        private StudentRepository studentRepository;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String viewStudentPage(Model model)
    {
        List<StudentDAO> li= new ArrayList<>();
        for(Object[] o : studentRepository.findStudent()){
            StudentDAO student = new StudentDAO();
            student.setID(Long.parseLong(String.valueOf(o[0])));
            student.setStname((String)o[2]);
            li.add(student);
        }
        model.addAttribute("liststudent", li);
        return "student";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index ()
    {
        return "index";
    }

    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public String viewHomePage (Model Model)
    {
        List<Course> listcourse = service.listAll();
        Model.addAttribute("listcourse", listcourse);
        return "course";
    }

}
