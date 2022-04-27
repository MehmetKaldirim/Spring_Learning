package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository <Department,String>{

    //display all departments in the furniture department

    List<Department> findByDepartment(String department);

    //display all departments in the health division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //Display top three departments with division name includes Hae without duplication
    List<Department> findDistinctTop3ByDivisionContains(String pattern);
}
