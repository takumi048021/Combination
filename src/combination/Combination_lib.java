package combination;

public class Combination_lib {
  
  public int getFactorial(int n) {
	  int f = 1;
      if(n==f) {
    	  n = f;
      }else {
    	  n = n * getFactorial(n-1);	  
      }
      return n;
  }
}
