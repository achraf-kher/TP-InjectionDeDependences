package metier;

import dao.IDao;
import org.springframework.stereotype.Service;


@Service("metier")
public class IMetierImpl implements IMetier {
    private IDao dao;


    public IMetierImpl() {
    }
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 10;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}