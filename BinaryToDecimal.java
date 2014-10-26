/**
 * 
 */

/**
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class BinaryToDecimal {

	public int binary2decimal(String str){
	
		String str2 = "";
		String str3 = "";
		//Reverse input String to make computation easier
		for (int i = str.length() - 1; i >= 0; i--){
			str2 = str2 + str.charAt(i);
		}
		System.out.println("Input string reversed:" + str2);
		
		int binaryDigit = 0;
		int power = 0;
		int total = 0;
		int decimalNo = 0;
		for (int i = 0; i < str2.length(); i++){
		    str3 = Character.toString(str2.charAt(i));
		    if (str3.equals("1")){
		    	binaryDigit = Integer.parseInt(str);
		    	power = i;
		    	decimalNo =  (int) (1 * Math.pow(2,  i));
		    	System.out.println("Decimal no: " + decimalNo);
		    	total = total + decimalNo;
		    }	
		}
		return total;
	}
	
	public String decimal2binary(int decimalToConvert){
		
		int decimal = decimalToConvert;
		System.out.println("Inside: " + decimal);
		
		int decimal1 = 0;
		double decimal2 = 0;
		
		
		
		String binaryString = "";
		for (int i = decimal; decimal > 0; decimal = decimal % 2){;
			System.out.println(decimal);
			if (decimal == 0){
				binaryString  = binaryString + "0";
				System.out.print(binaryString);
			}
			
			if (decimal2 > 0){
				binaryString = binaryString + "1";
				System.out.print(binaryString);
			}
		}
		System.out.println();
		
		//Reverse String
		String binaryStringReversed = "";
		for (int i = binaryString.length() - 1; i >= 0; i--){
			binaryStringReversed = binaryStringReversed + binaryString.charAt(i);
		}
		return binaryStringReversed;
	}
	
	
	public static void main(String[] args) {
		
		boolean running = true;
		
	
		while(running){
			System.out.println("Menu Option - Please select option");
			System.out.println("1-binary to decimal");
			System.out.println("2-decimal to binary");
			System.out.println("0-Exit");
			System.out.print(">");

			Scanner in = new Scanner(System.in);		
			String menuStr = in.next();
			String str = "";
			int decimal = 0;
		
			decimal = Integer.parseInt(menuStr);
			
			switch(decimal){
			case 0: running = false;
					break;
			case 1:	
					System.out.println("Please enter a binary to convert to decimal:");
					str = in.next();
					System.out.println("Entered binary converted to decimal is:" + new BinaryToDecimal().binary2decimal(str));
					break;
			case 2:
					System.out.println("Please enter a decimal to convert to binary:");
					str = in.next();
					decimal = Integer.parseInt(str);
					System.out.println("decimal is:" + decimal);		
					System.out.println("Entered decimal converted to binary is:" + new BinaryToDecimal().decimal2binary(decimal));
					break;
			}
		}

}
}