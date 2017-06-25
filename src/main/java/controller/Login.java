package controller;

import model.User;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2017/6/19.
 */
@Controller
public class Login {

    private @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public void login(@RequestParam("phoneNumber") String phoneNumber, @RequestParam("passWord")
            String passWord, HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        User user = new User();
        user.setUserPhone(phoneNumber);
        user.setUserPsw(passWord);
        resp.setContentType("text/html;charset=utf-8");
        int userId = userService.validLogin(user);
        if (userId >= 0) {
            req.getSession(true).setAttribute("userId", userId);
        }

        try {
            JSONObject jsonObject = new JSONObject().put("userId", userId);
            resp.getWriter().println(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
