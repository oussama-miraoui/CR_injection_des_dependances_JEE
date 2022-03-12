package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImple implements IMetier{
    @Autowired
    private IDao dao;

    @Override
    public double calcul(){
        double data = dao.getData();
        double temp = data * 50;
        return temp;
    }

    //public MetierImple(IDao dao){
      //  this.dao = dao;
    //}

    public void setDao(IDao dao) {
       this.dao = dao;
    }
}
