package JavaBeggining;

public class LearningArrays {

	public static void main(String[] args) {
		int[] x = new int[100];//0-99
		
		x[1]= 100;
		x[30] = 30;
	
	//another way
		//int[] x1= new int[] {10,20};
		
		System.out.println(x[2]);
		System.out.println(x[30]);
		
		String[] y = new String[] {"i","am","divi"};
		System.out.println(y[2]);
		
		String[] y1 = new String [3];
		y1[0]= "i";
		y1[1]= "am";
		y1[2]="divi";
		System.out.println(y1[2]);
		
		y = new String[10];
		System.out.println(y[1]); //will print null, new string created with old data deleted 
				
	}

}
