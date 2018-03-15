package lt.kcs.utils;

public class MinKon {

    public static void main(String[] args) {

        atsDvimatMas();

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

    private static void printRectangle(int eilute, int stulpelis){

        for (int i=0; i<eilute;i++){

            for (int j=0; j<stulpelis;j++){

                System.out.print("#");
            }
            System.out.println(); //tuscias atspausdina eilutes
        }
    }

    private static void printUnevenRectangle(int eilute, int stulpelis){

        for (int i=1; i <= eilute;i++){

            int val = i % 2 == 0 ? stulpelis-3 : stulpelis;

            for (int j=0; j<val ; j++){

                System.out.print("#");  //print ne Ln
            }
            System.out.println(); //tuscias atspausdina eilutes
        }
    }

    //dvimates matricos atspausdinimas

    private static void atsDvimatMas(){

        int[][] matrica = new int[5][3];


        for (int i = 0; i < matrica.length; i++){
            for (int j = 0; j < matrica[i].length; j++){

                System.out.print(matrica[i][j]);
            }
            System.out.println();
        }
    }
}
