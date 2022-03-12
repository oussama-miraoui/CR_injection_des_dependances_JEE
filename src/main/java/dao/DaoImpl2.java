package dao;

import org.springframework.stereotype.Component;

//@Component("dao")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        double capt = 20;
        System.out.println("version : capteur ");
        return capt;
    }
}
