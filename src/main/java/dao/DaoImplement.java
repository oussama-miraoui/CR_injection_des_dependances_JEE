package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImplement implements IDao{

    @Override
    public double getData() {
        double res = Math.random()*100;
        System.out.println("version : bdd ");
        return res;
    }
}
