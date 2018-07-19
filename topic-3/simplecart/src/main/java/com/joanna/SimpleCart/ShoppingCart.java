package com.joanna.SimpleCart;



import java.util.ArrayList;
import java.util.List;


public class ShoppingCart  {

    private float totals;

    private List<Item> shoppingItems = new ArrayList<Item>();
    private int size;

    public void addShoppingItem(Item shoppingCartItem) {
        shoppingCartItem.setShoppingCart(this);
        shoppingItems.add(shoppingCartItem);
    }
    public void deleteShoppingItem(Item shoppingCartItem) {
        shoppingCartItem.setShoppingCart(this);
        shoppingItems.remove(shoppingCartItem);
    }
    
    public List<Item> getShoppingItems() {
        return shoppingItems;
    }
    

    public void setShoppingItems(List<Item> shoppingItems) {
        this.shoppingItems = shoppingItems;
    }


    public float getTotals() {
        return totals;
    }

    public void setTotal(float totals) {
        this.totals = totals;
    }
  
    public int getsize() {
        return size;
    }
    
   public float checkout() {
        float total = 0;
        for(Item item: shoppingItems){
            total= total + ((item.getPrice())*(item.getQuantity()));
            }
         return total;        
       
    }   

    
}
    
   

