package pe;

public class StringReverse {
	public static String stringReverse(String a) {
		String reverse = "";
		int l= a.length();
		for(int i=l-1; i>=0; i--)
			reverse+=a.charAt(i);
		return reverse;
	}

}
