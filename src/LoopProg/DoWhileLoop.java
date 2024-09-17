package LoopProg;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<= 10);
	}

	/*int i=20;
	do
	{
		System.out.println(i);
		i++;
	}while(i<= 10);*/ //even if the condition is <=10, do while will exicute o/p 20 then condition will become false
}

