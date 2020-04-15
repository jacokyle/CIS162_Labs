import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * The Lab9 class contains the ArrayLists.
 *
 * @author Kyle Jacobson
 * @version 3/15/18
 */
public class Lab9
{
    private ArrayList<String> word;

    public Lab9()
    {
        word = new ArrayList<String>();
    }

    public void addWord(String str)
    {
        word.add(str);
    }

    public void display()
    {
        System.out.println(word);
    }

    public void addWords(int num)
    {
        String str = "";

        for (int i = 0; i <= num; i++)
        {
            str = JOptionPane.showInputDialog("Enter a word: ");
            word.add(str);
        }
    }

    public int search(String str)
    {
        for (int i = 0 ; i < word.size() ; i++)
            if (word.get(i).equalsIgnoreCase(str))
                {
                    return i;
                }
        return -1;
    }

    public void displayElementPerLine()
    {
        System.out.println(word);
    }

    public void removeEveryOther()
    {
        for (int i = 0; i <= 10; i++)
        {
            word.remove(0 + i);
            System.out.println(word);
        }
    }
}
