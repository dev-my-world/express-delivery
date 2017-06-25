package service;

import model.User;

/**
 * Created by zhang on 2017/6/22.
 */
public interface UserService {
    int validLogin(User user);

    boolean registerUser(User user);
}
