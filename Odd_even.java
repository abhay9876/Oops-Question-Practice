import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Odd_even {
    public static void main(String[] arg) {
        int a = 10;
        String k = a % 2 == 0 ? "even " : "odd";
        System.out.println(k);
    }
}
