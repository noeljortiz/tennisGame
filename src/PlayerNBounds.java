import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

public class PlayerNBounds extends JPanel{
    int x = (int)Math.random()*(1-500)+1;
    int xspeed = 9;
    int y = (int)Math.random()*(1-500)+1;
    int yspeed = 9;

      Players silly;
      Players silly2;
    public PlayerNBounds(){
        setBackground(new Color(0,103,34));
        silly = new Players(100,50,20,80);
        silly2 = new Players(900,50,20,80);




        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());
                int blahhh = e.getKeyCode();
                if (blahhh == 68){
                    silly.moveRight();
                }
                if(blahhh == 87 ){
                    silly.moveUp();
                }
                if(blahhh == 65 ){
                    silly.moveLeft();
                }
                if(blahhh == 83 ){
                    silly.moveDown();

                }
                if (blahhh == 39){
                    silly2.moveRight();
                }
                if(blahhh == 38){
                    silly2.moveUp();
                }
                if(blahhh == 37){
                    silly2.moveLeft();
                }
                if( blahhh == 40){
                    silly2.moveDown();

                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });




    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);




       g.fillRect(silly.getX(), silly.getY(), silly.getWidth(), silly.getHeight());
        g.fillRect(silly2.getX(), silly2.getY(), silly2.getWidth(), silly2.getHeight());

        g.setColor(Color.white);
        g.fillRect(450,0,50,500);
        silly.swap();
        silly.wall();



        try{
            Thread.sleep(34);
        }
        catch(Exception e){
            System.out.println(e);


        }

        repaint();

    }
}


