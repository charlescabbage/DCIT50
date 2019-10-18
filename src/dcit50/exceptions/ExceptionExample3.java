package dcit50.exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Charles
 */
public class ExceptionExample3 {
    public static void main(String[] args) {
        try {
            int n = JOptionPane.showConfirmDialog(null, "Is onii-chan home?", "Onii-chan", JOptionPane.YES_NO_OPTION);
            if (n == 0)
                System.out.println("Okaeri onii-chan!");
            else
                throw new OniichanException("404 onii-chan not found");
        } catch (OniichanException e) {
            System.out.println(e);
        }
    }
}
