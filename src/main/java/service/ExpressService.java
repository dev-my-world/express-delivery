package service;

import model.Express;
import model.StationExpressCount;
import model.Transaction;
import model.User;

import java.util.List;

/**
 * Created by zhang on 2017/6/22.
 */
public interface ExpressService {
    void addExpress(Express expressInfo);

    void removeExpress(Express expressInfo);

    List<Express> allExpressList();

    List<Express> getExpressByStation(int station);


    List<Express> getExpressByUser(Integer uid);

    Express getExpressById(Integer eid);



    List<Express> getCollectExpressByUser(Integer uid);


    List<StationExpressCount> getStationExpressCount();


    void alterExpressStatus(Long id);


    void addTransaction(Transaction transaction);

}
