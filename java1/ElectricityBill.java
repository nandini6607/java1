import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String connectionType; 
    public ElectricityBill(int consumerNo, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType.toLowerCase();
    }
    private int getUnitsConsumed() {
        return currentReading - previousReading;
    }
    public double calculateBill() {
        int units = getUnitsConsumed();
        double amount = 0.0;
        if (connectionType.equals("domestic")) {
            if (units <= 100) {
                amount = units * 1.50;
            } else if (units <= 200) {
                amount = (100 * 1.50) + (units - 100) * 2.00;
            } else if (units <= 500) {
                amount = (100 * 1.50) + (100 * 2.00) + (units - 200) * 3.00;
            } else {
                amount = (100 * 1.50) + (100 * 2.00) + (300 * 3.00) + (units - 500) * 5.00;
            }
        }
        else if (connectionType.equals("commercial")) {
            if (units <= 100) {
                amount = units * 2.00;
            } else if (units <= 200) {
                amount = (100 * 2.00) + (units - 100) * 3.00;
            } else if (units <= 500) {
                amount = (100 * 2.00) + (100 * 3.00) + (units - 200) * 4.00;
            } else {
                amount = (100 * 2.00) + (100 * 3.00) + (300 * 4.00) + (units - 500) * 6.00;
            }
        } else {
            System.out.println("Invalid connection type!");
        }

        return amount;
    }
    public void displayBill() {
        System.out.println("\nElectricity Bill");
        System.out.println("--------------------");
        System.out.println("Consumer No.        : " + consumerNo);
        System.out.println("Consumer Name       : " + consumerName);
        System.out.println("Previous Reading    : " + previousReading);
        System.out.println("Current Reading     : " + currentReading);
        System.out.println("Units Consumed      : " + getUnitsConsumed());
        System.out.println("Connection Type     : " + connectionType);
        System.out.println("Total Bill Amount   : Rs. " + calculateBill());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer Number: ");
        int consumerNo = scanner.nextInt();

        System.out.print("Enter Consumer Name: ");
        scanner.nextLine(); 
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentReading = scanner.nextInt();

        System.out.print("Enter EB Connection Type (domestic/commercial): ");
        scanner.nextLine(); 
        String connectionType = scanner.nextLine();
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();
        scanner.close();
    }
}