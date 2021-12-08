package hashset;

import java.util.HashSet;

public class Hashset {

    public static void main(String[] args) {

        HashSet<String> furniture = new HashSet<String>();
        furniture.add("Chair");
        furniture.add("Table");

        System.out.println("Furniture Name:" + furniture);
        System.out.println(furniture.size());

        furniture.remove("Chair");
        System.out.println(furniture);

        furniture.clear();
        System.out.println(furniture);

        boolean value = furniture.isEmpty();
        System.out.println(value);
    }

}
