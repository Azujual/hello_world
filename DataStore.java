
public class DataStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayRefVar = new int[13];
		for (int i = 0; i < 13; i++){
			arrayRefVar[i] = i + i * 2;
			
		}
		printArray(arrayRefVar);
		System.out.println("\n" + arrayRefVar.length);
		printArray(reverse(arrayRefVar));
	}
	
	public static void printArray(int[] array) {
		  for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i] + " ");
		  }
		}
	
	public static int[] reverse(int[] list){
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--){
			result[j] = list[i];
		}
		return result;
	}
}
