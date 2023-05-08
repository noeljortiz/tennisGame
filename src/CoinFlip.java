import javax.swing.*;

public class CoinFlip
{
    public static void main(String[] args)
    {

        String [] coin = new String[2];
        coin[0] = "Heads";
        coin[1] = "Tails";
        int flippin = (int)(Math.random()*coin.length);

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
            String answer = JOptionPane.showInputDialog(null, "Heads or Tails? 1 for Heads, 2 for Tails");

            try{
                int choice = Integer.parseInt(answer);

                if(coin[flippin] == "Heads" && choice == 1){
                    JOptionPane.showMessageDialog(null, " You're right its Heads");
                } else if (coin[flippin] == "Tails" && choice == 1) {
                    JOptionPane.showMessageDialog(null, "You're wrong its Tails");
                }
                if(coin[flippin] == "Tails" && choice == 2){
                    JOptionPane.showMessageDialog(null, " You're right its Tails");
                } else if (coin[flippin] == "Heads" && choice == 2) {
                    JOptionPane.showMessageDialog(null, "You're wrong its Heads");
                }


                JOptionPane.showMessageDialog(null, "😡");
                break;
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "You need to choose");
            }
        }

    }
}


