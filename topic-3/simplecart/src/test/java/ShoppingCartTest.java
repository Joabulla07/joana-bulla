
import com.joanna.SimpleCart.ItemEnum;
import com.joanna.SimpleCart.Item;
import com.joanna.SimpleCart.ShoppingCart;
import static org.hamcrest.core.Is.is;
import org.hamcrest.core.IsNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



public class ShoppingCartTest {

    ShoppingCart shoppingCart;
    float breadCost = (float) 1.0;
    float milkCost = (float) 0.6;
    float bananaCost= (float) 0.4;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void testShoppingCartIsEmpty() {
        assertThat(shoppingCart.getShoppingItems(),is(IsNull.notNullValue()));
    }

    @Test
    public void testOnlyOneItemInCart() {
        shoppingCart.addShoppingItem(new Item(ItemEnum.Bread.toString(), 1, breadCost));

        int numberOfItems = shoppingCart.getShoppingItems().size();

        assertThat(numberOfItems, is(1));
    }

    @Test
    public void testOnlyTwoItemsInCart() {
        shoppingCart.addShoppingItem(new Item(ItemEnum.Bread.toString(), 1, breadCost));
        shoppingCart.addShoppingItem(new Item(ItemEnum.Milk.toString(), 1, milkCost));

        int numberOfItems = shoppingCart.getShoppingItems().size();

        assertThat(numberOfItems, is(2));
    }

    @Test
    public void testShoppingCartContainsBreadAndThreeBreads() {
        shoppingCart.addShoppingItem(new Item(ItemEnum.Bread.toString(), 3, breadCost));
        assertTrue(shoppingCart.doesContain("Bread"));
        

    }
    @Test(expected = IllegalArgumentException.class)
    public void testShoppingCartDoesNotContainItemsInSet() {
        
        shoppingCart.addShoppingItem(new Item("Strawberry", 1, (float)0.15));

        for (Item item : shoppingCart.getShoppingItems()) {
            assertEquals(false, ItemEnum.valueOf(item.getName()));
        }

    }
}