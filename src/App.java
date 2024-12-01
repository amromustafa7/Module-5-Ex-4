public class App {
    public static void main(String[] args) throws Exception {
        // Printing the header of the table
        System.out.printf("%-15s%-15s%n", "Miles", "Kilometers");

        // Conversion factor for miles to kilometers
        double conversionFactor = 1.609;

        // Loop to print the values from 1 to 10 miles
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * conversionFactor;
            System.out.printf("%-15d%-15.3f%n", miles, kilometers);
        } 

    } 
}
