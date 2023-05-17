import javax.swing.*;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class TBall extends JPanel {
    private int x,y,size;
    private int xspeed = 1;
    private int yspeed = 1;
    private PlayerNBounds game;

    public  TBall(int x, int y, int size,PlayerNBounds game){
        this.x = x;
        this.y = y;
        this.size = size;
        this.game = game;
    }

    public TBall(PlayerNBounds game) {
        this.game= game;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSizee(){
        return size;
    }
    //   // public void swap() {
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
    public void moveBall() {
        x += xspeed;
        y += yspeed;
        if (x >= 1000 - 20 || x <= 0) {
            xspeed *= -1;
        }
        if(y >= 450 - 20 || y <= 0) {
            yspeed *= -1;
        }
    }
    void move() {
        if (x + xspeed < 0)
            xspeed = 1;
        if (x + xspeed > game.getHeight()- size)
            xspeed = -1;
        if (y + yspeed < 0)
            yspeed = 1;
        if (y + yspeed > game.getWidth() - size)
        if (collision()){
            xspeed = -1;
        }
        x = x + xspeed;
        y = y + yspeed;
    }

    private boolean collision() {
        return game.silly.getBounds().intersects(getBounds());
    }
    private boolean collision2() {
        return game.silly2.getBounds().intersects(getBounds());
    }
    public void paint(Graphics2D g) {
        g.fillOval(x, y, size, size);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }

}