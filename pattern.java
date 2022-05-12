package newprojec;

public class pattern {

	public static void main(String[] args) {
	   int pattern=5;
	   int number =5;
	   for(int i=0; i<pattern;i++) {
		   for(int j=0; j<pattern;j--){
			   System.out.println((j/2));
		   }
		  System.out.println();
		  number -=1;
	   }

	}

}