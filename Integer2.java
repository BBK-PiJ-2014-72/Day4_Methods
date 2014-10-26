/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class Integer2 {
	
	private int value;

	public Integer2(){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	
	public void setvalue(int value){
		this.value = value;
	}
	
	public boolean isEven(){
	boolean isEven = true;
		if(this.value % 2 == 0)
			return isEven;
		else{
			return !isEven;
		}
	}
	
	
	public boolean isOdd(){
		boolean isOdd = true;
		if(this.value % 2 > 0){
		     return isOdd;
		}
		else{
			return !isOdd;
		}
	}
	
	public void prettyPrint(){
		System.out.println("" + this.value);
	}
	
	
	public String toString(){
		String strValue = "" + this.value;
		return strValue;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer2 i2 = new Integer2();
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		String str = in.next(); 
		int i = Integer.parseInt(str);
		i2.setvalue(3);

		System.out.print("The number you entered is ");
		if (i2.isEven()){
			System.out.println("even.");
		}
		else if (i2.isOdd()){
			System.out.println("odd.");
		}
		else{
			System.out.println("undefined! Your code is buggy!");	
		}
		
		int parsedInt = Integer.parseInt(i2.toString());
		if (parsedInt == i2.getValue()){
			System.out.println("Your toString() method seems to work fine.");
		}
		
		}
	}


