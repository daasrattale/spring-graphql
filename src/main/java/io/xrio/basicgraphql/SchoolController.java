package io.xrio.basicgraphql;

import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author : Elattar Saad (github/xrio)
 * @version 1.0
 * @since 27/5/2022 at 03:35
 */
@Controller
@AllArgsConstructor
public class SchoolController {

    SchoolRepository schoolRepository;

    @QueryMapping
    List<School> schools(){
        return schoolRepository.findAll();
    }
}
