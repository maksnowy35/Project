public class User {
    String imie;
    String nazwisko;
    String nick;
    int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public User(String imie, String nazwisko, String nick, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nick = nick;
        this.wiek = wiek;
    }

}
//1. alt + insert (getter, setter) 2. constructor