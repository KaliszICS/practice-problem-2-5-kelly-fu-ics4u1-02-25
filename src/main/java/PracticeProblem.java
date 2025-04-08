public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static void insertionSort(char[] characters){
		
		for (int i = 1; i < characters.length; i++){
			char currentValue = characters[i];
			int j = i - 1;
			while (j >= 0 && currentValue < characters[j]){
				characters[j+1]=characters[j];
				j--;
			}
			characters[j+1]= currentValue;
		}
	} 


}
