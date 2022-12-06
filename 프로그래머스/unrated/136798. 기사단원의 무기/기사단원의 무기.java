class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        //약수는 나누어 떨어지는 수니, 나누어 떨어지면 cnt를 1개씩 늘려서 약수의 갯수를 파악한다.
        for(int i=1;i<=number;i++) {
			int cnt=1;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
            //cnt가 limit을 넘지 않으면 answer에 더해주고, 넘으면 power를 더해준다
			if(cnt<=limit) {answer+=cnt;}
			else {answer+=power;}
		}
        return answer;
    }
}