class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt=0; //약수의 갯수를 확인할 cnt
        for(int i=left;i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){cnt++;} //1~i까지 나누고 나누어떨어지면(약수) cnt++
            }
            if(cnt%2==0){answer+=i;} //약수의 갯수가 짝수면 더하고
            else{answer-=i;} //홀수면 뺀다
            cnt=0;
        }
        return answer;
    }
}