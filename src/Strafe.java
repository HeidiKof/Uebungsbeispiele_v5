public class Strafe {

    String vorname;
    String nachname;
    String kennzeichen;
    int strafnummer;
    double strafe;
    int anzahl;

    public void strafe (int geschwindigkeitsueberschreitung) {

        if (geschwindigkeitsueberschreitung < 20) {
            strafe = strafe + 30;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung >= 20 && geschwindigkeitsueberschreitung < 30) {
            strafe = strafe + 50;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung >= 30 && geschwindigkeitsueberschreitung < 50) {
            strafe = strafe + 100;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung >= 50 && geschwindigkeitsueberschreitung < 100) {
            strafe = strafe + 500;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung > 100) {
            strafe = strafe + 1500;
            anzahl++;
        } else {
            System.out.println("Please enter a valid number!");
        }
    }

    public void verbandspaket () {
        anzahl++;
        strafe = strafe + 25;
    }

    public void alkohol (double wert) {

        if (wert >= 0.5 && wert < 1) {
            strafe = strafe + 100;
            anzahl = anzahl +2;
        } else if (wert >= 1 && wert < 2) {
            strafe = strafe + 400;
            anzahl = anzahl +2;
        } else if (wert >= 2 && wert < 3) {
            strafe = strafe + 1000;
            anzahl = anzahl +2;
        } else if (wert >= 3) {
            strafe = strafe + 5000;
            anzahl = anzahl +2;
        } else {
            System.out.println("Please enter a valid value!");
        }
    }

    public void sonstiges (double wert) {
        anzahl++;
        strafe = strafe + wert;
    }

    public double getStrafe () {
        if (anzahl == 1) {
            strafe = strafe * 0.7;
        } else if (anzahl == 2) {
            strafe = strafe * 0.8;
        } else if (anzahl == 3) {
            strafe = strafe * 0.9;
        }
        return strafe;
    }
}
