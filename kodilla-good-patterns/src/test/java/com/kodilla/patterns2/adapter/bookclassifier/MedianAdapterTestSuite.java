package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        // Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "12345"));
        bookSet.add(new Book("Author2", "Title2", 2001, "23456"));
        bookSet.add(new Book("Author3", "Title3", 2002, "34567"));
        bookSet.add(new Book("Author4", "Title4", 2003, "45678"));
        bookSet.add(new Book("Author5", "Title5", 2004, "56789"));

        Classifier medianAdapter = new MedianAdapter();

        // When
        int median = medianAdapter.publicationYearMedian(bookSet);

        // Then
        assertEquals(2002, median);
    }
}