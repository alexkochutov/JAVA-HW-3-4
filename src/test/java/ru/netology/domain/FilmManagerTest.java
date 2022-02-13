package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class FilmManagerTest {
    @Mock
    private Repository repository;
    @InjectMocks
    private FilmManager manager;
    private Film first = new Film(1, "first", "first");
    private Film second = new Film(2, "second" ,"second");
    private Film third = new Film(3, "third", "third");

    @Test
    public void shouldFindAll() {
        Film[] returned = new Film[]{first, second, third};
        doReturn(returned).when(repository).findAll();

        Film[] expected = {first, second, third};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByID() {
        Film returned = second;
        doReturn(returned).when(repository).findByID(2);

        Film expected = second;
        Film actual = manager.findByID(2);
        assertEquals(expected, actual);
    }

}