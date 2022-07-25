package sets;

import java.util.HashSet;

public class Zadanie12 {
    public static void main(String[] args) {
        HashSet<String> potrawy = new HashSet<>();
        potrawy.add("barszcz");
        potrawy.add("Pierogi");
        potrawy.add("surówka");
        potrawy.add("gołąbki");
        potrawy.add("Mielone");
        potrawy.add("surówka");
        for (String potrawa : potrawy) {
            System.out.println(potrawa.substring(0, 1).toUpperCase() + potrawa.substring(1));
        }
    }
}
