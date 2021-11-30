import java.util.*;

public class Problem116 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int tenK = num/10000;
		int ten = num%100/10;
		System.out.println(tenK*ten);
		scan.close();
	}

}
