import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //int[] answer={};
        //HashSet에 모두 넣어서 중복 없애고 오름차순으로 배열할 것.
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<numbers.length;i++)
            for(int j=i+1;j<numbers.length;j++) 
                set.add(numbers[i]+numbers[j]);
        
      //HashSet을 int 배열로 옮기려면 stream 클래스를 이용하여야 한다고 한다...
        //이건 나중에 다시 봐야할듯
        int[] answer= set.stream().mapToInt(Integer::intValue).toArray();
       Arrays.sort(answer);
        return answer;
    }
}