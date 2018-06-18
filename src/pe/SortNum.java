package pe;

public class SortNum {
	public static int sortNum(int a) {
		int t, sum=0, i, j, k;
   	    t=a;
		for(i=0; t>0; i++)
			t/=10;
		int[] temp = new int[i];
		t = a;
		for(j=0; j<i;j++) {
			temp[j] = t%10;
			t /= 10;
		}
		for(j=0; j<i; j++) 
			for(k=j; k<i; k++)
				if(temp[j]<temp[k]) {
					t = temp[j];
					temp[j] = temp [k];
					temp[k] = t;
				}
		t=0;
		for(j=0; j<i; j++) {
			if(temp[j]%2==0)
			    sum+=temp[j];
			t = t*10 + temp[j];
		}
		return t;
	}

}
