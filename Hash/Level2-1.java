import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) answer = false;
        }
		
        return answer;
    }
}

/**
 * str1.startsWith(str2)
 * str1이 str2로 시작된다면 true 반환
 * 
 * str1.endsWith(str2)
 * str1이 str2로 끝난다면 true 반환
 */
