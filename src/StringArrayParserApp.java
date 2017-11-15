
public class StringArrayParserApp {

	public static void main(String[] args) {
		String name = "David Lee Roth";
		String[] dString = name.split(" ");
		for (int i=0;i<dString.length; i++) {
			System.out.println(dString[i]);
		}

	}

}
