package controller;

import model.User;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2017/6/21.
 */
@Controller
public class Register {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "register")
    public void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phoneNumber = req.getParameter("phoneNumber");
        String passWord = req.getParameter("passWord");
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        User user = new User();
        user.setUserPhone(phoneNumber);
        user.setUserPsw(passWord);

        userService.registerUser(user);

        try {
            JSONObject jsonObject = new JSONObject().put("register", "1");
            resp.getWriter().println(jsonObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
