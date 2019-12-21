import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Biblioteka {
    public static void main(String[] args) throws FileNotFoundException {
        List<Ksiazka> listaKsiazek = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int wybor;
        petla: while (true) {
            while (true) {
                System.out.println("1. Stworz nowa ksiazke\n2. Pokaz moje ksiazki\n3. Wyjdz z programu");
                System.out.println("Ktora akcje chcesz wykonac?");
                String nazwaOperacji = scanner.nextLine();
                try {
                    wybor = Integer.parseInt(nazwaOperacji);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Bledny wybor");
                }
            }

            switch (wybor) {
                case 1:
                    System.out.println("Tworzenie ksiazki:");
                    System.out.println("Podaj nazwe ksiazki:");
                    String nazwaKsiazki = scanner.nextLine();
                    System.out.println("Podaj autora ksiazki:");
                    String autorKsiazki = scanner.nextLine();
                    System.out.println("Podaj rodzaj ksiazki:");
                    String rodzajKsiazki = scanner.nextLine();
                    System.out.println("Podaj rok wydania ksiazki:");
                    String rokWydaniaKsiazki = scanner.nextLine();
                    System.out.println("Podaj liczbe stron ksiazki:");
                    String liczbaStronKsiazki = scanner.nextLine();
                    System.out.println("Ksiazka zostala dodana do biblioteki");
                    Ksiazka ksiazka1 = new Ksiazka(nazwaKsiazki, autorKsiazki, rodzajKsiazki, rokWydaniaKsiazki, liczbaStronKsiazki);
                    listaKsiazek.add(ksiazka1);

                    break;
                case 2:
                    System.out.println("Masz dodane" + " " + listaKsiazek.size() + " " + "ksiazek. Oto ich lista");
                    System.out.println(listaKsiazek);
                    break;
                case 3:
                    break petla;
                default:
                    System.out.println("Bledna operacja");
            }
        }
        Csv.zapiszKsiazki(listaKsiazek);
    }
}