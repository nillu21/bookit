package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ToDoService {
    @Resource
    TodoRepository repo;

    public Todo getToDoById(long id) {

        return repo.getOne(id);
    }

    public List<Todo> getToDos() {
        return repo.findAll();
    }


    public Todo addTodo(Todo todo) {
        return repo.save(todo);
    }
}
