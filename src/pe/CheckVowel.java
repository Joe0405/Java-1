package pe;

public class CheckVowel {
	public static void main(String[] args) {
		String s = checkVowel("ew");
		System.out.println(s);
	}
	
	public static String checkVowel(String s) {
		char[] s1 = s.toCharArray();
		String rValue ="";
		for(int i=0; i<s1.length; i++) {
			if (!((s1[i] >= 'a' && s1[i] <= 'z') || (s1[i] >= 'A' && s1[i] <= 'Z'))) {
		        System.out.println(s1[i] + " is not an alphabet");	
		        continue;
		} else {	
			switch (s1[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				rValue+= "Vowel ";
				break;
			default :
				rValue+= "Consonant ";
				break;	
			}
			
		}
		}		
		return rValue;	
	}
}
