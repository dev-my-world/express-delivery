package controller;

import model.ExpressInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ExpressService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by zhang on 2017/6/24.
 */
@Controller
public class Express {
    private ExpressService expressService;

    @Autowired
    public void setExpressService(ExpressService expressService) {
        this.expressService = expressService;
    }


    @RequestMapping(value = "/allExpress")
    public void info(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        JSONArray jsonArray = new JSONArray();
        List<ExpressInfo> expressInfos = expressService.allExpressList();

        for (ExpressInfo expressInfo : expressInfos) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", expressInfo.getId());
            jsonObject.put("name", expressInfo.getName());
            jsonObject.put("express", expressInfo.getExpress());
            jsonObject.put("address", expressInfo.getAddress());
            jsonObject.put("remark", expressInfo.getRemark());
            jsonObject.put("phone", expressInfo.getPhone());
            jsonObject.put("message", expressInfo.getMessage());
            jsonObject.put("station", expressInfo.getStation());
            jsonArray.put(jsonObject);
        }
        response.getWriter().println(jsonArray);
    }

    @RequestMapping(value = "/addExpress", method = RequestMethod.POST)
    public void addExpress(HttpServletRequest request, HttpServletResponse httpServletResponse
    ) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String express = request.getParameter("express");
        String message = request.getParameter("message");
        String remark = request.getParameter("remark");
        String address = request.getParameter("address");
        String station = request.getParameter("station");
        String phone = request.getParameter("phone");
        ExpressInfo expressInfo = new ExpressInfo();
        expressInfo.setName(name);
        expressInfo.setExpress(express);
        expressInfo.setMessage(message);
        expressInfo.setRemark(remark);
        expressInfo.setAddress(address);
        expressInfo.setStation(Long.valueOf(station));
        expressInfo.setPhone(phone);
        expressService.addExpress(expressInfo);
    }

}
