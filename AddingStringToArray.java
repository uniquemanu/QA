package mypackage;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayPackage 
{
    public static void main(String[] args) 
    {

        String[] values = { "cat", "dog", "bird" };
        // Create a one-element ArrayList.
        ArrayList<String> list = new ArrayList<>();
        list.add("elephant");
        System.out.println(list);

        // Add all elements to the ArrayList from an array.
        Collections.addAll(list, values);

        // Display our result.
        System.out.println(list);
    }
}