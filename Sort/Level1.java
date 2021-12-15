import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
        	int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
        	answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}

/**
 * Arrays.copyOfRange(배열, index1, index2)
 *  해당 배열의 index1부터 index2-1까지 잘라서 반환
 */
