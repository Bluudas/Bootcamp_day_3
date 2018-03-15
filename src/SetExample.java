import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(); //NAUJO HASH SETO SUKURIMAS

        hashSet.add(123);
        hashSet.add(1);
        hashSet.add(123);
        hashSet.add(12);
        hashSet.add(123);
        hashSet.add(3);

        System.out.println("ilgis " + hashSet.size());

        for (Integer a :hashSet){
            System.out.println(a);
        }
    }
}
