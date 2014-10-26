/**
 * 
 */

/**
 * @author DAVISON
 *
 */

import java.util.Scanner;

public class BinaryToHexidecimal{

	private BinaryToDecimal binaryToDecimal;
	
	public BinaryToHexidecimal(BinaryToDecimal binary2decimal){
		this.binaryToDecimal = binary2decimal;
	}
	
	
	public static void main(String[] args) {
		
		boolean isLoop = true;
		BinaryToDecimal binary2decimal = new binaryToDecimal();
		BinaryToHexidecimal binaryToHexidecimal = new BinaryToHexidecimal();
		
		while (isLoop){
			System.out.println("Menu Options");
			System.out.println("1 - Binary to Hexadecimal");
			System.out.println("2 - Hexadecimal to Binary");
			System.out.println("0 - Exit");
			System.out.println(">");
		
			Scanner in = new Scanner(System.in);
			String str = in.next();
			int intOption = Integer.parseInt(str);
			
			switch (intOption){
			case 0:
				isLoop = false;
				break;
			case 1:
				binary2hexidecimal();
			case 2:	
				hexadecimal2binary();
			}
			
			
			}
		}
	}

}
