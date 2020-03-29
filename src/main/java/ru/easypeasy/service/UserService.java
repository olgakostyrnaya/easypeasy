package ru.easypeasy.service;

import ru.easypeasy.model.User;

public interface UserService {

    void add(User user);

    void block(User user);

    void delete(User user);
}
