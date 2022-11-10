class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n/2;i++){ // n/2까지만 돌려도 약수는 다 구할 수 있다.
            if(n%i==0){
                answer+=i;
            }
        }
        answer+=n;  //마지막에 n만 추가해주면 모든 약수를 더할 수 있다.
        return answer;
    }
}