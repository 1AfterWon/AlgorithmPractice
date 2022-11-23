class Solution {
    public int solution(String s) {
        /*
           큰 흐름: StringBuffer에 넣으면서 영단어 완성되면 tmp에 추가해주고 다시 str 초기화
		   1.반복문 돌리면서 charAt으로 '0'~'9'가 아니면 sb에 추가 + '0'~'9'면 tmp에 추가
		   2.StringBuffer 선언 후 case 문으로 영단어 완성 시 tmp에 추가 + sb 초기화
		   3.다 추가되면 answer에 Integer.parseInt(tmp)로 완료!
		   
		 **/
        int answer = 0;
        //임시로 넣어둘 StringBuffer와 String 선언
        StringBuffer sb=new StringBuffer();
		String tmp="";
        
        
		for(int i=0;i<s.length();i++) {
            //s의 i번째 문자가 0~9면 tmp 문자열에 그냥 추가하고
			if('0'<=s.charAt(i)&&s.charAt(i)<='9') {
				tmp+=s.charAt(i);
			}else {
            //그렇지 않으면 sb에 추가해준다.
				sb.append(s.charAt(i));
			}
			
            //이 밑에 case문을 써줘서 영단어가 완성되면 바로 확인한다.
            //맞는 영단어가 나오면 그에 상응하는 숫자를 tmp에 더해주고 초기화
			switch(sb.toString()){
			case"zero": tmp+="0"; sb.delete(0, sb.length()); break;
			case"one": tmp+="1"; sb.delete(0, sb.length()); break;
			case"two": tmp+="2"; sb.delete(0, sb.length()); break;
			case"three": tmp+="3"; sb.delete(0, sb.length()); break;
			case"four": tmp+="4"; sb.delete(0, sb.length()); break;
			case"five": tmp+="5"; sb.delete(0, sb.length()); break;
			case"six": tmp+="6"; sb.delete(0, sb.length()); break;
			case"seven": tmp+="7"; sb.delete(0, sb.length()); break;
			case"eight": tmp+="8"; sb.delete(0, sb.length()); break;
			case"nine": tmp+="9"; sb.delete(0, sb.length()); break;
			}
		}
		//이렇게 다 합쳐진 tmp를 int형태로 answer로 전환하여 반환!
		answer=Integer.parseInt(tmp);
        return answer;
    }
}