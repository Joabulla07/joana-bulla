package com.joanna.SimpleCart;


public enum ItemEnum {
    appleCost ("Apple"),
    Orange ("Orange"),
    bananaCost ("Banana");

    private final String value;

    
    private ItemEnum(final String value) {
        this.value = value;
    }
}
