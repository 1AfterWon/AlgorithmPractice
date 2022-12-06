class Solution {
    public int solution(String s) {
        int answer = 0;
        
        //search로 비교할 문자를 찾아가고 같으면 cnt1증가, 다르면 cnt2 증가
        //cnt1은 기준이 되는 문자가 하나 있으니 1로 시작
  	    int search=0,cnt1=1,cnt2=0;
        
		for(int i=0;i<s.length();) {
            
            //search를 하나씩 늘려가며 찾고, 만약 i+serach가 s의 길이보다 크면 answer에 하나 늘리고 나간다
            //--> 마지막 문자열은 조건이 안돼도 1개가 추가되니까!
			search++;
			if(i+search>=s.length()) {answer++;break;}
            
            //s.charAt(i)를 기준으로 search 변수를 이용해서 하나씩 비교한다. 같으면 cnt1++, 다르면 cnt2++
			if(s.charAt(i)==s.charAt(i+search)) {cnt1++;}
			else if(s.charAt(i)!=s.charAt(i+search)) {cnt2++;}

            //cnt1와 cnt2가 같게되면 answer 증가시키고 i(기준점)을 i+search+1로 옮긴다!
            //그 후 문자를 판단할 search와 그 수를 셀 cnt들 초기화!
			if(cnt1==cnt2) {
				answer++;
				i+=search+1;
				search=0;cnt1=1;cnt2=0;
			}
		}
        return answer;
    }
}