import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacji {

    private List<Wydarzenie> wydarzenia = new ArrayList<Wydarzenie>();
    private List<Klient> klijęci = new ArrayList<Klient>();


    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, String data, double cena) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena, data);
        wydarzenia.add(wydarzenie);
    }


    public void dodajKlient(Klient klient) {
        klijęci.add(klient);
    }

    public void dodajKlient(String imię, String nazwisko) {
        Klient klient = new Klient(imię, nazwisko);
        klijęci.add(klient);
    }


    public void dokonajRezerwacji(Klient klient, Wydarzenie
            wydarzenie) {
        klient.dodajRezerwację(wydarzenie);
    }


public void znajdzWydarzenie(String nazwa){

}





    public List<Wydarzenie> getWydarzenia() {
        return wydarzenia;
    }

    public void setWydarzenia(List<Wydarzenie> wydarzenia) {
        this.wydarzenia = wydarzenia;
    }

    public List<Klient> getKlijęci() {
        return klijęci;
    }

    public void setKlijęci(List<Klient> klijęci) {
        this.klijęci = klijęci;
    }


}
