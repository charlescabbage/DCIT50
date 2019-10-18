package dcit50.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Charles
 */
public class ExceptionExample2 {
    public static void main(String[] args) {
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            while ((s = in.readLine()) != null) { 
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
