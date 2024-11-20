package prractise;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int k =4;
		boolean r =false;
		
		for(int i=2; i<k; i++)
		{
			if(k%i==0) {
				r=true;
				break;
			}
		}
			if(r==false) {
				System.out.println(" prime Number");
			}else{			
				System.out.println("NOt prime Number");
			}
			
				
			}
	
}
