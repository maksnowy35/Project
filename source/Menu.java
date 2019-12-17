import java.util.Scanner;
public class Menu {
    Scanner scr = new Scanner(System.in);

    public void napis_1() {
        System.out.println("___________________");
        System.out.println("Witaj w bibliotece!");
        System.out.println("___________________");
    }
    public void napisWybory() {
        System.out.println("1 - Stworz uzytkownika");
        System.out.println("2 - Przejdz do biblioteki jako gosc");
        System.out.println("3 - Wyjdz");
    }
    public void wybor() {
        int wybor = scr.nextInt();
        switch (wybor) {
            case 1:

            case 2:

            case 3:
                System.exit(0);
        }
    }
    private void stworzUzytkownika() {
        String imie = scr.nextLine();
        String nazwisko = scr.nextLine();
        String nick = scr.nextLine();
        int wiek = scr.nextInt();
        User uzytkownik = new User(imie, nazwisko, nick, wiek);

    }
}
