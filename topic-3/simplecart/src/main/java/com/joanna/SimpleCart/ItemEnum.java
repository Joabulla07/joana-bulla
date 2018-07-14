package com.joanna.SimpleCart;

public enum ItemEnum {
    Bread ("Bread"),
    Milk ("Milk"),
    Banana ("Banana");

    private final String value;

    
    private ItemEnum(final String value) {
        this.value = value;
    }

    
 
    public String toString() {
        return value;
    }

} 