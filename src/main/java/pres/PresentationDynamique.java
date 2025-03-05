package pres;

import dao.IDao;
import metier.IMetier;

import java.io.FileInputStream;
import java.util.Properties;

public class PresentationDynamique {
    public static void main(String[] args) {
        try {
            // Charger le fichier de configuration
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));

            // Charger dynamiquement les classes
            Class<?> cDao = Class.forName(properties.getProperty("daoClass"));
            Class<?> cMetier = Class.forName(properties.getProperty("metierClass"));

            // Instancier les objets
            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor(IDao.class).newInstance(dao);

            // Utilisation
            System.out.println("Résultat du calcul : " + metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
