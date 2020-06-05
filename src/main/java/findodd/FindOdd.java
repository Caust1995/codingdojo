package findodd;

public class FindOdd {
	public static int findIt(int[] numbers) {
		if(numbers.length==1){
			return numbers[0];
		}
		else{
			if(numbers[0]==numbers[2]){
				return numbers[1];
			}
			else if(numbers[0]==numbers[1]){
				return numbers[2];
			}
			else{
				return -1;
			}
		}
  }
}