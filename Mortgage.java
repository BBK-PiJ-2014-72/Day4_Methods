/**
 * 
 */

/**
 * @author DAVISON
 *
 */
import java.util.Scanner;

public class Mortgage {
	
	private double mortgageAmount;
	private int noOfYears;
	private double interestRate;
	
	
	public Mortgage(double mortgageAmount, int noOfYears, double interestRate){
		this.mortgageAmount = mortgageAmount;
		this.noOfYears = noOfYears;
		this.interestRate = interestRate;
	}
	
	public int getNoOfYears(){
		return this.noOfYears;
	}
	
	public double getMortgageAmount(){
		return this.mortgageAmount;	
	}
	
	public double getInterestRate(){
		return this.interestRate / 100;	
	}
	
	
	public double totalAmountToBePaid(){
		double totalAmountToBePaid = (this.calculateMonthlyPayment() * 12) * this.getNoOfYears();
		return totalAmountToBePaid;
	}
	
	public double moneyToBePaidEveryYear(){
		double moneyToBePaidEveryYear = this.calculateMonthlyPayment() * 12;
		return moneyToBePaidEveryYear;	
	}
	
	public double noOfYearsToPayInterestAmountOff(){
		double difference = (this.totalAmountToBePaid() - this.getMortgageAmount()); 
		double noOfYearsToPayInterestAmountOff = ((difference / this.calculateMonthlyPayment()) / 12);
		return noOfYearsToPayInterestAmountOff;
	}
	
	
	//helper method
	private double calculateMonthlyPayment(){
		double monthlyPayment = 0;
		double annualInterestRate = this.getInterestRate(); 
		double monthlyInterestRate = annualInterestRate / 12;
		int termOfYears = this.getNoOfYears();
		
		//no of monthly payments over term of years
		int noOfMonthlyPayments = termOfYears * 12;
		 
		double calculatedTerm = Math.pow(1 + monthlyInterestRate,180);
		double principalLoanAmount = this.getMortgageAmount();
		
		monthlyPayment =  principalLoanAmount * ((monthlyInterestRate * calculatedTerm) / (1 - calculatedTerm));
		return monthlyPayment;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the total amount borrowed for mortgage: ");
		Scanner in = new Scanner(System.in);
		double mortgageAmount = in.nextDouble();
		
		System.out.println("Please enter the amount of years to pay back mortgage: ");
		int noOfYears = in.nextInt();
		
		System.out.println("Please enter interest rate:");
		double interestRate = in .nextDouble();
		
		Mortgage mortgage = new Mortgage(mortgageAmount, noOfYears, interestRate); 
		
		//The total amount to be paid
		System.out.println("The total amount to be paid: " + mortgage.totalAmountToBePaid());
		
		//The money to be paid every year
		System.out.println("The money to be paid every year: " + mortgage.moneyToBePaidEveryYear());
	
		//The number of years before the interest is paid and only the initial capital remains
		System.out.println("The number of years before the interest is paid and only the initial capital remains:" + mortgage.noOfYearsToPayInterestAmountOff());
		
		//The monthly amount
		System.out.println("Please print the monthly amount: " + mortgage.calculateMonthlyPayment());
		
	}	
	
	

}
