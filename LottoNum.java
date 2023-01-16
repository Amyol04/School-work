import java.util.Arrays;
public class LottoNum {

	public static void main(String[] args) {
		
		int[] lottoNums = new int[6];
		
		// Generate and store 6 random numbers
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = (int)(Math.random() * 47) + 1;
			for(int j = i - 1; j >= 0; j--) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		//Sort the array
		Arrays.sort(lottoNums);
		
		// Display the numbers stored in the array
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + ", ");
		}
	}
}