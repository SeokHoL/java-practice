package practice;

public class practice01 {

	public static void main(String[] args) {

		//배열 : 같은 자료형의 값 연속된 자료
////		
////		String[][] seats2= {
////				{"A1","A2","A3"},
////				{"B1","B2","B3"},
////				{"C1","C2","C3","C4","C5"}
//		};
//		
////		for (int i =0; i <seats2.length; i++) {
////			for (int j = 0; j < seats2[i].length; j++) {
////				System.out.print(seats2[i][j] + " ");
////			}
////			System.out.println();
////		}
		
		String[][] seats3 = new String[10][15];
		String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
		for (int i =0; i < seats3.length; i++) {
			for (int j=0; j <seats3[i].length; j++) {
				seats3[i][j] =eng[i] +(j + 1);
			}
		}
		
		seats3[7][8] ="--";
		seats3[7][9] ="--";
		
		for (int i =0; i <seats3.length; i++) {
		for (int j = 0; j < seats3[i].length; j++) {
			System.out.print(seats3[i][j] + " ");
		}
		System.out.println();
	}	
			
		
		
		
		
		
		
	}
}

