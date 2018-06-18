package pe;

public class CheckChar {
	public static String checkChar(char a) {
		if(a>='a' && a<='z')
			return "Small Letter";
		else if(a>='A' && a<='Z')
			return "Capital Letter";
		else if(a>='0' && a<='9')
				return "Number";
		else
			return "Special Character";
	}

}
