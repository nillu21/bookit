package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.domain.User;
import ee.taltech.spring.bookit.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("todo")
public class ToDoController {
    @Resource
    ToDoService service;

    @GetMapping(value = "/{id}")
    public String hello(Model model, @PathVariable Long id) {
        Todo todo = service.getToDoById(id);
        model.addAttribute(todo);
        return "index";
    }
    @GetMapping(value = "api/{id}")
    @ResponseBody
    public Todo hiThere(@PathVariable Long id) {

        return service.getToDoById(id);
    }
}
