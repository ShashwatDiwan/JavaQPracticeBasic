/*Develop a Java program that manages an inventory of products using the Iterator interface.
 The system should allow users to add, remove, display, and update product prices.
 Each product has a name, product ID, and price. Ensure no duplicate product IDs are allowed.

 Features:
1.Add a product (with validation for unique product ID).
2.Remove a product by product ID.
3.Display all products.
4.Update the price of a product by product ID.
5.Display appropriate success or error messages for each operation. */


package QuestionBank_24;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
    String name;
    int productID;
    int price;

    Product(String name,int price,int productID){
        this.name = name;
        this.price = price;
        this.productID = productID;

    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getProductID(){
        return productID;
    }

    public void setProductID(int productID){
        this.productID = productID;
    }

    @Override
    public String toString(){
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        return "Product name : "+name + " | ProductID : "+productID+ " | Price : " + price;
    }
}

class InventoryManager {
    ArrayList<Product> list = new ArrayList<>();

    //method to add product
    public void addProduct(String name, int price, int productID) {
        Product product = new Product(name, price, productID);
        list.add(product);
        System.out.println("Product added successfully");
    }

    public boolean checkUniqueId(int productID) {
        for (Product product : list) {
            if (product.getProductID() == productID)
                return false;
        }
        return true;
    }

        //method to remove product by id
        public void removeProduct (int id){
            Iterator<Product> itr = list.iterator();
            while (itr.hasNext()) {
                Product product = itr.next();
                if (product.getProductID() == id) {
                    itr.remove();
                    System.out.println("Product with id " + id + " removed.");
                } else
                    System.out.println("No product with id " + id + " found");

            }
        }

        public void displayAllProducts () {

            if (list.isEmpty())
                System.out.println("No products in the list.");
            else {
                for (Product product : list) {
                    System.out.println(product);
                }
            }
        }

        public void updateProduct(int ID,int Price){
            Iterator <Product> itr = list.iterator();
            while(itr.hasNext()){
                Product product = itr.next();
                if(product.getProductID() == ID){
                    product.setPrice(Price);
                    System.out.println("Price of product with ID "+ID+" changed.");
                }
            }
        }
    }

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManager inventoryManager = new InventoryManager();

        System.out.println("----------------Inventory Manager ----------------");
        while (true) {
            System.out.println("Choose an option from below : ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.Add a product");
            System.out.println("2.Remove a product by product ID");
            System.out.println("3.Display all products");
            System.out.println("4.Update the price of a product by product ID");
            System.out.println("5.Exit");
            System.out.println("--------------------------------------------------");

            System.out.print("Your choice :");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Product name :");
                    String name = sc.nextLine();

                    System.out.print("Product price :");
                    int price = sc.nextInt();
                    sc.nextLine();

                    int productID;
                    do {
                        System.out.print("ProductID :");
                        productID= sc.nextInt();
                        inventoryManager.checkUniqueId(productID);
                        sc.nextLine();

                        if(!inventoryManager.checkUniqueId(productID)){
                            System.out.println("Product ID already exists! Please enter a unique ID.");
                        }
                    }
                    while(!inventoryManager.checkUniqueId(productID));


                    inventoryManager.addProduct(name, price,productID);
                    break;

                case 2:
                    System.out.print("Enter ID of product,you want to remove :");
                    int id = sc.nextInt();
                    sc.nextLine();
                    inventoryManager.removeProduct(id);
                    break;

                case 3:
                    inventoryManager.displayAllProducts();
                    break;

                case 4:
                    System.out.print("Enter ID of product,whose price you want to update :");
                    int ID = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the updated price :");
                    int Price =sc.nextInt();

                    inventoryManager.updateProduct(ID,Price);
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Enter valid choice!");

            }
        }
    }
}
