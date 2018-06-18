package pe;

public class StringSeries {
	public static String stringSeries(String a, int b) {
		String series = a, repeat = "";
		int l = a.length();
		repeat = a.substring(b,l);
		for(int i=0; i<b; i++)
			series+=repeat;
		return series;
		
	}

}
