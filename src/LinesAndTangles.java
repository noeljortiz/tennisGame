import javax.swing.*;
import java.awt.*;
public class LinesAndTangles extends JPanel{

    public LinesAndTangles(){
        setBackground(new Color(0,103,34));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(450,0,50,500);

    }

}
