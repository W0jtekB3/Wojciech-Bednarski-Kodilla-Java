package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class EmployeeFacadeTest {

    @Autowired
    private EmployeeFacade employeeFacade;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testFindEmployeesByNameFragment() {
        // Given
        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jane", "Doe");
        entityManager.persist(employee1);
        entityManager.persist(employee2);

        // When
        List<Employee> result = employeeFacade.findEmployeesByNameFragment("Doe");

        // Then
        assertFalse(result.isEmpty());
        assertTrue(result.stream().anyMatch(e -> e.getLastname().equals("Doe")));
    }
}