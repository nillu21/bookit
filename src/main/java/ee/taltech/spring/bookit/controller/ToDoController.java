package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.domain.User;
import ee.taltech.spring.bookit.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("todoList")
public class
ToDoController {
    @Resource
    ToDoService service;

    @GetMapping(value = "/{id}")
    public String hello(Model model, @PathVariable Long id) {
        Todo todo = service.getToDoById(id);
        model.addAttribute(todo);
        return "todo";
    }
    @GetMapping(value = "api/{id}")
    @ResponseBody
    public Todo hiThere(@PathVariable Long id) {

        return service.getToDoById(id);
    }

    @GetMapping()
    public String getAllTodos(Model model) {
        List<Todo> allTodos = service.getToDos();
        model.addAttribute("todos", allTodos);
        return "todoList";
    }

    @PostMapping("form")
    public @ResponseBody Todo addTodo(@ModelAttribute Todo todo) {
        Todo result = service.addTodo(todo);
        return result;
    }

    @GetMapping("form")
    public String getForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "form";
    }
}
