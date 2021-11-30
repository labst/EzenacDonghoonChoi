import java.util.*;

public class Problem117 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = (num/2)%2;
		int b = ((((num/2)/2)/2)/2)%2;
		System.out.println(a+", "+b);
		
		scan.close();
	}

}
