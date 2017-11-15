import java.util.Arrays;
import java.util.Scanner;

public class StringDemoApp {

	public static void main(String[] args) {
		getString("Enter a string:  ");
		doStringBuilder();
		String name = "      Batman is   so     awesome!!!      ";
		if (name.toLowerCase().startsWith("b")) {
			System.out.println("starts with b");
		}
		name = name.trim();
		System.out.println("My name is "+name+".");
		//name = name.substring(5,10);
		System.out.println("substring example: "+name);
		System.out.println(name.indexOf("t"));
		System.out.println(name.lastIndexOf('a'));
		
		int a = name.indexOf("a");
		int b = name.indexOf('a', a+1);
		int c = name.indexOf('a', b+1);
		
		System.out.println(a + ", "+ b + ", "+ c);
		
		String ssid = "111-22-3333";
		int dashIdx1 = ssid.indexOf('-');
		int dashIdx2 = ssid.indexOf('-', dashIdx1+1);
		
		String ssid1 = ssid.substring(0, dashIdx1);
		String ssid2 = ssid.substring(dashIdx1+1,dashIdx2);
		String ssid3 = ssid.substring(dashIdx2+1);
		System.out.println(ssid1);
		System.out.println(ssid2);
		System.out.println(ssid3);
		
		String newName = name.replace('a', 'x');
		System.out.println(newName);
		
		String[] delimitedString = ssid.split("-");
		for (String s: delimitedString)
			System.out.println(s);
		
		System.out.println(Arrays.toString(delimitedString));
		
	}

	public static void doStringBuilder() {
		StringBuilder sb = new StringBuilder("Batman");
		sb.insert(3, "xxx");
		System.out.println(sb);
		sb.replace(3, 4, "rrr");
		System.out.println(sb);
		
	}
	
	   public static String getString(String prompt){
       		Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.print(prompt);
	            String s = sc.nextLine();
	            if (!s.isEmpty()) {
	                sc.close();
	                return s;
	            } else {
	                System.out.println("There was an error with your input. Please hit enter to refresh this prompt.");
	                System.out.println();
	                continue;
	            }
	        }
	    }
}
