//Rowan Gallagher, rog728@lehigh.edu
//Homework 2, 9/4/24

//class and main method
class Arithmetic {
    //I learned how to make a function/method that only includes two decimal places
    static double conversion(double a) { //making a method that takes a double and converts some double 'a' into some double with two decimal places
        double y = (int)(a * 100); //multiplying by 100 and then turning into an integer to get rid of decimals
        double z = (double)(y/100); //dividing by 100 and then turning it back into a double to get only two decimals back
        return z;
    }
    public static void main(String[] args)
    {
    //Declaring Variables listed on the assignment
    //pant info
    int numPants = 3;
    double pantsPrice = 34.98;
    //shirt info
    int numShirts = 2;
    double shirtPrice = 24.99;
    //belt info
    int numBelts = 1;
    double beltPrice = 33.99;

    double paSalesTax = 0.06; //tax rate
    double x = paSalesTax; //shortcut for typing to make the tax easier to get
    //declaring and assigning values to variables that I need to find the solution for
    //Total costs of items
    double totalCostOfPants = (double)numPants * pantsPrice;
    double totalCostOfShirts = (double)numShirts * shirtPrice;
    double totalCostofBelts = (double)numBelts * beltPrice;
    //Individual taxes for each item
    double pantsTax = x * totalCostOfPants;
    double shirtTax = x * totalCostOfShirts;
    double beltTax = x * totalCostofBelts;
    //total before tax overall
    double totalBeforeTax = totalCostofBelts+totalCostOfPants+totalCostOfShirts;
    //Total sales tax overall
    double totalTax = pantsTax+shirtTax+beltTax;
    //Grand total with tax
    double bigTotal = totalTax + totalBeforeTax;
    //printing using the conversion() method to only include two decimal places
    System.out.println("The cost of pants pre-tax is $" + conversion(totalCostOfPants)  + " with a tax of $" + conversion(pantsTax));
    System.out.println("The cost of shirts pre-tax is $" + conversion(totalCostOfShirts) + " with a tax of $" + conversion(shirtTax));
    System.out.println("The cost of belts pre-tax is $" + conversion(totalCostofBelts) + " with a tax of $" + conversion(beltTax));
    System.out.println("Your purchase total pre-tax is $" + conversion(totalBeforeTax));
    System.out.println("The total tax on your purchase is $" + conversion(totalTax));
    System.out.println("Your grand total is " + conversion(bigTotal));
    }
}