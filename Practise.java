package prractise;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k[] = {1,2,4,6,8,9,10};
		for (int i = 0; i < k.length-1; i++) {
			int a = k[i];
			int b = k[i+1];
			int c = b-a;
			if (c>1) {
				int j= ++a;
				System.out.print(j);
				continue;
				
			}
			
			
		}
		
 
	}

}
