package corejava;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      
		    int a1[][] = {{3,4,8},{5,2,8},{1,7,4}}	;  
    		int min = a1[0][0];
    		int minimum = 0;

		      for(int i=0;i<3;i++) {

		    	  for(int j=0;j<3;j++) {

		    		  if(a1[i][j]<min)	{
		    			     min = a1[i][j];
		    			     minimum = j;
		    		  }
		    	  
		    		  }

	}
		      System.out.println(min+"min:");
		      int k= 0;
		      int max = a1[k][minimum];
		      while(k<3) {
		    	  if(a1[k][minimum]>max) {
		    		  
		    		  max = a1[k][minimum];
		    	  }
		    	  k++;
		      }
		      
		      System.out.println(max+"max:");

}
}
