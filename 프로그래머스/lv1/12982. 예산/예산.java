import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //최대한 많은 부서에 지원해주려면 오름차순으로 정렬해서 가장 작은 값부터 지원하면 된다.
        //오름차순 정렬
        Arrays.sort(d);
        //예산-값이 0이상이면 answer를 1씩 늘려주면 되고, 돈을 다 썻을 경우 break로 나온다.
        for(int a:d){
            if(budget-a>=0){
                budget-=a;
                answer++;
            }else break;
        }
        return answer;
    }
}