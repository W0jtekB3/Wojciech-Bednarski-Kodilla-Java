package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
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
public class CompanyFacadeTest {

    @Autowired
    private CompanyFacade companyFacade;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void testFindCompaniesByNameFragment() {
        // Given
        Company company1 = new Company("TechCorp");
        Company company2 = new Company("SoftTech");
        entityManager.persist(company1);
        entityManager.persist(company2);

        // When
        List<Company> result = companyFacade.findCompaniesByNameFragment("Tech");

        // Then
        assertFalse(result.isEmpty());
        assertTrue(result.stream().anyMatch(c -> c.getName().equals("TechCorp")));
        assertTrue(result.stream().anyMatch(c -> c.getName().equals("SoftTech")));
    }
}