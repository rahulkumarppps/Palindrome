import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str.toLowerCase());
		for (int i = 0; i < sb.length() ; i++) {
			if(!Character.isLetter(sb.charAt(i))){
				sb.deleteCharAt(i);
				i--;
			}
		}
		str = sb.toString();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(str.toLowerCase().equals(sb.toString()));
	}
}
