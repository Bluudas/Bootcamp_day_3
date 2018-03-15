import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); //LinkedList saugo indeksus pries ir po

        names.add("Andrius");
        names.add("Adrius");
        names.add("Arius");
        names.add("Aius");
        names.add("Aus");
        Collections.sort(names); // surikiuoja pries spausdinant
        Collections.reverse(names); // atbulidinis rikiavimas

        for (String name: names){  //name: laikinas kintamasis
            System.out.println(name);
        }

        System.out.println(names.get(2));

        System.out.println(names.size());

        System.out.println(names.isEmpty()); //grazina true jei kolekcija tuscia

        System.out.println(names.contains("Jonas")); //grazintu true jei liste butu atitikmuo

        //SETAS SAUGO TIK UNIKALIUS IRASUS
        //IS SETO NEISTRAUKSI PAGAL INDEKSA
        //SETO NEPAREVERTINSI





    }
}
