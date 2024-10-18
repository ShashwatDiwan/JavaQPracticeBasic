
package QuestionBank_24;

class inventoryItem{
    String name;
    static int itemID = 100;

    inventoryItem(String name){
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Product Name : " + name + "Product Id : " + itemID + "D");
    }

}

class Electronics extends inventoryItem{
    int warrantyPeriod;
    Electronics(String name,int warrantyPeriod){
        super(name);
        this.warrantyPeriod = warrantyPeriod;
        inventoryItem.itemID++;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nProduct name : "+ name + " \nItemID : D" + itemID + "\nWarranty Period : " + warrantyPeriod);
    }
}

class Clothing extends inventoryItem{
    String size;
    Clothing(String name,String size){
        super(name);
        this.size = size;
        inventoryItem.itemID++;
    }
    @Override
    public void displayInfo(){
        System.out.println("\nProduct name : "+ name + "\nItemID : D" + itemID + "\nProduct size : " + size);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        inventoryItem item1 = new Electronics("Mic",12);
        item1.displayInfo();

        inventoryItem item2 = new Clothing("Shirt","S");
        item2.displayInfo();
    }
}
