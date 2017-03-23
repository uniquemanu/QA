package mypackage;

import java.util.ArrayList;

public class IntString {
    public static void main(String[] args) {

        // An int array.
        int[] sizes = { 100, 200, 300 };

        // Create an Integer ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);

        System.out.println(list);

        // Loop over our array and add each element separately.
        for (int element : sizes) {
            list.add(element);
        }

        // The final list.
        System.out.println(list);
    }
}