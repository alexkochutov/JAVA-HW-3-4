package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilmManager {
    private Film[] poster = new Film[0];
    private int posterLimit = 10;

    public FilmManager(int posterLimit) {
        this.setPosterLimit(posterLimit);
    }

    public void add(Film item) {
        Film[] tempStorage = new Film[poster.length + 1];
        System.arraycopy(poster, 0, tempStorage, 0, poster.length);
        tempStorage[tempStorage.length - 1] = item;
        setPoster(tempStorage);
    }

    public Film[] findAll() {
        return getPoster();
    }

    public Film[] findLast() {
        int resultArraySize;

        if (poster.length >= this.getPosterLimit()) {
            resultArraySize = this.getPosterLimit();
        } else {
            resultArraySize = poster.length;
        }

        Film[] resultArray = new Film[resultArraySize];
        for (int i = 0; i < resultArraySize; i++) {
            resultArray[i] = poster[poster.length - i - 1];
        }
        return resultArray;
    }
}