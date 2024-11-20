package prractise;

public class MethodsAndObjects {
	
	public String add(int a, int b ) {
		// TODO Auto-generated method stub
		int  c= a+b;
		return "addition answer is  "+ c;
	}
	public void sub() {
		// TODO Auto-generated method stub

	}
	public void mul() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
		MethodsAndObjects cal = new MethodsAndObjects();
		String add = cal.add(1, 2);
		System.out.println(add);
	}

}
