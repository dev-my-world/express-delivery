package controller;

import model.User;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2017/6/19.
 */
@Controller
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public User login(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("passWord")
            String passWord)
            throws ServletException, IOException {
        User user = new User();
        user.setUserPhone(phoneNumber);
        user.setUserPsw(passWord);
        int userId = userService.validLogin(user);
        if (userId >= 0) {
            return user;
        } else {
            user.setId(-1L);
            return user;
        }


    }

}
