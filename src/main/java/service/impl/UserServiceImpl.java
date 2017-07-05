package service.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import dao.UserDao;
import model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

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
                BeanUtils.copyProperties(userInfo, user);
                flag = (int) userInfo.getId();
            } else
                flag = -1;
        }

        return flag;
    }

    public boolean registerUser(User user) {
        userDao.addUser(user);
        return true;
    }

    public User getUserInfo(Integer userId) {
        return null;
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

}
