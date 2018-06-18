package pe;

public class CheckNum {
	
	public static String checkNum(int a) {
		if(a>=20 && a<=30) {
			if(a%2!=0)
				return "Tom";
			else 
				return "Jerry";
		} else
			return "Number is not between 20 and 30";
	}

}
