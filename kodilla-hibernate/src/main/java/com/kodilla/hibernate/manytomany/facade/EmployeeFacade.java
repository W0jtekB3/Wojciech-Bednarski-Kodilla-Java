package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Service
public class EmployeeFacade {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public List<Employee> findEmployeesByNameFragment(String fragment) {
        String queryStr = "SELECT e FROM Employee e WHERE e.firstname LIKE :nameFragment OR e.lastname LIKE :nameFragment";
        TypedQuery<Employee> query = entityManager.createQuery(queryStr, Employee.class);
        query.setParameter("nameFragment", "%" + fragment + "%");
        return query.getResultList();
    }
}
