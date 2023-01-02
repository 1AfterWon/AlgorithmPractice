import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        //CONCEPT: 오름차순 정렬 후 가장 큰 값부터 가장 작은 수와 더해보고 limit이하이면 둘 다 index를 옮기며 answer를 더한다
        //기본적으로 보트가 1개 필요하니 answer=1로 시작.
        int answer = 1;
        Arrays.sort(people);
        //작은 값부터 올라올 index 선언
		int j=0;
		for(int i=people.length-1;i>j;i--) {
			if(people[i]+people[j]<=limit) {
				j++;
			}
            //작은 값부터 올라오는 j와 큰 값부터 내려오는 i가 만나게 되면 모든 인자를 쓴 것이므로 break!
			if(i==j)break;
            answer++;
		}
        return answer;
    }
}