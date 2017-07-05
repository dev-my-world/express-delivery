package dao;


import model.User;

/**
 * Created by zhang on 2017/6/22.
 */
public interface UserDao {

    User getUser(User user);


    User getUserById(Integer userId);

    void addUser(User user);

    void updateUser(User user);

}
