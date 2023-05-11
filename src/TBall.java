import javax.swing.*;
import java.awt.Rectangle;

public class TBall extends JPanel {
    private int x,y,size;
    private double xspeed = 1;
    private double yspeed = 1;
    public  TBall(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
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
    public Rectangle getBounds() {
        return new Rectangle(x, y, size, size);
    }
    void move() {
        if (x + xspeed < 0)
            xspeed = 1;
        if (x + xspeed > PlayerNBounds.getWidth() - size)
            xspeed = -1;
        if (y + ya < 0)
            ya = 1;
        if (y + ya > game.getHeight() - size)
            game.gameOver();
        if (collision()){
            yspeed = -1;
            y = PlayerNBounds..getTopY() - size;
        }
        x = x + xa;
        y = y + ya;
    }

    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }


}