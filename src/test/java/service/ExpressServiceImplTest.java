package service;

import model.ExpressInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/6/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/*.xml")
public class ExpressServiceImplTest {
    @Autowired
    private ExpressService expressService;
    @Test
    public void addExpress() throws Exception {
        ExpressInfo expressInfo = new ExpressInfo();
        expressInfo.setName("lsisjf");
        expressInfo.setExpress("sfkdofs");
        expressInfo.setMessage("sfff");
        expressInfo.setRemark("fsfd");
        expressInfo.setAddress("sff");
        expressInfo.setStation(Long.valueOf("2"));
        expressInfo.setPhone("sdd");
        expressService.addExpress(expressInfo);
    }

}