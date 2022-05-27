package io.xrio.basicgraphql;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Elattar Saad (github/xrio)
 * @version 1.0
 * @since 27/5/2022 at 03:05
 */
@Entity
@Data
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToMany
    private List<Student> students;


    public School(String name) {
        this.name = name;
    }

}
