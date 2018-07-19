
import com.joanna.SimpleCart.Item;
import com.joanna.SimpleCart.ItemEnum;
import com.joanna.SimpleCart.ShoppingCart;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;




public class ShoppingCartTest {

    ShoppingCart shoppingCart;
    float appleCost = (float) 0.25;
    float bananaCost = (float) 0.20;
    float totales = (float) 0.0;

    @Before
    public void setUp() {
        List<Item> shoppingItems = new ArrayList<Item>();
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void AddItem() {
    shoppingCart.addShoppingItem(new Item(ItemEnum.appleCost.toString(), 1, appleCost));
    int numberOfItems = shoppingCart.getShoppingItems().size();
    assertTrue (numberOfItems== 1);
    }
    
    @Test
    public void CheckOut(){
    totales = (float) 0.0;
    shoppingCart.addShoppingItem(new Item(ItemEnum.appleCost.toString(), 1, appleCost));
    shoppingCart.addShoppingItem(new Item(ItemEnum.bananaCost.toString(), 1, bananaCost));    
    totales = shoppingCart.getTotals();
    assertTrue( totales == 0.45);    
    }
}
        




   
    

        
    

   