package service;

import model.ExpressInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by zhang on 2017/6/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class ExpressServiceImplTest {
    @Autowired
    private ExpressService expressService;

    @Test
    public void addExpress() throws Exception {
    }

    @Test
    public void removeExpress() throws Exception {
    }

    @Test
    public void allExpressList() throws Exception {
        List<ExpressInfo> expressInfos = expressService.allExpressList();

        JSONArray jsonArray = new JSONArray();
        for (ExpressInfo expressInfo : expressInfos) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", expressInfo.getId());
            jsonObject.put("realName", expressInfo.getReal_name());
            jsonObject.put("expressName", expressInfo.getExpress_name());
            jsonObject.put("address", expressInfo.getAddress());
            jsonObject.put("remark", expressInfo.getRemark());
            jsonObject.put("phoneTail", expressInfo.getPhone_tail());
            jsonObject.put("pickupCode", expressInfo.getPickup_code());
            jsonArray.put(jsonObject);
        }
        System.out.println(jsonArray.toString());
    }

    @Test
    public void getExpressByStation() throws Exception {
    }

    @Test
    public void getExpressByUser() throws Exception {
    }

}