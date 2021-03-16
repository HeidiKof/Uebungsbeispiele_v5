public class StrafeDemo {
    public static void main(String[] args) {
        Strafe Graz = new Strafe();

        Graz.nachname = "Simpson";
        Graz.vorname = "Homer";
        Graz.kennzeichen = "1D10T";
        Graz.strafnummer = 1234;
        Graz.strafe = 0;
        Graz.anzahl = 0;

        Graz.strafe(30);
        Graz.verbandspaket();
        Graz.alkohol(1.5);

        System.out.println(Graz.vorname + " " + Graz.nachname + " has to pay " + Graz.getStrafe() + " € for " + Graz.anzahl + " offenses.");



    }
}
