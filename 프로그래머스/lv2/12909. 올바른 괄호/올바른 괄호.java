class Solution {
    boolean solution(String s) {
        boolean answer=false;
        // )와 (이 짝이 맞아야하는데, 앞에서부터 읽었을 때 )가 (보다 많아지면 어차피 안맞는다
        // 전부 다 돌고 cnt=0이면 짝이 맞는것. cnt가 1이 넘으면 안맞는다.
        int cnt=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') {cnt--;}
            else {cnt++;}
            if(cnt<0){break;}  
        }
        if(cnt==0){answer=true;}
        return answer;
    }
}