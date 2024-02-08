package Array;

import java.util.ArrayList;

public class ClassA {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Mikita");
		a.add("Shastri");
		a.add("Selenium");
		a.add("Java");
		System.out.println(a.get(3));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			System.out.println(a.contains("ABCD"));
			
		}

		// TODO Auto-generated method stub

	}

}
