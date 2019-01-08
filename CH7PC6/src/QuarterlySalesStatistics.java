/**
 * Richard Fitzgerald
 * CH7PC6 - Quarterly Sales Statistics
 * Programming III - AP
 * 1/7/19
 */
import java.util.Scanner;
public class QuarterlySalesStatistics {

   
    public static void main(String[] args) {
        // Sets up Array
        double[][] sales = new double[6][4];
        // Input for the array
        Scanner keyboard = new Scanner(System.in);
        for(int x = 0; x < 6; x++){
            for(int y = 0; y < 4; y ++){
                System.out.println("Please enter sales for Division " + (x + 1) + " Quarter " +(y + 1) + ":");
                sales[x][y] = keyboard.nextDouble();
            }
        }
        System.out.println("");
        // Prints out values stored in array
        for(int x = 0; x < 6; x++){
            for(int y = 0; y < 4; y ++){
                System.out.println("Division " + (x + 1) + ", Quarter " + (y + 1) + ":" + sales[x][y]);
            }
        }
        System.out.println("");
        // Calculaties total for the quarter
        for(int x = 0; x < 4; x ++){
            double total = 0;
            for(int y = 0; y < 6; y++){
                total += sales[y][x];
                System.out.println("Total for Quarter " +(x + 1) + ": " + total);
            }
        }
        System.out.println("");
        // Calculates average for quarter
        for(int x = 0; x < 4; x++){
            double total = 0;
            double avg = 0.0;
            for(int y = 0; y < 6; y ++){
                total += sales[y][x];
            }
            avg = total/6;
            System.out.println("Average for Quarter " + (x + 1) + ": " + avg);
        }
        System.out.println("");
        // Calculates who has the highest sales per quarter
        int div = 0;
        for(int x = 0; x < 4; x ++){
            double high = 0;
            for(int y = 0; y < 6; y ++){
                if(sales[y][x] > high){
                    high = sales[y][x];
                    div = y;
                }
            }
            System.out.println("The highest sales for Quarter " + (x + 1) + " goes to Division " + (div + 1));
        }
    }

}
