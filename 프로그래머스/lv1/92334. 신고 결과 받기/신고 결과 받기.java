import java.util.HashMap;
import java.util.HashSet;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer= new int[id_list.length];
        HashMap<String, Integer> res=new HashMap<String, Integer>(); //신고당한 횟수 저장할 HashMap
		HashMap<String, Integer> res2=new HashMap<String, Integer>(); //메일 받을 HashMap
        
        //0.id_list 이용해서 res에 <id,0>으로 초반 세팅 
		for(String s:id_list) {
			res.put(s, 0);
			res2.put(s,0);
		}
        
        
		HashSet<String> hs1=new HashSet<String>(); //report 문자열 넣을 hs1
		HashSet<String> hs2=new HashSet<String>(); //정지당할 유저 넣을 hs2
        
        //1.hashset에 넣어서 중복 없애서 한 유저가 다른 유저 여러번 신고하는거 막음
		for(String s:report) {
			hs1.add(s);
		}
        
        //2.HashMap으로 신고당한 횟수를 늘려줌 + k에 도달하면 h2에 추가
        for(String s:hs1) {
			String key=s.substring(s.indexOf(" ")+1,s.length()); //공백 뒤를 파악하면 신고당한 사람 확인 가능
			
			if(res.get(key)<k) {
			res.replace(key,res.get(key)+1); //key= 신고당한 사람이다
			}
			if(res.get(key)==k) {
				hs2.add(key); //k에 도달했으면 신고당한 사람이 정지니까 hs2에 추가
			}
		}
        
        //3.hs2(정지당한유저)를 갖고 와서 hs1(report문)의 뒷문자에 있으면 앞문자를 res2에서 key로 갖는 value에 +1
        //ex:h1="muzi frodo" 면, hs2에 frodo가 있다 -> res2에서 key:muzi의 value를 1 올려준다
        for(String s:hs1) {
			if(hs2.contains(s.split(" ")[1])) {
				res2.put(s.split(" ")[0], res2.get(s.split(" ")[0])+1);
			}
		}
        
        //list_id와 answer의 순서는 같다.
        //answer[i]에 id_list에서 얻은 유저이름을 key로 갖는 값 증가
        for(int i=0;i<id_list.length;i++) {
			answer[i]+=res2.get(id_list[i]);
		}
        return answer;
    }
}