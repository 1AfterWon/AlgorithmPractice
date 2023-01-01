class Solution {
    public int solution(int n) {
        //기본적으로 n=n(15=15)로 1개를 올리고 시작한다.
        //그래야 효율성에서 반복문을 n까지 돌리지 않아도 된다.
        int answer = 1;
        
        //총합을 담을 res를 선언
        int res=0;
        //n의 절반이 넘어가는 순간 자연수의 합으로 n을 만들 수 없다.
		for(int i=1;i<=(n/2);i++) {
			res=0;
			for(int j=i;j<=(n/2)+1;j++) {
				res+=j;
				if(res>n) {
					break;
				}else if(res==n) {
					answer++;
					break;
				}
			}
		}
        return answer;
    }
}