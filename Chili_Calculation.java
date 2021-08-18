import java.util.Scanner;

public class Chili {

    public static void main(final String[] args) {
        final double chiliAdult = 7.50; // CONSTANT, price to buy one
        final double chiliChild = 5.25; // CONSTANT, price to buy one

        int adultPurchases, childPurchases; // AMOUNT OF MEALS PURCHASED
        double adultMealCost, childMealCost, totalCost; // COST TO MAKE ONE MEAL
        double adultTotal, childTotal, allTotal; // TOTAL COLLECTED FOR EACH TYPE SOLD
        double allProfit; // PROFIT OF EACH (PURCHASE*MEAL - COST)

        // DISPLAY TOTAL MONEY COLLECTED FOR ADULT MEALS
        final Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter amount of adult meals sold: ");
        adultPurchases = inputScanner.nextInt();
        adultTotal = adultPurchases * chiliAdult;
        System.out.print("Total money collected for adult meals: " + adultTotal + "\n");

        // DISPLAY TOTAL MONEY COLLECTED FOR CHILD MEALS

        System.out.print("Enter amount of child meals sold: ");
        childPurchases = inputScanner.nextInt();
        childTotal = childPurchases * chiliChild;
        System.out.print("Total money collected for child meals: " + childTotal + "\n");

        // DISPLAY TOTAL MONEY COLLECTED FOR ALL MEALS
        allTotal = adultTotal + childTotal;
        System.out.print("Total money collected for all meals: " + allTotal + "\n");

        // DISPLAY TOTAL PROFIT (ALL MEALS SOLD - COST FOR ALL MEALS)
        System.out.print("How much does it cost to make 1 adult meal?");
        adultMealCost = inputScanner.nextFloat();
        final double adultProfit = (adultTotal - adultMealCost * adultPurchases);

        System.out.print("How much does it cost to make 1 child meal? ");
        childMealCost = inputScanner.nextFloat();
        final double childProfit = (childTotal = childMealCost * childPurchases);
    inputScanner.close();

    //CALCULATE TOTAL COST
    totalCost = adultMealCost + childMealCost;

    //CALCULATE TOTAL PROFIT
    allProfit = allTotal - totalCost;
    
    System.out.println("\nTotal profit of sales of adult meals: " + adultProfit);
    System.out.println("Total profit of sales of child meals: " + childProfit);
    System.out.print("Total profit is: " + allProfit);
    
    }
}