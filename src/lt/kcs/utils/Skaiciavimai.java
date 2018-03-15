package lt.kcs.utils;

import java.util.Scanner;

public class Skaiciavimai {

    public static boolean isNumberNegative (int numb){
        return numb > 0;
    }

    public static void daliklis(int daliklis, int skaiciuKiekis){
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite dalikli");

        int numb1 = input.nextInt();
        System.out.println("Kiek norite gauti skaiciu?");
        int numb2 = input.nextInt();
        int numb3 = numb1*numb2;

        for (int i=1;i<numb3+1;i++){
            if (i% numb1 ==0){
                System.out.println(i);
            }
        }

    }

}

//

//STATINIS NESTATINIO ISKVIESTI NEGALI TOJE PACIOJE KLASEJE
//class A{
// }
//kuriamas naujas klases objektas
//A a = new A();
//iskvieciama a.test("paduodam tipa")

//statinis statini iskviecia tiesiogiai per pavadinima


//i kita klase
//A.test("tipas");

//ne statinio iskv
//A pav = new A();

