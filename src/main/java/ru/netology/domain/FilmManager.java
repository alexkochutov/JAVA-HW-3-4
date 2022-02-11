package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FilmManager {
    private Film[] poster = new Film[0];
    private int posterLimit = 10;

    public FilmManager(int posterLimit) {
        this.posterLimit = posterLimit;
    }


}
