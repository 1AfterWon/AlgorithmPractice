import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
            int[] answer =new int[score.length]; //score의 길이와 answer의 길이는 같다.
        
            //Array 만들어서 하나씩 넣고, 최소값을 result에 넣어줌
		    //이미 array의 요소가 k개면 가장 작은 값과 비교해서 바꿔준 후 result에 넣어줌
        
        
            //1. k명만 담을 배열을 생성
            int[] kr=new int[k];
        
            //2. score의 모든 요소에 대하여 반복문 실행
        	for(int i=0;i<score.length;i++) {
            //3. k만큼 아직 값을 넣지 않았을 때 kr[0]에 score[i]를 넣고 오름차순 정렬한 후에 k-i-1번째 요소를 answer에 넣어주면 최소값이다
            // 기본이 {0,0,0}인데 10을 넣고 정렬하면 {0,0,10}이기 때문에 k-i-1의 값을 넣어줘야 한다
			if(i<k) {
				kr[0]=score[i];	
				Arrays.sort(kr);
				answer[i]=kr[k-i-1];
				continue;

			}
            //4.k만큼 넣은 이후로는 값들 비교하면서 값을 바꿔준다
            //오름차순 정렬이니 kr[0]가 가장 작은 값이니 비교하기!
            if(kr[0]<score[i]) {
				kr[0]=score[i];
				Arrays.sort(kr);	 
			}
			answer[i]=kr[0];
			
		}
        return answer;
    }
}