class Solution {
    public int solution(int n) {
        int answer = 0;
        //n을 3진수 값으로!
        String TT=Integer.toString(n,3);
        //값이 없는 String 자료형 rvs에 TT의 값을 뒤에서부터 넣기
        String rvs="";
        for(int i=TT.length()-1;i>=0;i--){
            rvs+=TT.charAt(i);
        }
        //answer에 3진법의 rvs를 10진법으로 바꾸기
        answer=Integer.parseInt(rvs,3);
        return answer;
    }
}