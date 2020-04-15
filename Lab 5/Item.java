import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 * The Item class is designed to display an items name, description, price and total inventory.
 *
 * @author Kyle Jacobson
 * @version 
 */
public class Item
{
    /** name of the item */
    private String itemCode;

    /**  description of the item */
    private String description;

    /** price of the item */
    private double price;

    /** total inventory of the item */
    private int inventory;

    /**********************************************************
     * Default Constructor
     **********************************************************/ 
    public Item() 
    {
        price = 0.0;
        inventory = 0;
    }

    /**********************************************************
     * Constructor that is used to assign instance variables
     * @paran String - name of the item
     * @param String - description of the item
     * @param double - price of the item
     * @param int - total inventory of the item
     **********************************************************/
    public Item(String pItemCode, String pDescription, double pPrice, int pInventory) 
    {
        itemCode = pItemCode;
        description = pDescription;
        price = pPrice;
        inventory = pInventory;
    }

    /*********************************************************
     * returns the item code
     * @return String item code
     *********************************************************/
    public String getItemCode() 
    {
        return itemCode;
    }

    /*********************************************************
     * returns the description
     * @return String description
     *********************************************************/
    public String getDescription()
    {
        return description;
    }

    /********************************************************
     * returns the price
     * @return String price
     ********************************************************/
    public double getPrice()
    {
        return price;
    }

    /********************************************************
     * returns the total inventory
     * @return int inventory
     ********************************************************/
    public int getInventory()
    {
        return inventory;
    }
    
    /********************************************************
     * changes the name to the String passed as parameter
     * @param String - new item code
     ********************************************************/
    public void setItemCode(String pItemCode)
    {
        itemCode = pItemCode;
    }

    /********************************************************
     * changes the description to the String passed as parameter
     * @param String - new description
     ********************************************************/
    public void setDescription(String pDescription)
    {
        description = pDescription;
    }
    
    /********************************************************
     * changes the price to the double passed as parameter
     * @param double - new price
     ********************************************************/
    public void setPrice(double pPrice)
    {
        if (pPrice > 0.0)
        {
            price = pPrice;
        }
    }
    
    /********************************************************
     * changes the total inventory to the int passed as parameter
     * @param int - new total inventory
     ********************************************************/
    public void setInventory(int pInventory)
    {
       inventory = pInventory; 
    }
    
    /********************************************************
     * adds more items to the total inventory
     ********************************************************/
    public void addToInventory(int units)
    {
        inventory += units;
    }
    
    /********************************************************
     * subtracts more items from the total inventory
     ********************************************************/
    public void subtractToInventory(int units)
    {
        inventory -= units;
    }
    
    /********************************************************
     * 
     ********************************************************/
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return "\nItem Code: " + itemCode + "\nDescription: " + description + "\nPrice: " + price + "\nTotal Inventory: " + inventory;
    }
}

