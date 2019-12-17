public class Ksiazka {
    private String nazwaKsiazki;
    private String autorKsiazki;
    private String rodzajKsiazki;
    private String rokWydaniaKsiazki;
    private String liczbaStronKsiazki;

    public Ksiazka(String nazwaKsiazki, String autorKsiazki, String rodzajKsiazki, String rokWydaniaKsiazki, String liczbaStronKsiazki) {
        this.nazwaKsiazki = nazwaKsiazki;
        this.autorKsiazki = autorKsiazki;
        this.rodzajKsiazki = rodzajKsiazki;
        this.rokWydaniaKsiazki = rokWydaniaKsiazki;
        this.liczbaStronKsiazki = liczbaStronKsiazki;
    }

    public String getNazwaKsiazki() {
        return nazwaKsiazki;
    }

    public String getAutorKsiazki() {
        return autorKsiazki;
    }

    public String getRodzajKsiazki() {
        return rodzajKsiazki;
    }

    public String getRokWydaniaKsiazki() {
        return rokWydaniaKsiazki;
    }

    public String getLiczbaStronKsiazki() {
        return liczbaStronKsiazki;
    }

    @Override
    public String toString() {
        return '\n'+
                "Ksiazka: " +
                "Tytul: " + nazwaKsiazki + '\n' +
                " Autor: " + autorKsiazki + '\n' +
                " Rodzaj: " + rodzajKsiazki + '\n' +
                " Rok wydania: " + rokWydaniaKsiazki + '\n' +
                " Liczba stron ksiazki: " + liczbaStronKsiazki + '\n';
    }
}