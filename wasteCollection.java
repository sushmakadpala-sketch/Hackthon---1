import java.util.Scanner;
public class WasteCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicleNumber = 100;
        
        double wasteCollected = 133.4;

        int collectionPoints = 9;
        char vehicleStatus = 'B';

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        sc.close();
    }
}
    

