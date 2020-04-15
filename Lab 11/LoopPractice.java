
/**
 * The LoopPractice class is used to practice for loops.
 *
 * @author (Kyle Jacobson)
 * @version (03/29/18)
 */
public class LoopPractice
{
    public static void main(String[]args)
    {
        LoopPractice multiple = new LoopPractice();
        multiple.displayMultiples(3);

        LoopPractice rectangle = new LoopPractice();
        rectangle.drawRectangle(5,10);

        LoopPractice triangle1 = new LoopPractice();
        triangle1.drawTriangle(5);

        System.out.println();
    }

    public LoopPractice()
    {

    }

    public void displayMultiples(int num)
    {
        for(int i = 1; i < 101; i++)
        {
            System.out.print(num * i + " ");

            if(i % 10 == 0)
            {
                System.out.println();
            }
        }
    }

    public void drawRectangle(int rows, int cols)
    {
        for(int i = 0; i < rows; i++)
        {
            System.out.println();
            
            for(int j = 0; j < cols; j++)
            {
                System.out.print("*");
            }
        }
    }
    
    public void drawTriangle(int rows)
    {
        for(int i = 0; i < rows; i++)
        {
            System.out.println();
            
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
        }
    }
}
