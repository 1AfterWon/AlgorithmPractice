import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);Arrays.sort(reserve);
        //answer을 올려주면서, 올리면 그 값을 -1로 바꿔 다음에 쓰이지 못하게 한다.
		//2벌있는 사람 중 잃어버렸으면 본인만 입을 수 있는 사람이므로 answer++
		for(int i=0;i<lost.length;i++)
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]) {
					answer++;
					lost[i]=reserve[j]=-1;
					break;
				}
			}
		
		//두벌 있고 잃어버리지 않은 사람 중 앞사람 혹은 뒷사람에게 빌려주기
		//그 후 -1로 바꿔줌
		for(int i=0;i<lost.length;i++)
			for(int j=0;j<reserve.length;j++) {
				if(reserve[j]==lost[i]-1||reserve[j]==lost[i]+1) {
					answer++;
					reserve[j]=-1;
					break;
				}
			}
        return answer;
    }
}