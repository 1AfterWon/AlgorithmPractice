class Solution {
    public int solution(int n) {
        int answer = 0;
        //기본적인 피보나치수열의 형식으로, f1,f2,f3를 각각 아래와 같이 반복하면 완성된다.
        //*주의* 기본적으로 int로 이용했을 때는 피보나치수가 너무 크저면 overflow가 발생한다!
        //처음에는 long으로 해결하려 했지만... 이것 또한 문제가 있었다.
        //마지막 결과값%1234567와 중간과정에서 하는 값은 같다..??
		int f1=1,f2=1;
		if(n==1||n==2) return 1;
		for(int i=3;i<=n;i++) {
			answer=(f1+f2)%1234567;
			f1=f2;
			f2=answer;
		}
        return answer;
    }
}