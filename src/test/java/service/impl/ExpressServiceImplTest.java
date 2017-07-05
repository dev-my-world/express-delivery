package service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.ExpressService;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/7/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class ExpressServiceImplTest {
    @Autowired
    ExpressService expressService;

    @Test
    public void alterExpressStatus() throws Exception {
        expressService.alterExpressStatus(36L);
    }

}