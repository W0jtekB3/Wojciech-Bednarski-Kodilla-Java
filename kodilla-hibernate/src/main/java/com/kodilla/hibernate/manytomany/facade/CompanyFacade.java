package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public List<Company> findCompaniesByNameFragment(String fragment) {
        String queryStr = "SELECT c FROM Company c WHERE c.name LIKE :nameFragment";
        TypedQuery<Company> query = entityManager.createQuery(queryStr, Company.class);
        query.setParameter("nameFragment", "%" + fragment + "%");
        return query.getResultList();
    }
}