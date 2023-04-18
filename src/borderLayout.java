import javax.swing.*;
import java.awt.*;
public class borderLayout{

    public static void main(String[]args){


        //1 create a frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(300,500);

        //2 create a pannel
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout(2,3));
        //myPanel.setBackground(Color.Blue);
        myPanel.setBackground(new Color(200,255,226));
        //3 add components to the pannel
        JButton myButton = new JButton("Yes");
        myPanel.add(myButton);
        myButton.setBackground(Color.RED);
        myButton.setOpaque(true);
        myButton.setBorderPainted(false);

        //myPanel.add(myTextField,BorderLayout.SOUTH);

        //add an image
        ImageIcon icon = new ImageIcon("images/cards/3H.png");
        ImageIcon icon2 = new ImageIcon("images/cards/4H.png");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        icon2.setImage(icon2.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));

        JLabel myLabel = new JLabel(icon);
        JLabel myLabel2 = new JLabel(icon2);
        myPanel.add(myLabel);
        myPanel.add(myLabel2);
        //4 add the pannel to the frame
        myFrame.add(myPanel);
        //5 make the fram visibile
        myFrame.setVisible(true);




    }









}
