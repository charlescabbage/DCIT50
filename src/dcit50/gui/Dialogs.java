package dcit50.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Charles
 */
public class Dialogs {
    public static void main(String[] args) {
        /**
         * Simple dialogs
         */
        JOptionPane.showMessageDialog(null, "Hello world!");
        JOptionPane.showMessageDialog(null, "Hello world!", "Plain", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello world!", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello world!", "Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello world!", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        /**
         * Confirm dialogs
         */
        JOptionPane.showConfirmDialog(null, "Press YES to doubt.", "Doubt", JOptionPane.YES_OPTION);
        JOptionPane.showConfirmDialog(null, "Press YES to doubt.", "Doubt", JOptionPane.YES_NO_OPTION);
        int n = JOptionPane.showConfirmDialog(null, "Press YES to doubt.", "Doubt", JOptionPane.YES_NO_CANCEL_OPTION);
        if (n == 0)
            System.out.println("Doubting...");
        else
            System.out.println("Shame on you.");
        
        
        /**
         * Customizing button text
         */
        Object[] options = { "はい", "いえ" };
        n = JOptionPane.showOptionDialog(null,
                "Are you a weeb?",
                "QA",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (n == 0)
            System.out.println("Welcome to the club!");
        else
            System.out.println("Watch more filthy frank!");
        
        /**
         * Input dialogs
         */
        JOptionPane.showInputDialog(null, "What is your name?");
        Object[] foods = { "ham", "egg", "bacon" };
        String s = (String)JOptionPane.showInputDialog(null,
                "What food do you like?",
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                foods,
                foods[0]);
        //If a string was returned, say so.
        if (s != null && s.length() > 0) {
            System.out.println("You like " + s);
        }
    }
}
