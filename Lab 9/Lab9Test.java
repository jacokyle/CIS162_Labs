
/**
 * Write a description of class Lab9Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab9Test
{
    public static void main(String[]args)
    {
        Lab9 word = new Lab9();
        
        word.addWord("Hello");
        
        word.display();
        
        word.addWords(10);
        
        word.search("Hello");
        
        word.displayElementPerLine();
        
        word.removeEveryOther();
    }
}
