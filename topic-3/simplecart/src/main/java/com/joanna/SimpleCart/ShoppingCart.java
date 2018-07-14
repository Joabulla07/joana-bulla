package com.joanna.SimpleCart;


import java.util.ArrayList;
import java.util.List;


public class ShoppingCart  {

    private float totals;

    private List<Item> shoppingItems = new ArrayList<Item>();

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

    public Boolean doesContain(String itemName) {
        return shoppingItems.contains(itemName);
    }
    
    public float checkout() {
        float total = (float) 0.0;
        for(Item item: shoppingItems){
            if(item.equals("Bread")){
                total += 1.0 * item.getQuantity();
            }else if(item.equals("Milk")){
                total += 0.6 * item.getQuantity();
            }else if(item.equals("Banana")){
                total += 0.4 * item.getQuantity();
            }
        }
        return total;
    }   

    }
   

