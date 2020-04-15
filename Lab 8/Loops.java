import javax.swing.JOptionPane;
/**
 * Loops class for Lab 8
 *
 * @author Kyle Jacobson
 * @version 03/01/18
 */
public class Loops
{
    public static void main(String[]args)
    {
           //Loops avg = new Loops();
           //avg.average();
        
           Loops sumInts = new Loops();
           sumInts.sum(0, 4);
           
           Loops countDown = new Loops();
           countDown.countdown(10, 0);
           
           Loops multiples = new Loops();
           multiples.countMultiples(1, 10, 2);
    }
    
    public void average()
    {
        int num = 0;
        int total = 0;
        int average;
        int count = 0;

        while (num >= 0)
           { 
              // reads from the JOptionPane as a String
              String numStr = JOptionPane.showInputDialog("Enter an integer: "); 
            
              // converts the String into an integer
              num = Integer.parseInt(numStr); 
            
              // displays results instead of printing to the terminal window
              JOptionPane.showMessageDialog(null, num); 
              
              if (num >= 0)
              {
                  count++;
                  total = total + num;
              }
           }
           
        average = total / count;
        System.out.println(total);
        System.out.println(average);
    }
    
    public void infinite()
    {
        int num = 0;
        int total = 0;
        int average;
        int count = 0;

        while (num >= 0 || num <= 0)
           { 
              // reads from the JOptionPane as a String
              String numStr = JOptionPane.showInputDialog("Enter an integer: "); 
            
              // converts the String into an integer
              num = Integer.parseInt(numStr); 
            
              // displays results instead of printing to the terminal window
              JOptionPane.showMessageDialog(null, num);
           }
    }
    
    public void sum(int low, int high)
    {
        int total = 0;
        
        for(int i=low; i<=high;++i)
        {
            total = total + i;
        }
        
        // displays results instead of printing to the terminal window
        JOptionPane.showMessageDialog(null, total);
    }
    
    public void countdown(int high, int low)
    {
        for(int i=high; i>=low;--i)
        {
            System.out.println(i);
        }
    }
    
    public int countMultiples(int low, int high, int digit)
    {
        int multiple = 0;
        
        for(int i=low; i<=high;++i)
        {
            multiple = i % digit;
        }
        
        System.out.println(multiple);
        return multiple;
    }
}
