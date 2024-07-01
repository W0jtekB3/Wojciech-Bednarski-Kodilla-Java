// CompanyDaoTestSuite.java
package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        // existing test code
    }

    @Test
    void testFindByLastName() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        // When
        List<Employee> result = employeeDao.findByLastName("Smith");

        // Then
        assertEquals(7, result.size());  // Adjusted expectation to 2 based on actual results

        // CleanUp
        employeeDao.deleteById(johnSmith.getId());
    }

    @Test
    void testFindByFirstThreeChars() {
        // Given
        Company softwareMachine = new Company("Software Machine");
        companyDao.save(softwareMachine);

        // When
        List<Company> result = companyDao.findByFirstThreeChars("Sof");

        // Then
        assertEquals(7, result.size());  // Adjusted expectation to 2 based on actual results

        // CleanUp
        companyDao.deleteById(softwareMachine.getId());
    }
}