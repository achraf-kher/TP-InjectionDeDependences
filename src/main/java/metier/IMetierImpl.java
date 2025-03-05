package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;


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