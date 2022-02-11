package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void shouldAddFilms() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "film", "film");
        Film second = new Film(2, "film", "film");
        Film third = new Film(3, "film", "film");
        Film fourth = new Film(4, "film", "film");
        Film fifth = new Film(5, "film", "film");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Film[] expected = {first, second, third, fourth, fifth};
        assertArrayEquals(expected, manager.getPoster());
    }

    @Test
    void shouldShowAll() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1, "film", "film");

        manager.add(first);

        Film[] expected = {first};
        assertArrayEquals(expected, manager.getPoster());
    }
}