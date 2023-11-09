import java.util.Random;

import javax.swing.JOptionPane;

class Main {
    public static void main(String []args) {
        Random rand = new Random();

        //Random number generator (0=Rock, 1+Paper, and 2=Scissors)
        int Computer = rand.nextInt(3);

        //Player select ui (0=Rock, 1+Paper, and 2=Scissors)
        String[] options = new String[] {"Rock", "Paper", "Scissors"};
            int Player = JOptionPane.showOptionDialog(null, "Rock, Paper, Scissors, Shoot!", "Shoot",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, options[0]);

        switch (Player) {

            //Rock
            case 0: switch (Computer) {
                    case 0: JOptionPane.showMessageDialog(null, "Computer chose rock, it's a draw.");
                        break;
                    case 1: JOptionPane.showMessageDialog(null, "Computer chose paper. you lost");
                        break;
                    default: JOptionPane.showMessageDialog(null, "Computer chose scissors, you won!");
            };
                break;

            //Paper
            case 1: switch (Computer) {
                    case 0: JOptionPane.showMessageDialog(null, "Computer chose rock, you won :)");
                        break;
                    case 1: JOptionPane.showMessageDialog(null, "Computer chose paper. it's a draw :|");
                        break;
                    default: JOptionPane.showMessageDialog(null, "Computer chose scissors, you lost :(");
            };
                break;

            //Scissors
            case 2: switch (Computer) {
                    case 0: JOptionPane.showMessageDialog(null, "Computer chose rock, you lost :(");
                        break;
                    case 1: JOptionPane.showMessageDialog(null, "Computer chose paper. you won :)");
                        break;
                    default: JOptionPane.showMessageDialog(null, "Computer chose scissors, it's a draw :|");
            }
                break;

            default: 
        }
    }
}
