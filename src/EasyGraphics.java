import javax.swing.*;

public class EasyGraphics
{
    public static void main(String[] args)
    {
        String [] coin = new String[2];
        coin[0] = "Heads";
        coin[1] = "Tails";
        JOptionPane.showMessageDialog(null, "Welcome to Tennis");
        int response = JOptionPane.showConfirmDialog(null, "Flip Coin?");
        if(response == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Correct Answer!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Are you sure?");
        }
        while(true){
            String answer = JOptionPane.showInputDialog(null, "Heads or Tails?");

            try{
                int age = Integer.parseInt(answer);
                JOptionPane.showMessageDialog(null, "In ten years you will be "+(age + 10));
                break;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "You need to type in an integer!");
            }
        }

    }
}


