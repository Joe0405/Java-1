package pe;

public class Palindrome {
		
		public static int[] extractNum(int a) {
			int temp = a, num = a, size, j = 0;
			for(j=0; num>0; j++) {
				num = num / 10;
			}
			size = j;
			temp = num = a;
			int[] arr = new int[size];
			for(int i=0; num>0; i++) {
				num = num / 10;
				 arr[i] = temp - (num*10);
				temp = temp/10;
			}
			return arr;
		}	
	  public static boolean[] checkPal(int[] ar) {
		  int l = ar.length, sum=0;
		  boolean[] result = {true, true};
		  for(int i=0; i <= l/2; i++) {
			  if(ar[i] != ar[l-1-i] )
				  result[0] = false;
			  if(ar[i]%2 == 0)
				  sum+=ar[i];
		  }
		  if(result[0] == true && sum*2 < 25) {
			  result[1] = false;
			  return result;	  
		  }  
		  else if(result[0] == true && sum*2 > 25) {
			  result[1] = true;
			  return result;
		  }
		  else
				return result;		
	  } 
}

