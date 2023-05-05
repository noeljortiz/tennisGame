import javax.swing.*;
import java.awt.*;
public class Players extends JPanel{
    private int x,y;
    private int size;

    public Players(int x,int y,int size){
        this.x=x;
        this.y=y;
        this.size = size;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return size;
    }
    public void moveRight(){
        x+=5;

    }
    public void moveLeft(){
        x-=5;
    }
    public void moveDown(){
        y+=5;
    }
    public void moveUp(){
        y-=5;
    }
    public void swap() {
        if (x > 500) {
            x = 0;
        }
        if (x < -50) {
            x = 475;
        }
    }
    public void wall(){
        if (y > 500){
            y = 495;
        }
        if (y <  -5){
            y = 0;
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(5,0,50,100);
    }

}
