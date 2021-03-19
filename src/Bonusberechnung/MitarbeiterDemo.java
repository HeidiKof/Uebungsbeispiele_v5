package Bonusberechnung;

public class MitarbeiterDemo {
    public static void main(String[] args) {

        Mitarbeiter mitarbeiter1 = new Mitarbeiter();

        mitarbeiter1.nachname = "";
        mitarbeiter1.vorname = "";
        mitarbeiter1.mitarbeiternummer = 1;
        mitarbeiter1.gehalt = 28000;
        mitarbeiter1.alter = 34;

        System.out.println("mitarbeiter1.monatsAbrechnung() = " + mitarbeiter1.monatsAbrechnung());
        System.out.println("mitarbeiter1.jahresAbrechnung() = " + mitarbeiter1.jahresAbrechnung());
    }
}
