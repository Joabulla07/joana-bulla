
import java.util.Scanner;

public class OptionSelect {

     public static void main(String[] args){
        int option;
        option = 0; 
    
        Scanner reader = new Scanner(System. in);
        System.out.println("Select option to continue: ");
        System.out.println("1) Check out your shipping cart ");
        System.out.println("2) Buy shoes ");
        System.out.println("3) Exit ");
        reader.next();
        
        
        switch(option){
            case 1: CheckOutShippingCart.VerifyCart();
                break;
            case 2: BuyProducts.Options(); 
                break;
            case 3: ;//exit
                break;
            
        }   
    }
    
}
