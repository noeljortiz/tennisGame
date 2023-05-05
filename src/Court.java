import javax.swing.*;
import java.awt.*;
public class Court{

    public static void main(String[]args){


        JFrame myFrame = new JFrame();
        myFrame.setSize(1000,500);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout(2,3));
        myPanel.setBackground(new Color(0,103,34));
        LinesAndTangles myLine = new LinesAndTangles();
        myFrame.setVisible(true);
        myFrame.add(myPanel);
        myFrame.add(myLine);
        myFrame.setVisible(true);



    }



}
