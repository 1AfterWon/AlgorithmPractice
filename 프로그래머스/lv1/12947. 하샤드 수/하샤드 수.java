class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int s=0;
        for(int i=x;i>0;){
            s+=i%10;
            i/=10;
        }
        if(x%s!=0){answer=false;}
        return answer;
    }
}