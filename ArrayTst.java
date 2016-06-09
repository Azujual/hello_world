import java.util.Random;

public class ArrayTst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mx1 = new int[10];
		int[] mx2 = new int[15];
		
		mx1 = genArr(mx1);
		mx2 = genArr(mx2);
		pntArr(mx1);
		System.out.println();
		pntArr(mx2);
		System.out.println();
		maxArr(mx1);
		System.out.println();
		maxArr(mx2);
		
	}

	public static int[] genArr(int[] mx){
		Random rnd = new Random();
		for (int i = 0; i < mx.length; i++) {
				mx[i] = (rnd.nextInt(256)-128);
		}
		return mx;
	}
	
	public static void pntArr(int[] mx){
		for (int i = 0; i < mx.length; i++) {
			System.out.print(mx[i] + "\t");
		}
	}

	public static void maxArr(int[] mx){
		int maxEl = 0;
		for (int i = 0; i < mx.length - 1; i++) {
				if (mx[i] > maxEl) {
					maxEl = mx[i];
				}
		}
		System.out.print("Max element in array is: " + maxEl);
	}
}
