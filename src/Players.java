import javax.swing.*;
import java.awt.*;
public class Players extends JPanel{
    private int x,y,width,height;
    private PlayerNBounds game;


    public Players(int x,int y,int width,int height, PlayerNBounds game){
        this.x=x;
        this.y=y;
        this.width = width;
        this.height = height;
        this.game = game;
    }


    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }
    public  int getHeight(){
        return height;
    }

    public void moveRight(){
        x+=10;

    }
    public void moveLeft(){
        x-=10;
    }
    public void moveDown(){
        y+=10;
    }
    public void moveUp(){
        y-=10;
    }
//    public void swap() {
//        if (x > 1000) {
//            x = 0;
//        }
//        if (x < -50) {
//            x = 475;
//        }
//    }
    public void wall(){
        if (y > 1000){
            y = 995;
        }
        if (y <  -5){
            y = 0;
        }
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }


////    public void hitBall(){
//        if (y > 1000){
//            y = 995;
//        }
//        if (y <  -5){
//            y = 0;
//        }
//    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(x,y,width,height);
    }

}
