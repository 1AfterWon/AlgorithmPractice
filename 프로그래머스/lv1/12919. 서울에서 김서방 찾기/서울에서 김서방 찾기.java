class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0;i<seoul.length;i++){
           if(seoul[i].equals("Kim")) { //문자열은 == 말고 equals!
               answer+="김서방은 "+i+"에 있다"; //String에 다른 자료형 넣어도 String으로 자동캐스팅됨!
               break;
           } 
        }
        return answer;
    }
}