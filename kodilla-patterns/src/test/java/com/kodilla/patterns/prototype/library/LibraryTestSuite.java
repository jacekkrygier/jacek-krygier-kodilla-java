package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("Odyseja", "Homer", LocalDate.of(1997, 4,5));
        Book book2 = new Book("Hamlet", "William Shakespeare",LocalDate.of(2003,3,28));
        Book book3 = new Book("Faraon", "Boleslaw Prus", LocalDate.of(2008,12,2));
        Book book4 = new Book("Ogniem i mieczem","Henryk Sienkiewicz", LocalDate.of(1995, 5,13));
        Book book5 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", LocalDate.of(1999,1,28));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());



    }
}
