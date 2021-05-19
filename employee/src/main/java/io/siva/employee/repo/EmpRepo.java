package io.siva.employee.repo;

import io.siva.employee.entity.EntityCalc;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<EntityCalc,Long> {
}
