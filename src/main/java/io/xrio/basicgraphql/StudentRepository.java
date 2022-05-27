package io.xrio.basicgraphql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Elattar Saad (github/xrio)
 * @version 1.0
 * @since 27/5/2022 at 03:09
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
