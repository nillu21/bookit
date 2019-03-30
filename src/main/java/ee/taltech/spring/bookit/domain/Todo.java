package ee.taltech.spring.bookit.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo {

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer done;

    public Todo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description=" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
