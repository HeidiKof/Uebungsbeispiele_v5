package Bonusberechnung;

public class Mitarbeiter {

    String vorname;
    String nachname;
    int mitarbeiternummer;
    double gehalt;
    int alter;

    public double monatsAbrechnung() {
        gehalt *= 0.8;
        if (gehalt < 10000) {
            gehalt *= 0.9;
        } else if (gehalt >= 10000 && gehalt < 20000) {
            gehalt = gehalt - 10000;
            gehalt *= 0.8;
            gehalt = gehalt + 9000;
        } else if (gehalt >= 20000 && gehalt < 30000) {
            gehalt = gehalt - 20000;
            gehalt *= 0.68;
            gehalt = gehalt + 17000;
        } else if (gehalt >= 30000 && gehalt <= 50000) {
            gehalt = gehalt - 30000;
            gehalt *= 0.55;
            gehalt = gehalt + 23800;
        } else if (gehalt >= 50001) {
            gehalt = gehalt - 50001;
            gehalt *= 0.4;
            gehalt = gehalt + 34801;
        } else {
            System.out.println("Ungültige Eingabe");
        }
        return gehalt;
    }

    public double jahresAbrechnung() {
        double jahresgehalt = monatsAbrechnung();
        jahresgehalt *= 12;
        return jahresgehalt;
    }
}
