package Assignments;

public class Assignments7ConditionalStatements {
	    
	    public static void main(String[] args) {
	     
	        String customerName = "John Doe";
	        int creditScore = 720;
	        double income = 55000.0;
	        boolean isEmployed = true;
	        double debtToIncomeRatio = 35.0;
	        
	        if (creditScore >= 750) {
	            System.out.println("Result: Loan is Automatically Approved");
	      
	        } 
	        else if (creditScore >= 650 && creditScore < 750) {
	            System.out.println("Additional checks required");
	          
	            if (income < 50000) {
	                System.out.println("Income Check: Failed");
	                System.out.println("Result: Loan is Denied");
	                return;
	            } else {
	                System.out.println("Income Check: Passed");
	              
	            }
	            
	           
	            if (!isEmployed) {
	                System.out.println("Employment Check: Failed");
	          
	            } else {
	                System.out.println("Employment Check: Passed");
	                
	            }
	            
	        
	            if (debtToIncomeRatio >= 40) {
	                System.out.println("DTI Check: Failed");
	                System.out.println("Result: Loan is Denied");
	                
	            } else {
	                System.out.println("DTI Check: Passed");
	                
	            }
	            
	            System.out.println("=================================");
	            System.out.println("Result: Loan is Approved");
	            System.out.println("=================================");
	            
	        } 
	        else {
	            System.out.println("Credit Score Check: FAILED (<650)");
	            System.out.println("Result: Loan is DENIED");
	            
	        }
	    }
	}

