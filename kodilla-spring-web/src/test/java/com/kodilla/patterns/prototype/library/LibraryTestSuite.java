package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("My Library");
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2021, 1, 1));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2022, 2, 2));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2023, 3, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        // Making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.name = "Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // Making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Deep Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

        assertNotSame(library, clonedLibrary);
        assertNotSame(library, deepClonedLibrary);
        assertNotSame(clonedLibrary, deepClonedLibrary);
    }
}