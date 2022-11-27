class Solution {
    public String solution(int[] food) {
        String answer = "";
        //2로 나눈 몫을 answer에 더해주고 마지막에 0(물)을 더해주기
        //배열의 첫 요소는 물의 수(1)이므로 food[1]부터 하기
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer+=i;
            }
        }
        answer+="0";
        //같은 반복문을 반대로 실행하면 반대로 더할 수 있다
        for(int i=food.length-1;i>0;i--)
            for(int j=0;j<food[i]/2;j++){
                answer+=i;
            }
        return answer;
    }
}