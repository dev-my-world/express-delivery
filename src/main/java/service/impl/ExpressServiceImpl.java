package service.impl;

import dao.ExpressDao;
import model.Express;
import model.StationExpressCount;
import model.Transaction;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ExpressService;

import java.util.List;

/**
 * Created by zhang on 2017/6/22.
 */
@Service
public class ExpressServiceImpl implements ExpressService {
    @Autowired
    private ExpressDao expressDao;

    public void addExpress(Express expressInfo) {
        expressDao.addExpress(expressInfo);
    }

    public void removeExpress(Express expressInfo) {

    }

    public List<Express> allExpressList() {
        return expressDao.allNotCollectExpressList();
    }

    public List<Express> getExpressByStation(int station) {
        return expressDao.getExpressByStation(station);
    }

    public List<Express> getExpressByUser(Integer uid) {
        return expressDao.getExpressByUser(uid);
    }

    public Express getExpressById(Integer eid) {
        return expressDao.getExpressById(eid);
    }

    public List<Express> getCollectExpressByUser(Integer uid) {
        return expressDao.getCollectExpress(uid);
    }

    public List<StationExpressCount> getStationExpressCount() {
        return expressDao.getExpressStationCount();
    }

    public void alterExpressStatus(Long id) {
        expressDao.updateExpress(id);
    }

    public void addTransaction(Transaction transaction) {
        expressDao.addTransaction(transaction);
    }
}
