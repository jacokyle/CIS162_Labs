import java.awt.*;
import javax.swing.*;
/**
 * The Checkerboard class draws a checkbaord pattern.
 *
 * @author (Kyle Jacobson)
 * @version (03/29/18)
 */
public class Checkerboard extends JPanel{
    public static void main(String args[]){
        JFrame f = new JFrame("Checker Board");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Checkerboard ());
        f.pack();
        f.setVisible(true);
    }

    public Checkerboard (){
        setPreferredSize (new Dimension(500,500));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int x = -1;
        int y = 0;

        for(int i = 0; i < 8; i++)
        {
            x = 0;
            y = 0;

            for(int j = 0; j < 8; j++)
            {
                if(i % 2 == 0)
                {
                    g.setColor(Color.red);
                    x++;
                    y++;
                }

                else
                {
                    g.setColor(Color.black);
                    x++;
                    y++;
                }
            }

            g.fillRect(50 * x, 50 * y, 50, 50);
        }
    }
}

