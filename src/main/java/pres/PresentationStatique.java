package pres;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetierImpl;
import metier.IMetier;

public class PresentationStatique {
    public static void main(String[] args) {

        IDao dao = new IDaoImpl();
        IMetier metier = new IMetierImpl(dao);


        System.out.println("Résultat du calcul : " + metier.calcul());
    }
}
