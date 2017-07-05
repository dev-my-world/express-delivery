package controller;

import model.Express;
import model.StationExpressCount;
import model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ExpressService;

import java.io.IOException;
import java.util.List;

/**
 * Created by zhang on 2017/6/24.
 */
@Controller
public class ExpressController {
    private ExpressService expressService;

    @Autowired
    public void setExpressService(ExpressService expressService) {
        this.expressService = expressService;
    }


    @RequestMapping(value = "/allExpress")
    @ResponseBody
    public List<Express> info() throws IOException {
        return expressService.allExpressList();
    }


    @RequestMapping(value = "/stationExpressCount")
    @ResponseBody
    public List<StationExpressCount> getStationExpressCount() {
        return expressService.getStationExpressCount();
    }

    @RequestMapping(value = "/addExpress")
    public void addExpress(
            @RequestParam("name") String name,
            @RequestParam("express") String express,
            @RequestParam("message") String message,
            @RequestParam("remark") String remark,
            @RequestParam("address") String address,
            @RequestParam("station") long station,
            @RequestParam("userId") long user_Id,
            @RequestParam("phone") String phone,
            @RequestParam("weight") long weight,
            @RequestParam("description") String description) {


        Express expressInfo = new Express();

        expressInfo.setName(name);
        expressInfo.setExpress(express);
        expressInfo.setMessage(message);
        expressInfo.setRemark(remark);
        expressInfo.setAddress(address);
        expressInfo.setStation(station);
        expressInfo.setUser_Id(user_Id);
        expressInfo.setPhone(phone);
        expressInfo.setWeight(weight);
        expressInfo.setDescription(description);

        expressService.addExpress(expressInfo);
    }

    @RequestMapping(value = "/alterExpress")
    public void alterExpressStatus(@RequestParam("id") Long id) {
        expressService.alterExpressStatus(id);
    }

    @RequestMapping(value = "/addTransaction")
    public void addTransaction(@RequestParam("eid") Long eid, @RequestParam("uid") Long uid) {
        expressService.alterExpressStatus(eid);
        Transaction transaction = new Transaction();
        transaction.setEid(eid);
        transaction.setUid(uid);
        expressService.addTransaction(transaction);
    }


    @RequestMapping(value = "/stationExpress")
    @ResponseBody
    public List<Express> getExpressListByStation(@RequestParam("station") Integer station) {
        return expressService.getExpressByStation(station);
    }


    @RequestMapping(value = "/userExpress")
    @ResponseBody
    public List<Express> getExpressListByUser(@RequestParam("uid") Integer uid) {
        return expressService.getExpressByUser(uid);
    }

    @RequestMapping(value = "/expressId")
    @ResponseBody
    public Express getExpressListById(@RequestParam("eid") Integer eid) {
        return expressService.getExpressById(eid);
    }

    @RequestMapping(value = "/collectedExpress")
    @ResponseBody
    public List<Express> getCollectedExpressListByUser(@RequestParam("uid") Integer uid) {
        return expressService.getCollectExpressByUser(uid);
    }



}
