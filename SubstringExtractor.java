import java.util.Scanner;

public class SubstringExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine(); 
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        String substring = inputString.substring(startIndex, endIndex); 
        System.out.println(substring);
        sc.close(); 
    }
}
