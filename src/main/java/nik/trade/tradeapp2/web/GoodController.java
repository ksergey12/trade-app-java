package nik.trade.tradeapp2.web;


import nik.trade.tradeapp2.forms.GoodForm;
import nik.trade.tradeapp2.model.Good;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import nik.trade.tradeapp2.forms.GoodForm;
import nik.trade.tradeapp2.service.good.impl.GoodServiceImpl;
import nik.trade.tradeapp2.model.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class GoodController {
    @Autowired
    GoodServiceImpl goodService;


    @RequestMapping(value = {"/", "/index"}, method  = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "/good/list", method = RequestMethod.GET)
    public String goodList(Model model){
        model.addAttribute("goods", goodService.getAll() );
        return "goodList";
    }
   /*
    @RequestMapping(value = "/good/add", method = RequestMethod.GET)
    public String addGood(Model model){
        GoodForm goodForm= new GoodForm();

        Map<String, String> mavs = goodService.getAll().stream()
                .collect(Collectors.toMap(Good::getId,Good::getName));

        model.addAttribute("mavs", mavs);
        model.addAttribute("goodForm", goodForm);
        return "addGood";
    }
    */
    /*
    @RequestMapping(value = "/good/add", method = RequestMethod.POST)
    public String addGood(Model model,
                             @ModelAttribute("goodForm") GoodForm goodForm){
        Good good= goodService.get(goodForm.getName())
        Good good = goodService.get(goodForm.getGroup());

        Student newStudent = new Student(studentForm.getId(), studentForm.getName(), group);
        studentService.create(newStudent);
        model.addAttribute("students", studentService.getAll());
        return "studentList";
    }

    @RequestMapping(value = "/student/delete/{id}", method = RequestMethod.GET)
    public String deleteStudent(Model model, @PathVariable("id") String id){

        studentService.delete(id);

        model.addAttribute("students", studentService.getAll());
        return "studentList";
    }

    @RequestMapping(value = "/student/edit/{id}", method = RequestMethod.GET)
    public String editStudent(Model model, @PathVariable("id") String id){

        Student s = studentService.get(id);
        Map<String, String> mavs = groupService.getAll().stream()
                .collect(Collectors.toMap(Group::getId, Group::getName));


        StudentForm studentForm = new StudentForm();
        studentForm.setId(s.getId());
        studentForm.setName(s.getName());
        studentForm.setGroup(s.getGroup().getName());
        model.addAttribute("studentForm", studentForm);
        model.addAttribute("mavs", mavs);
        return "editStudent";
    }

    @RequestMapping(value = "/student/edit/{id}", method = RequestMethod.POST)
    public String editStudent(Model model,
                              @ModelAttribute("studentForm") StudentForm studentForm,
                              @PathVariable("id") String id){

        Student s = new Student();
        Group group = groupService.get(studentForm.getGroup());

        s.setId(studentForm.getId());
        s.setName(studentForm.getName());
        s.setGroup(group);
        studentService.update(s);
        model.addAttribute("studentForm", studentForm);
        return "studentList";
    }
*/
}


