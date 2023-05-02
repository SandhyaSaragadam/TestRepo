package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("sandhya");
		a.add("Tarun");
		a.add("vamsi");
		a.add("p");

		System.out.println(a.get(3));
		System.out.println(a.contains("selenium"));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		for (String val : a) {
			System.out.println(val);
		}

		String[] title = { "rahul", "shetty", "selenium" };
		for (String s : title) {
			System.out.println(s);
		}

		System.out.println("*************");

		String[] name = { "rahul", "shetty", "selenium" };
		List<String> nameArrayList = Arrays.asList(name);

	}
}
