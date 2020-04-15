
/**
 * The DiceGame class provided functions of the game.
 *
 * @author Kyle Jacobson, Brandon Stowell
 * @version 2/22/2018
 */
public class DiceGame
{
    private GVdie d1;

    private GVdie d2;

    private GVdie d3;

    private int credits;

    private int guess;

    private int currentValueD1;
    
    private int currentValueD2;
    
    private int currentValueD3;

    private String message;

    /*********************************************************
     * Default Constructor
     *********************************************************/
    public DiceGame()
    {
        d1 = new GVdie();
        d2 = new GVdie();
        d3 = new GVdie();
        credits = 100;
        message = "Welcome to my Game";
        d1.setBlank();
        d2.setBlank();
        d3.setBlank();
    }

    public String getMessage()
    {
        return message;
    }

    public int getCredits()
    {
        return credits;
    }

    public GVdie getDie(int num)
    {
        switch (num)
        {
            case 1:
                return d1;
            case 2:
                return d2;
            default:
                return d3;
        }
    }

    public void setGuess(int g)
    {
        guess = g;
    }

    public void restart()
    {
        credits = 100;
        message = "Welcome to my Game";
        d1.setBlank();
        d2.setBlank();
        d3.setBlank();
    }

    private void rollDice()
    {
        d1.roll();
        d2.roll();
        d3.roll(); 

        currentValueD1 = d1.getValue();
        currentValueD2 = d2.getValue();
        currentValueD3 = d3.getValue();
    }

    private boolean isTriplet()
    {
        if (guess == currentValueD1 && guess == currentValueD2 && guess == currentValueD3)
        {
            return true;
        }
        
        else
        {
            return false; 
        }
    }

    private boolean isDoubles()
    {
        if ((guess == currentValueD1 && guess == currentValueD2) || (guess == currentValueD2 && guess == currentValueD3) || (guess == currentValueD1 && guess == currentValueD3))
        {
            return true;
        }
        
        else
        {
            return false; 
        }
    }

    private boolean wasNumberRolled()
    { 
        if (guess == currentValueD1 || guess == currentValueD2 || guess == currentValueD3)
        {
            return true;
        }
        
        else
        {
            return false; 
        }
    }
    
    public void playGame()
    {
        rollDice();
        
        if (isTriplet())
        {
            credits += 50;
            message = "Three of a Kind!";
        }

        else if (isDoubles())
        {
            credits += 20;
            message = "A Pair!";
        }

        else if (wasNumberRolled())
        {
            credits += 10;
            message = "Only one match!";
        }

        else
        {
            credits -= 10;
            message = "No match - you lose!";
        }
    }
}
