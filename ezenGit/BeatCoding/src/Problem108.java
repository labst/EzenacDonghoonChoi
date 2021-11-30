import java.util.*;

public class Problem108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean b = (num % 3 == 0 && num % 4 != 0);
		System.out.println(b);

		scan.close();

	}

}
