package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilmManager {
    private Repository repo = new Repository();

    public FilmManager(Repository repo) {
        this.setRepo(repo);
    }

    public void save(Film item) {
        repo.save(item);
    }

    public Film[] findAll() {
        return repo.findAll();
    }

    public Film findByID(int ID) {
        return repo.findByID(ID);
    }

    public void removeByID(int ID) {
        repo.removeByID(ID);
    }

    public void removeAll() {
        repo.removeAll();
    }
}
