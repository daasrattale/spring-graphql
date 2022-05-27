package io.xrio.basicgraphql;

import lombok.Data;

import javax.persistence.*;

/**
 * @author : Elattar Saad (github/xrio)
 * @version 1.0
 * @since 27/5/2022 at 03:04
 */
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;

    // Lazy fetch to avoid having the infinite loop
    @OneToOne(fetch = FetchType.LAZY)
    private School school;

}
