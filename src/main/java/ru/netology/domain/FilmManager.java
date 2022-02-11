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

    public void add(Film item) {
        Film[] tempStorage = new Film[poster.length + 1];

        for (int i = 0; i < poster.length; i++) {
            tempStorage[i] = poster[i];
        }

        tempStorage[tempStorage.length-1] = item;
        setPoster(tempStorage);
    }

    public Film[] showAll() {
        return getPoster();
    }
}
