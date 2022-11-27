class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //교환 할 수 있는 기준인 a이상일 때 반복
        while(n>=a){
            //받는 병의 수 = 빈병/기준*주는병 수
            answer+=n/a*b;
            //빈병은 교환하고 남은 값 + 새로 받은 병의 수가 된다
            n=(n%a)+(n/a*b);
        }
        return answer;
    }
}