package service;

import dao.ExpressDao;
import model.ExpressInfo;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhang on 2017/6/22.
 */
@Service
public class ExpressServiceImpl implements ExpressService {
    @Autowired
    private ExpressDao expressDao;

    public void addExpress(ExpressInfo expressInfo) {
        expressDao.addExpress(expressInfo);
    }

    public void removeExpress(ExpressInfo expressInfo) {

    }

    public List<ExpressInfo> allExpressList() {
        return expressDao.allExpressList();
    }

    public List<ExpressInfo> getExpressByStation(int station) {
        return expressDao.getExpressByStation(station);
    }

    public List<ExpressInfo> getExpressByUser(User user) {
        return expressDao.getExpressByUser(user);
    }
}
