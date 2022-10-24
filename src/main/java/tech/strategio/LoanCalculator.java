package tech.strategio;

import java.util.Scanner;

public class LoanCalculator 
{

    /**
     * Method that takes a loan amount and returns the remaining 
     * amount after 3 iterations of 10% deductions. 
     * 
     * @param amount the original loan amount 
     * @return the final loan amount after deductions 
     */
    static int getRemainingAmountIn3Months(int amount) 
    {

        for(int i = 0; i < 3; i++)
        {
            amount = amount - (int)(amount * 0.1); 
        }
         
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
