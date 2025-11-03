// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim=  Integer.parseInt(args[0]);
		int a = (int) (Math.random () * lim );
		int b = (int) (Math.random () * lim );
		int c = (int) (Math.random () * lim );
		
		System.out.println(a + " " + b + " " + c);
		
		int min= Math.min((Math.min(a,b)), (Math.min(a,c)) );
		int max= Math.max((Math.max(a,b)), (Math.max(a,c)) );
		int middle= Math.min((Math.max(a,b)), (Math.max(a,c)) );

		System.out.println(min + " " + middle + " " + max );
		
	}
}
