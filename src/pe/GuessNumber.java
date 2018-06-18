package pe;

public class GuessNumber {
	public static String guessNumber(int a, int b) {
		if(a>b)
			return "Guessed number is less";
		else if(a<b)
			return "Guessed number is more";
		else
			return "Guessed number is equal";
	}

}
