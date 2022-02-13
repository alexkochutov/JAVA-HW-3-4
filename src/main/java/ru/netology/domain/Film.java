package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Film {
    private int id;
    private String name;
    private String genre;
}
