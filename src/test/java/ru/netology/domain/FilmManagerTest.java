package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    /*
     * Set of test for covering add method
     */

    @Test
    void shouldAddToEmptyManager() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.getPoster());
    }

    @Test
    void shouldAddToNonEmptyManager() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        manager.add(first);
        manager.add(second);

        Film[] expected = {first,second};
        assertArrayEquals(expected, manager.getPoster());
    }

    /*
     * Set of test for covering findAll method
     */

    @Test
    void shouldFindAllEmptyResultWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film[] expected = {};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllEmptyResultWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film[] expected = {};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllLessThenLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllLessThenLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllEqualLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");
        Film seventh = new Film(7, "seventh", "seventh");
        Film eight = new Film(8, "eight", "eight");
        Film nine = new Film(9, "nine", "nine");
        Film tenth = new Film(10, "tenth", "tenth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(tenth);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eight, nine, tenth};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllEqualLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Film[] expected = {first, second, third, fourth, fifth};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllMoreThenLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");
        Film seventh = new Film(7, "seventh", "seventh");
        Film eight = new Film(8, "eight", "eight");
        Film nine = new Film(9, "nine", "nine");
        Film tenth = new Film(10, "tenth", "tenth");
        Film eleventh = new Film(11, "eleventh", "eleventh");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(tenth);
        manager.add(eleventh);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eight, nine, tenth, eleventh};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void shouldFindAllMoreThenLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Film[] expected = {first, second, third, fourth, fifth, sixth};
        assertArrayEquals(expected, manager.findAll());
    }

    /*
     * Set of test for covering findLast method
     */

    @Test
    void shouldFindLastEmptyResultWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film[] expected = {};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastEmptyResultWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film[] expected = {};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastLessThenLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastLessThenLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastEqualLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");
        Film seventh = new Film(7, "seventh", "seventh");
        Film eight = new Film(8, "eight", "eight");
        Film nine = new Film(9, "nine", "nine");
        Film tenth = new Film(10, "tenth", "tenth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(tenth);

        Film[] expected = {tenth, nine, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastEqualLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Film[] expected = {fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastMoreThenLimitWithDefaultConstructor() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");
        Film seventh = new Film(7, "seventh", "seventh");
        Film eight = new Film(8, "eight", "eight");
        Film nine = new Film(9, "nine", "nine");
        Film tenth = new Film(10, "tenth", "tenth");
        Film eleventh = new Film(11, "eleventh", "eleventh");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(nine);
        manager.add(tenth);
        manager.add(eleventh);

        Film[] expected = {tenth, nine, eight, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void shouldFindLastMoreThenLimitWithCustomConstructor() {
        FilmManager manager = new FilmManager(5);
        Film first = new Film(1, "first", "first");
        Film second = new Film(2, "second", "second");
        Film third = new Film(3, "third", "third");
        Film fourth = new Film(4, "fourth", "fourth");
        Film fifth = new Film(5, "fifth", "fifth");
        Film sixth = new Film(6, "sixth", "sixth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        Film[] expected = {fifth, fourth, third, second, first};
        assertArrayEquals(expected, manager.findLast());
    }
}