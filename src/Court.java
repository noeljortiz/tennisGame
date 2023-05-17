import javax.swing.*;
import java.awt.*;
public class Court extends JPanel{
//    Players silly = new Players(100,50,20,80,this);
//    Players silly2 = new Players(900,50,20,80,this);
//    TBall ball = new TBall(20,50,15,this);
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
        p1Score.setSize(20,20);
        myFrame.setVisible(true);
        myFrame.add(p1Score);
        myFrame.setVisible(true);
        myFrame.add(myPanel);
        myFrame.add(myLine);
        myFrame.setVisible(true);
        myFrame.add(myPlayer);
        myFrame.setVisible(true);


    }



}