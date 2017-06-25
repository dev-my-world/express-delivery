package service;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhang on 2017/6/22.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    public int validLogin(User user) {
        int flag = -1;
        User userInfo = userDao.getUser(user);
        if (userInfo != null) {
            if (userInfo.getUserPhone().equals(user.getUserPhone()) && userInfo.getUserPsw().equals(user.getUserPsw())) {
                flag = (int) userInfo.getUserId();
            } else
                flag = -1;
        }

        return flag;
    }

    public boolean registerUser(User user) {
        userDao.addUser(user);
        return true;
    }
}
