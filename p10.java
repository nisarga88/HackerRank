
import java.util.*;

public class  p10{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int line = 1;

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(line + " " + s);
            line++;
        }

        sc.close();
    }
}
