package javaprograms;

import java.util.Iterator;

public class ReverseAString {
	
	public void reverseString() {
	String name = "java";
	
	StringBuffer buffer = new StringBuffer();
	buffer.append(name);
	
StringBuffer out = buffer.reverse();
	System.out.println(out);
	}


	public void usingOwnLogic () {
		
		String name = "program";
		char[] characterArray = name.toCharArray();
		String reversed ="";
		for(int i =characterArray.length-1;i>=0;i--){
			reversed=reversed+characterArray[i];
		}
        System.out.println(reversed);
		
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseAString string = new ReverseAString();
		string.reverseString();
		string.usingOwnLogic();

	}

}
