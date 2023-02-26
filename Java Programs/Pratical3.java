import java.util.Scanner;

public class Pratical3 {
    public static void main(String args[]) {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of sub1");
        m1 = sc.nextInt();
        System.out.println("Enter marks of sub2");
        m2 = sc.nextInt();
        System.out.println("Enter marks of subject 3");
        m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        int per = (total / 3) * 100;
        if (per >= 75) {
            System.out.println("Grade A");
        } else if (per >= 50 && per < 75) {
            System.out.println("Grade B");
        } else if (per > 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}