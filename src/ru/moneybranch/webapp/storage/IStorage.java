package ru.moneybranch.webapp.storage;

import ru.moneybranch.webapp.model.Resume;

import java.util.Collection;

/**
 * stanley
 * 05.04.18.
 */
public interface IStorage {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();

}
