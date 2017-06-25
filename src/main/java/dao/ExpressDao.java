package dao;

import model.ExpressInfo;
import model.User;

import java.util.List;

/**
 * Created by zhang on 2017/6/22.
 */
public interface ExpressDao {
    void addExpress(ExpressInfo expressInfo);

    void getExpress(ExpressInfo expressInfo);

    List<ExpressInfo> allExpressList();

    List<ExpressInfo> getExpressByStation(int station);

    List<ExpressInfo> getExpressByUser(User user);
}
