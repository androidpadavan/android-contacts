package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;

public interface ListDiffInterface<T> {
    boolean theSameAs(T other);

    boolean theSameAs(SortTypeUI other);

    boolean equals(Object obj);
}