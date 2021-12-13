import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
      
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) answer = key;
        }
      
        return answer;
    }
}

/**
 * getOrDefault(Object key, V DefaultValue)
 * key가 있다면 해당 key의 value 반환
 * 없다면 DefaultValue 반환
 */
