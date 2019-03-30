package ee.taltech.spring.bookit.repository;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
