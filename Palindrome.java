import java.util.Scanner; 
public class Palindrome {

    static boolean detectPalindrome(int a) {
String b=Integer.toString(a);
        for (int i = 0; i <= b.length() / 2; i++) {
            int len = b.length() - 1;
            if (b.charAt(i) != b.charAt(len - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter no to check");
    
        int no = myObj.nextInt(); 
        System.out.print(detectPalindrome(no));
    }
}
