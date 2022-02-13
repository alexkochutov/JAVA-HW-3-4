package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    /*
        Set of tests for covering save method
    */

    @Test
    void shouldSaveToEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        repo.save(first);
        Film[] expected = {first};
        assertArrayEquals(expected, repo.getItems());
    }

    @Test
    void shouldSaveToNonEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        repo.save(first);
        repo.save(second);
        Film[] expected = {first, second};
        assertArrayEquals(expected, repo.getItems());
    }

    /*
        Set of tests for covering findByID method
    */

    @Test
    void shouldNotFindByIDInEmptyPoster() {
        Repository repo = new Repository();
        Film expected = null;
        assertEquals(expected, repo.findByID(1));
    }

    @Test
    void shouldNotFindByIDInNonEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        repo.save(first);
        Film expected = null;
        assertEquals(expected, repo.findByID(3));
    }

    @Test
    void shouldFindByIDInNonEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        repo.save(first);
        Film expected = first;
        assertEquals(expected, repo.findByID(1));
    }

    /*
        Set of tests for covering findAll method
     */

    @Test
    void shouldFindAllInEmptyPoster() {
        Repository repo = new Repository();
        Film[] expected = {};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    void shouldFindAllInNonEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        repo.save(first);
        repo.save(second);
        repo.save(third);
        Film[] expected = {first, second, third};
        assertArrayEquals(expected, repo.findAll());
    }

    /*
        Set of tests for covering removeByID method
     */

    @Test
    void shouldRemoveByIDEmptyPoster() {
        Repository repo = new Repository();
        repo.removeByID(1);
        Film[] expected = {};
        assertArrayEquals(expected, repo.getItems());
    }

    @Test
    void shouldRemoveByIDOnlyOneItem() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        repo.save(first);
        repo.removeByID(1);
        Film[] expected = {};
        assertArrayEquals(expected, repo.getItems());
    }

    @Test
    void shouldRemoveByIDNonEmptyPosterFromFirstPosition() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.removeByID(1);
        Film[] expected = {second, third};
        assertArrayEquals(expected, repo.getItems());
    }

    @Test
    void shouldRemoveByIDNonEmptyPosterFromLastPosition() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.removeByID(3);
        Film[] expected = {first, second};
        assertArrayEquals(expected, repo.getItems());
    }

    /*
        Set of tests for covering removeAll method
     */

    @Test
    void shouldNotRemoveAllInEmptyPoster() {
        Repository repo = new Repository();
        repo.removeAll();
        Film[] expected = {};
        assertArrayEquals(expected, repo.getItems());
    }

    @Test
    void shouldRemoveAllInNonEmptyPoster() {
        Repository repo = new Repository();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.removeAll();
        Film[] expected = {};
        assertArrayEquals(expected, repo.getItems());
    }

}