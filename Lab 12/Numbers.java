import java.util.Random;
/**
 * Class for creating an array of numbers.
 *
 * @author (Kyle Jacobson)
 * @version (04/05/18)
 */
public class Numbers
{
    int[]numbers;

    public Numbers(int n)
    {
        numbers = new int[n];
    }   

    public void fillRandomly()
    {
        Random value = new Random();

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = value.nextInt(1001);
        }
    }

    public double calcAverage()
    {
        double sum = 0.0;

        for(int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    public int findMin()
    {
        int minimum = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] < minimum)
            {
                minimum = numbers[i];
            }
        }
        
        return minimum;
    }
    
    public int findMax()
    {
        int maximum = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > maximum)
            {
                maximum = numbers[i];
            }
        }
        
        return maximum;
    }
    
    public static void main(String[]args)
    {
        Numbers test = new Numbers(10);
        test.fillRandomly();
        
        System.out.println("The Average: " + test.calcAverage());
        System.out.println("The Minimum Value: " + test.findMin());
        System.out.println("The Maximum Value: " + test.findMax());
    }
}
