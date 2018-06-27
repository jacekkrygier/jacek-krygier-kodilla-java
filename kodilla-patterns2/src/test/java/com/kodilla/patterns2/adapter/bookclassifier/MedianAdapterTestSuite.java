package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Henryk Sienkiewicz", "Potop", 2000, "473141212"));
        books.add(new Book("Henryk Sienkiewicz", "Qvo vadis", 2007, "311134134"));
        books.add(new Book("William Shakespeare", "Hamlet", 1991, "678943321"));
        books.add(new Book("William Shakespeare", "Makbet", 2010, "137456745"));
        books.add(new Book("Adam Mickiewicz", "Dziady", 2001, "541231233"));
        books.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 1996, "164564564"));
        books.add(new Book("Bolesław Prus", "Faraon", 2004, "734534554"));
        //When
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2001, result);
    }
}