package mypackage;

public class RetreiveList 
{
	String[] values = { "cat", "dog", "bird" };
	int[] sizes = { 100, 200, 300 };
	String[] myResArray = get().getStringArray(R.array.my_array);
	List<String> myResArrayList = Arrays.asList(myResArray);
}
//program not completed
