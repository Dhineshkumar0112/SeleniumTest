package javaprograms;

public class Swapnumbers {
	
	int num1=3;
	int num2=6;

	public void swapNumbers1(){
		System.out.println(num1 +" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1 +" "+num2);	
	}
		
	public void swapNumbers2(){
		System.out.println(num1 +" "+num2);
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println(num1 +" "+num2);
	}
	
	public static void main(String[] args) {
		
		Swapnumbers swapNumbers= new Swapnumbers();
		swapNumbers.swapNumbers1();
		swapNumbers.swapNumbers2();
	}

}

