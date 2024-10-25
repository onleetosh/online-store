/***
 * Product class that stores all the properties defined in the csv file
 */

package com.pluralsight;

public class Product {

    String itemName;
    float itemPrice;
    String itemDepartment;
    int itemId;



    //constuctor
    public Product(int itemId, String itemName, float itemPrice, String itemDepartment) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDepartment = itemDepartment;
    }

    //getter methods
    public int getItemId(){ return itemId; }
    public String getItemName() { return itemName; }
    public float getItemPrice() { return itemPrice; }
    public String getItemDepartment() { return itemDepartment; }


    //setter methods
    public void setItemId(int itemId){
        this.itemId = itemId;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemDepartment(String itemDepartment) {
        this.itemDepartment = itemDepartment;
    }

}
