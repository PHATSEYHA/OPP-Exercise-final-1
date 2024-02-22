
public class Main {
    public static void main(String[] args) {
        Customer premiumCustomer = new Customer("Phat Seyha", "Premium");
        Customer goldCustomer = new Customer("Penh Bora", "Gold");
        Customer silverCustomer = new Customer("Van Nita", "Silver");
        Customer normalCustomer = new Customer("Hen Kimheang", "Normal");

        Sale sale1 = new Sale(premiumCustomer, "2024-02-22");
        sale1.setServiceExpense(100);
        sale1.setProductExpense(200);

        Sale sale2 = new Sale(goldCustomer, "2024-02-23");
        sale2.setServiceExpense(150);
        sale2.setProductExpense(250);

        Sale sale3 = new Sale(silverCustomer, "2024-02-24");
        sale3.setServiceExpense(120);
        sale3.setProductExpense(180);

        Sale sale4 = new Sale(normalCustomer, "2024-02-25");
        sale4.setServiceExpense(80);
        sale4.setProductExpense(150);

        System.out.println("Sale 1:");
        sale1.displayInfo();
        System.out.println();

        System.out.println("Sale 2:");
        sale2.displayInfo();
        System.out.println();

        System.out.println("Sale 3:");
        sale3.displayInfo();
        System.out.println();

        System.out.println("Sale 4:");
        sale4.displayInfo();
    }
}

