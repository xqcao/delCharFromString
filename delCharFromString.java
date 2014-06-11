import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FoundWord {
	// the result is wrong, sometime no result,

	public static void main(String[] args) {
		String oldstring = "Battle of the Vowels: Hawaii vs. Grozny";
		String target = "aeiou";
		firstnonrepeate(oldstring, target);
	
		String word = "Do or do not, there is no try.";
		String[] arr = word.split(" ");
		List<String> alist = Arrays.asList(arr);
		System.out.println(alist);
		Collections.reverse(alist);
		arr = (String[]) alist.toArray();
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		String aaa = alist.toString();
		System.out.println(aaa);
	}
	private static void firstnonrepeate(String somechar, String todel) {
		String s = somechar;
		String d = todel;
		char[] abc = s.toCharArray();
		char[] dd = todel.toCharArray();
		
		for (int i = 0; i < d.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				/*if (i == j)
					continue;*/
				if (dd[i] == abc[j]) {
					//abc[i] = 32;//  0==Space bar at 
					abc[j] = 48;//48 = 0; 42 = *
					
				}			
			}
		}
		//System.out.println(abc);
		String aa = String.valueOf(abc);//from char[] to string
		System.out.println(s);
		// aa.trim();//delete Space bar at head and end,
		//System.out.println("first nonrepeat character is  ---   "+aa.trim().charAt(0));
		System.out.println(aa);
		System.out.println(aa.replaceAll("0", "")); //48 = 0
		
		
	}
}
