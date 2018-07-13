import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CheckOutShippingCart {
    
  static void VerifyCart(){
    ArrayList<String> CartList = new ArrayList<String>();
        
    if(CartList.isEmpty()){
        System.out.println("Empty Shipping Cart");
    }
     else {
            Iterator it = CartList.iterator(); 
            while ( it.hasNext() ) { 
                Object objeto = it.next(); 
                Product producto = (Product)objeto; 
                System.out.println(producto);
             } 
            }
     int option=0;
     Scanner reader = new Scanner (System .in);
     
     System.out.println("Select an option to continue:");
     System.out.println("1) Add products");
     System.out.println("2) Delete Products ");
     System.out.println("3) Check out and pay");
     System.out.println("4) Save Cart and Exit");
     reader.next();
      
     
      switch (option){
         case 1: Add();
            break;
         case 2: Delete();
            break;
         case 3: CheckOut(); 
            break;
         case 4: SaveAndExit();
     }
    }
       static void Add() {
       ArrayList<String> CartList = new ArrayList<String>();
       Product.builder();
       CartList.add(Product);
     }
       static void Delete() {
        ArrayList<String> CartList = new ArrayList<String>();
        Product.getProduct();
        CartList.remove(Product);
 }
    
     
     static void CheckOut(){
        ArrayList<String> CartList = new ArrayList<String>();
         int total;
         total=0;
            while ( CartList.hasNext() ) { 
                total++= Product.getPrecio();
            }
            System.out.println("Total to pay: "+total);
         
}
     
     static void SaveAndExit(){
}
}
     
