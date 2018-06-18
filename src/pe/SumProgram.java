package pe;

public class SumProgram {
	public static int sumProgram(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(!(a[i] == (int)a[i])) 
				return 0;
			sum+=a[i];
		}
		return sum;
	}

}
