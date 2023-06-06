package ch01;

public class star {
	
	public static void printFactorial(int n) {
		System.out.printf("%d!=",n);
		for(int i=n; i>0; i--) {
			System.out.printf("%d",i);
			if (i==1) {
				continue;
			}
			System.out.printf(" x ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFactorial(3);
		
		}
	}


