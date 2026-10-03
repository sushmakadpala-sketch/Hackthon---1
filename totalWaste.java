import java.util.Scanner;

class totalWaste {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        double total = point1Waste + point2Waste;
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at Point 1: ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste at Point 2: ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");
        sc.close();
    }
}
