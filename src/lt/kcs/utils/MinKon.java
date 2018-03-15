package lt.kcs.utils;

public class MinKon {

    public static void main(String[] args) {

        minuciuKonverteris(1563);

    }

    public static void minuciuKonverteris(int sveikasSkaicius){

        int diena = 1440;
        int valanda = 60;
        int minutes = 1;

        int kiekDienu = sveikasSkaicius/diena;
        int kiekValandu = (sveikasSkaicius - (kiekDienu*diena))/valanda;
        int kiekMinuciu = (sveikasSkaicius - kiekDienu*diena) - (kiekValandu*valanda);

        System.out.println(kiekDienu + " dienu " + kiekValandu + " valandu " + kiekMinuciu + " minuciu");


    }
}
