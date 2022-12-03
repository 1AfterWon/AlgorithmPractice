class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++) {
			//연속으로 나오면 X로 바꿔서 발음할 수 없는 문자 남겨둠
			//몇번이 반복되든 한번이라도 반복되면 발음 불가능 하니까 1번만 해도 가능
			
			babbling[i]=babbling[i].replace("ayaaya", "X");
			
			babbling[i]=babbling[i].replace("yeye", "X");
		
			babbling[i]=babbling[i].replace("woowoo", "X");
		
			babbling[i]=babbling[i].replace("mama", "X");
			
			//이미 X가 있으면 의미 없으니 continue를 하고 X가 없으면 해당 문자를 O로!
			if(babbling[i].contains("X")) {continue;}
			else {babbling[i]=babbling[i].replaceAll("aya", "O");
			      babbling[i]=babbling[i].replaceAll("ye", "O");
			      babbling[i]=babbling[i].replaceAll("woo", "O");
			      babbling[i]=babbling[i].replaceAll("ma", "O");
                  babbling[i]=babbling[i].replaceAll("O", "");}
			
            //O를 다 빈칸으로 바꿨을 때, 문자가 빈칸이 된다면 발음할 수 있는 단어다!
			if(babbling[i].equals("")) {answer++;}
		}
        return answer;
    }
}