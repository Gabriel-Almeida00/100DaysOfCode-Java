package Day25;

import java.util.Scanner;

public class exe246 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Input a positive number(max three digits):");
        char[] num = String.format("%03d", in.nextInt()).toCharArray();
        StringBuilder tm = new StringBuilder();
        for (int i = 0; i < num[0] - '0'; i++) {
            tm.append("H");
        }
        for (int i = 0; i < num[1] - '0'; i++) {
            tm.append("T");
        }
        for (int i = 0; i < num[2] - '0'; i++) {
            tm.append(i + 1);
        }
		System.out.println("Result:");		
        System.out.println(tm.toString());
    }
}
