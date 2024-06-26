package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        // Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        productDao.save(product1);
        productDao.save(product2);

        Item item1 = new Item(product1, new BigDecimal(100), 2, new BigDecimal(200));
        Item item2 = new Item(product2, new BigDecimal(50), 3, new BigDecimal(150));

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Invoice invoice = new Invoice("001");
        invoice.setItems(items);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        // When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // Then
        assertNotEquals(0, id);

        // CleanUp
        invoiceDao.deleteById(id);
    }
}