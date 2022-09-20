public class Main
{
    public static void main(String[] args) {
        int itemPrice = 101;
        double taxRate = 0.02;
        double taxCost;
        double totalCost;

        System.out.println(" (Simulated Input) Enter the price of an item: $" + itemPrice);
        if (itemPrice >= 100) {
            System.out.println("Your shipping is free. Bringing your total to $" + itemPrice);
        }
        else {
            taxCost = itemPrice * taxRate;
            totalCost = taxCost + itemPrice;
            System.out.println("Your item cost is: $" + itemPrice + ". Since that is less than $100, you'll be charged 2% for shipping, which comes to: $" + taxCost + " in taxes. This brings your official total to: $" + totalCost);
        }
    }
}