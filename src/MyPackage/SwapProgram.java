package MyPackage;

public class SwapProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20; 
		System.out.println("before swap: "+ a);
		System.out.println("before swap: "+ b);
		
		a= b;
		int c= 10;
		b = c;
		// swap without temp. var
		/* a=b;
		b= b-10; */
		
		
		System.out.println("After swap: "+ a);
		System.out.println("After swap: "+ b);
	}

}
