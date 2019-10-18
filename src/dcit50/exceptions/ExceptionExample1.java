package dcit50.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Charles
 */
public class ExceptionExample1 {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while ((s = in.readLine()) != null) { 
            System.out.println(s);
        }
    }
}
