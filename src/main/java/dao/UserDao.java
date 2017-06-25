package dao;

import model.User;

/**
 * Created by zhang on 2017/6/22.
 */
public interface UserDao {

    User getUser(User user);

    void addUser(User user);
}
