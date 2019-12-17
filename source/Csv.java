import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class Csv {
    public static void save(List<String> lozapisu, String sciezka) throws FileNotFoundException {
        FileOutputStream F = new FileOutputStream(new File(sciezka));
        PrintWriter p = new PrintWriter(F);

    }
    public static void zapiszKsiazki(List<Ksiazka>doZapisu) throws FileNotFoundException {
        FileOutputStream F = new FileOutputStream(new File("Ksiazka.csv"));
        PrintWriter p = new PrintWriter(F);
        for (int i = 0; i<doZapisu.size(); i++) {
            Ksiazka ksiazka = doZapisu.get(i);
            String nazwaKsiazki = ksiazka.getNazwaKsiazki();
            String autorKsiazki = ksiazka.getAutorKsiazki();
            String rodzajKsiazki = ksiazka.getRodzajKsiazki();
            String rokWydaniaKsiazki = ksiazka.getRokWydaniaKsiazki();
            String liczbaStronKsiazki = ksiazka.getLiczbaStronKsiazki();
            String liniaDozapisania =  nazwaKsiazki +","+autorKsiazki + ","+rodzajKsiazki+","+rokWydaniaKsiazki+","+liczbaStronKsiazki;
            p.println(liniaDozapisania);
            String[] split = "dasd,gfgfd,sdf,gfdg,rr".split(",");
            new Ksiazka(split[0],split[1],split[2],split[3],split[4]);
        }
        p.close();
    }
}
