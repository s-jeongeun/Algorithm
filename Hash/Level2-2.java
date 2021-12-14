class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        
        return answer - 1;
    }
}

/**
 * Iterator<E>
 *  1) boolean hasNext()
 *   해당 이터레이션(iteration)이 다음 요소를 가지고 있으면 true를 반환
 *   
 *  2) E next()
 *   이터레이션(iteration)의 다음 요소를 반환
 *  
 *  3) default void remove()
 *   해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거
 */


class Solution {
    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}

/**
 * 1. 람다식
 *  ( 매개변수 ) -> { 실행문 }
 * 
 * 2. Collectors
 *  1) groupingBy(classifier(함수), downstream)
 *   함수 결과가 key값인 Collector Map 반환
 *   
 *  2) mapping(classifier(함수), downstream)
 *   groupingBy 또는 partitioningBy의 downstream에서 사용되며,
 *   스트림 중 함수에 따라 일부를 추출하여 반환
 *  
 *  3) counting
 *   요소 갯수 반환
 *   
 *  4) reducing(초기값, 변환함수, 합계함수)
 *   두 값을 하나로 도출하여 반환
 */
