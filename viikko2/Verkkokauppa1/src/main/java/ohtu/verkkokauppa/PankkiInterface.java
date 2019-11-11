package ohtu.verkkokauppa;

public interface PankkiInterface {

    boolean tilisiirto(String nimi, int viitenro, String tililta, String tilille, int summa);

}
