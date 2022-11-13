class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean pm=true; //부호를 파악하기 위한 논리형 변수
        
        for(int i=0;i<s.length();i++){   //문자열의 처음부터 반복문 실행
            char ch=s.charAt(i);
            if(ch=='-'){pm=false;} //-인 문자가 들어오면 pm을 false로!
            else if(ch!='+'){answer=answer*10+(ch-'0');} 
            //부호가 아닌 값이 들어오면 answer의 자릿수를 하나 올리고(*10)
            //answer에 들어왔던 값을 int로 넣어준다 
            //(ch-'0' -> 숫자가 연속적으로 저장된 유니코드 ch에 0의 유니코드를 빼서 숫자값 받기)
        }
        
        if(pm==false){
            answer*=-1;
        }
        return answer;
    }
}