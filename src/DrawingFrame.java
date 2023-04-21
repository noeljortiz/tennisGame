import javax.swing.*;
import java.awt.*;
public class DrawingFrame{

    public static void main(String[]args){
        JFrame myFrame = new JFrame();
        LinesAndTangles myLine = new LinesAndTangles();

        myFrame.add(myLine);
        myFrame.setVisible(true);
        myFrame.setSize(1000,500);




    }
}