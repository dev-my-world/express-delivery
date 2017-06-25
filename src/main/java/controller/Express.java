package controller;

import model.ExpressInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ExpressService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by zhang on 2017/6/24.
 */
@Controller
public class Express {
    @Autowired

    private ExpressService expressService;

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
            jsonObject.put("realName", expressInfo.getReal_name());
            jsonObject.put("expressName", expressInfo.getExpress_name());
            jsonObject.put("address", expressInfo.getAddress());
            jsonObject.put("remark", expressInfo.getRemark());
            jsonObject.put("phoneTail", expressInfo.getPhone_tail());
            jsonObject.put("pickupCode", expressInfo.getPickup_code());
            jsonObject.put("station", expressInfo.getStation());
            jsonArray.put(jsonObject);
        }
        response.getWriter().println(jsonArray);
    }

    @RequestMapping(value = "/addExpress")
    public void addExpress(@RequestParam("realName") String realName,
                           @RequestParam("expressName") String expressName,
                           @RequestParam("station") String station,
                           @RequestParam("address") String address,
                           @RequestParam("pickupCode") String pickupCode,
                           @RequestParam("remark") String remark,
                           @RequestParam("phoneTail") String phoneTail,
                           @RequestParam("userId") String userId, PrintWriter printWriter
    ) {
        ExpressInfo expressInfo = new ExpressInfo();
        expressInfo.setReal_name(realName);
        expressInfo.setExpress_name(expressName);
        expressInfo.setStation(Long.valueOf(station));
        expressInfo.setAddress(address);
        expressInfo.setRemark(remark);
        expressInfo.setPickup_code(Long.valueOf(pickupCode));
        expressInfo.setPhone_tail(Long.valueOf(phoneTail));
        expressInfo.setUser_id(Long.valueOf(userId));
        expressService.addExpress(expressInfo);

        printWriter.println(new JSONObject("true"));
    }

}
