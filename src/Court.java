import javax.swing.*;
import java.awt.*;
public class Court{

    public static void main(String[]args){
        int p1 = 0;


        JFrame myFrame = new JFrame();
        JLabel p1Score = new JLabel(""+p1);
        myFrame.setSize(1000,500);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout(2,3));
        myPanel.setBackground(new Color(0,103,34));
        LinesAndTangles myLine = new LinesAndTangles();
        PlayerNBounds myPlayer = new PlayerNBounds();
        myFrame.setVisible(true);
        myFrame.add(myPanel);
        myFrame.add(myLine);
        myFrame.add(myPlayer);
        myFrame.setVisible(true);





    }



}