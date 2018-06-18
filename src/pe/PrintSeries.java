package pe;

public class PrintSeries {
	public static String printSeries(int a) {
		String series = "";
		for(int i=1; i<=a; i++)
			for(int j=i, k=1; k<=i; k++) 
				series+=j;
		
		return series;
	}

}
