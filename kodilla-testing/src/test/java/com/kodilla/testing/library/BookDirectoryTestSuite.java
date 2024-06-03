package com.kodilla.testing.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private BookLibrary bookLibrary;

    @BeforeEach
    void setUp() {
        bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    @Test
    void testListBooksInHandsOf_NoBooks() {
        // Given
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "1234567890");
        List<Book> resultListOfBooks = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(0, theListOfBooks.size());
    }

    @Test
    void testListBooksInHandsOf_OneBook() {
        // Given
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "1234567890");
        List<Book> resultListOfBooks = new ArrayList<>();
        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(1, theListOfBooks.size());
    }

    @Test
    void testListBooksInHandsOf_FiveBooks() {
        // Given
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "1234567890");
        List<Book> resultListOfBooks = new ArrayList<>();
        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        resultListOfBooks.add(new Book("Secrets of Python", "Guido van Rossum", 2005));
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(5, theListOfBooks.size());
    }
}
