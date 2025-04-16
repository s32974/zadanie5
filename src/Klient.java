import java.util.ArrayList;
import java.util.List;

public class Klient {


    private String imię;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> listaRezerwacji = new ArrayList<>();


    public Klient(String imie, String nazwisko) {
        this.imię = imie;
        this.nazwisko = nazwisko;

    }

    public Klient(String imie, String nazwisko, String email) {
        this.imię = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(List<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dodajRezerwację(Wydarzenie wydarzenie) {

        listaRezerwacji.add(wydarzenie);

    }

    public void wyświetlRezerwacje() {

        listaRezerwacji.forEach(wydarzenie -> System.out.println(wydarzenie.getNazwa()));
    }

    public void anulujRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }


}
