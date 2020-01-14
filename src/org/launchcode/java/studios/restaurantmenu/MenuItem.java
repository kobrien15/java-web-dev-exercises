package org.launchcode.java.studios.restaurantmenu;


public class MenuItem {
    private int menuId;
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private String itemDesignations; // (e.g. dairy-free, gluten-free, vegetarian, vegan)
    private double itemCalories;
    private String itemSpiceLevel;
    private boolean newItem;


    public MenuItem(int menuId, String itemName, double itemPrice, String itemDescription, String itemCategory, boolean newItem) {
        this.menuId = menuId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.newItem = newItem;
    }
}
