public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int[]array1={1 2, 3};
		int[]array2={4, 5, 6};
		int[]mergedArray=new int [array1.length+array2.length];
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
			System.arraycopy(array2, 0, mergedArray, 0, array1.length, array2.length);
		
		for (int merged:mergedArray){
			System.out.println(merged);
		
	}
}