
/**
 * The ItemTest class is designed to test the Item class.
 *
 * @author Kyle Jacobson
 * @version 
 */
public class ItemTest
{
    public static void main(String[]args)
    {
        //creates a new object called item1 for Item class
        Item item1 = new Item("Item1", "GVSU t-shirt", 29.99, 100);
        
        //prints out item1 information
        System.out.println(item1);
        
        //adds 3 units to total inventory and prints value
        item1.addToInventory(3);
        System.out.println(item1.getInventory());
        
        //modifies the original price and prints value
        item1.setPrice(29.99 - 30.00);
        System.out.println(item1.getPrice());
        
        //prints out updated item1 information
        System.out.println(item1);
       
        //creates a new object called item1 for Item class
        Item item2 = new Item("Item2", "GVSU jacket", 39.99, 75);
       
        //prints out item2 information
        System.out.println(item2);
        
        //changes the original description to a new item
        item2.setDescription("GVSU sweatpants");
        System.out.println(item2.getDescription());
        
        //changes the original item code to a new value
        item2.setItemCode("Item14");
        System.out.println(item2.getItemCode());
        
        //prints out updated item2 information
        System.out.println(item2);
    }
}
