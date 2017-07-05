package dao;

import model.Express;
import model.StationExpressCount;
import model.Transaction;
import model.User;

import java.util.List;

/**
 * Created by zhang on 2017/6/22.
 */
public interface ExpressDao {
    void addExpress(Express express);

    List<Express> allNotCollectExpressList();


    void addTransaction(Transaction transaction);


    void updateExpress(Long id);


    List<StationExpressCount> getExpressStationCount();


    List<Express> getExpressByUser(Integer uid);


    Express getExpressById(Integer id);


    List<Express> getCollectExpress(Integer uid);



    List<Express> getExpressByStation(Integer id);
}
