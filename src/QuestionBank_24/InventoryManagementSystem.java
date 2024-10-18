package QuestionBank_24;

class InventoryItem {
    String name;
    int itemID;  // Instance variable to store unique itemID for each object
    static int nextID = 100;  // Static counter to generate unique IDs, starting from 100

    // Constructor to initialize name and assign unique itemID
    InventoryItem(String name) {
        this.name = name;
        this.itemID = nextID++;  // Assign current value, then increment
    }

    // Method to display basic product information
    public void displayInfo() {
        System.out.println("Product Name: " + name + "\nProduct ID: D" + itemID);
    }
}

class Electronics extends InventoryItem {
    int warrantyPeriod;

    // Constructor for Electronics with warrantyPeriod
    Electronics(String name, int warrantyPeriod) {
        super(name);  // Call the base class constructor
        this.warrantyPeriod = warrantyPeriod;
    }

    // Override displayInfo() to include warrantyPeriod
    @Override
    public void displayInfo() {
        System.out.println("\nProduct Name: " + name +
                "\nItem ID: D" + itemID +
                "\nWarranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends InventoryItem {
    String size;

    // Constructor for Clothing with size
    Clothing(String name, String size) {
        super(name);  // Call the base class constructor
        this.size = size;
    }

    // Override displayInfo() to include size
    @Override
    public void displayInfo() {
        System.out.println("\nProduct Name: " + name +
                "\nItem ID: D" + itemID +
                "\nSize: " + size);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create Electronics object
        InventoryItem item1 = new Electronics("Mic", 12);
        item1.displayInfo();  // Should display ID as D100

        // Create Clothing object
        InventoryItem item2 = new Clothing("Shirt", "S");
        item2.displayInfo();  // Should display ID as D101
    }
}
