class Solution {
    public int solution(int num) {
        int answer = -1; //기본값을 -1로 해서 500번동안 안되면 -1로 고정
        for(int i=1;i<=500;i++){
            if(num==1){answer=0;break;} //초기 num이 1일 때 answer=0 후 break
            if(num%2==0){num/=2;}
            else if(num%2==1){num=num*3+1;}
            if(num==1){answer=i;break;} //반복문 수행하고 num이 1일 때 answer=반복횟수 후 break
        }
        return answer;
    }
}