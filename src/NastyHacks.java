	import java.util.Scanner;
	
	public class NastyHacks {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int r = sc.nextInt(); //expected revenue without adds
				int e = sc.nextInt(); //expected revenue with adds
				int c = sc.nextInt(); //cost of adds
				if(e - c > r) {
					System.out.println("advertise");
				}else if(e - c == r){
					System.out.println("does not matter");
				}else {
					System.out.println("do not advertise");
				}
			}
		}
	
	}
