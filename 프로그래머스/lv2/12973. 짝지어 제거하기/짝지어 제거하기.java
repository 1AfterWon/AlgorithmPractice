import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        //스택을 이용하여 하나씩 넣으면서 기존의 값과 같은 값이 들어오면 삭제하는 방식.
        Stack<Character> st=new Stack<Character>();

		for(int i=0;i<s.length();i++) {
            //스택이 비어있지 않고, 스택의 가장 위 문자가 넣으려는 문자와 같으면, 문자를 넣지 않고 기존 스택에서 문자를 제거한다
			if(!st.empty()&&st.peek()==s.charAt(i)) {
				st.pop();
				continue;
			}
			st.push(s.charAt(i));
		}
		
        //모든 과정이 끝나고 스택이 비어있으면 1, 그렇지 않으면 0
		if(st.empty()) {answer=1;}
		else {answer=0;}
        return answer;
    }
}