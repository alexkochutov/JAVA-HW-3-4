package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.lang.model.type.NullType;

@NoArgsConstructor
@Getter
@Setter
public class Repository {
    private Film[] items = new Film[0];
    private int posterLimit = 10;

    public void save(Film item) {
        Film[] tempStorage = new Film[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            tempStorage[i] = items[i];
        }

        tempStorage[tempStorage.length - 1] = item;
        setItems(tempStorage);
    }

    public Film[] findAll() {
        return getItems();
    }

    public Film findByID(int ID) {
        Film result = null;

        if (items.length != 0) {
            for (int i = 0; i < items.length; i++) {
                if (items[i].getId() == ID) {
                    result = items[i];
                }
            }
        }
        return result;
    }

    public void removeByID(int ID) {
        if (items.length != 0) {
            Film[] tempStorage = new Film[items.length - 1];
            int tempIndex = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].getId() != ID) {
                    tempStorage[tempIndex] = items[i];
                    tempIndex++;
                }
            }
            items = tempStorage;
        }
    }

    public void removeAll() {
        if (items.length != 0) {
            Film[] eraser = new Film[0];
            items = eraser;
        }
    }
}
