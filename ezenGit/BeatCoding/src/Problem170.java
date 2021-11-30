
public class Problem170 {

	public static void main(String[] args) {
		int[] arr = new int[27];
		int n = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=3; k++) {
					arr[n] = (100*i+10*j+k);
					n++;
				}
			}
		}
		System.out.println(arr[9]);
		
		
	}

}
