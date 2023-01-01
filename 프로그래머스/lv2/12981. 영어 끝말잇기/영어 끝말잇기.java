import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer =new int[2];
        //1. 중복단어: list에 단어를 계속 넣어 contains로 미리 있는 단어가 나오면 종료
        //2. 끝말잇기실패: charAt으로 비교해서 다르면 종료
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<words.length;i++) {
            //1. 중복단어
			if(list.contains(words[i])) {answer[0]=i%n+1;answer[1]=i/n+1; break;}
			list.add(words[i]);
            
            //2.끝말잇기실패
            if(i==0)continue;
			if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
				answer[0]=i%n+1;answer[1]=i/n+1; break;
			}
			
		}
        return answer;
    }
}