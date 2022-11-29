class Solution {
    public String solution(String[] survey, int[] choices) {
            String answer = "";
        
            int[] res=new int[8]; //여기에 순서대로 R T C F J M A N 의 점수를 넣는다.
        
        
        	for(int i=0;i<survey.length;i++) {
			if(choices[i]==4) {
				//4일때는 아무것도 증가하지 않으니 넘어간다.
				continue;
			}else if(choices[i]<4) { //4보다 작으면 앞 문자에 점수 더함
				switch(survey[i].charAt(0)) {
					case 'R': res[0]+=4-choices[i]; break;
					case 'T': res[1]+=4-choices[i]; break;
					case 'C': res[2]+=4-choices[i]; break;
					case 'F': res[3]+=4-choices[i]; break;
					case 'J': res[4]+=4-choices[i]; break;
					case 'M': res[5]+=4-choices[i]; break;
					case 'A': res[6]+=4-choices[i]; break;
					case 'N': res[7]+=4-choices[i]; break;
				}
			}else if(choices[i]>4) { //4보다 크면 뒤 문자에 점수 더함
				switch(survey[i].charAt(1)) {
					case 'R': res[0]+=choices[i]-4; break;
					case 'T': res[1]+=choices[i]-4; break;
					case 'C': res[2]+=choices[i]-4; break;
					case 'F': res[3]+=choices[i]-4; break;
					case 'J': res[4]+=choices[i]-4; break;
					case 'M': res[5]+=choices[i]-4; break;
					case 'A': res[6]+=choices[i]-4; break;
					case 'N': res[7]+=choices[i]-4; break;
				}
			}
		}
        
        //RT 결정
		if(res[0]==res[1]) {
			answer+="R"; //같으면 알파벳순
		}else if(res[0]>res[1]) {
			answer+="R";
		}else if(res[0]<res[1]){
			answer+="T";
		}
		
		//CF 결정
		if(res[2]==res[3]) {
			answer+="C"; //같으면 알파벳순
		}else if(res[2]>res[3]) {
			answer+="C";
		}else if(res[2]<res[3]){
			answer+="F";
		}
		
		//JM 결정
		if(res[4]==res[5]) {
			answer+="J"; //같으면 알파벳순
		}else if(res[4]>res[5]) {
			answer+="J";
		}else if(res[4]<res[5]){
			answer+="M";
		}
		
		//AN 결정
		if(res[6]==res[7]) {
			answer+="A"; //같으면 알파벳순
		}else if(res[6]>res[7]) {
			answer+="A";
		}else if(res[6]<res[7]){
			answer+="N";
		}
        
        return answer;
    }
}