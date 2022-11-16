class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=(long)money;;
        for(int i=1;i<=count;i++){
            sum-=(long)(price*i);
            
        }
        if(sum<0){answer=-sum;}
        else if(sum>=0){answer=0;}
        
        return answer;
    }
}