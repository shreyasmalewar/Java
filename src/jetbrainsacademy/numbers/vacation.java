package jetbrainsacademy.numbers;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int numberOfDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        scanner.close();
    
        int totalFoodCost = foodCostPerDay * numberOfDays;
        int totalFlightCost = flightCost * 2;
        int totalHotelCost = hotelCostPerNight * (numberOfDays - 1);
    
        int totalTripCost = totalFlightCost + totalHotelCost + totalFoodCost;

        System.out.println(totalTripCost);
    
    }
}