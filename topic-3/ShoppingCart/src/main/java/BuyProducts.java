import java.util.Scanner;

public class BuyProducts {
      
    
     static void Options (){
        int option = 1;
        int select = 0;
        Scanner reader = new Scanner(System. in);
        while(option == 1){
            CheckOutShippingCart.Add();
            System.out.println("Still Buying: 1)Yes 2)No");
            reader.next();
        }
        System.out.println("select: 1)Check out Shipping Cart 2)Exit");
        reader.next();
        if (select == 1){
           CheckOutShippingCart.VerifyCart();
        }
        else{
            CheckOutShippingCart.SaveAndExit();
        }
}
}
