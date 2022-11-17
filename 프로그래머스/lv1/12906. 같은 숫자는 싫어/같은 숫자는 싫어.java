import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        //cnt는 배열 길이를 위해, j는 값이 같은지 비교할 index, k는 answer의 index
        int cnt=1,j=0,k=0; 
        //입력받은 arr에서 다른 값이 나오면 cnt를 증가시키고 j(비교군)의 index를 i로 옮겨 다시 비교
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){cnt++;j=i;}
        } 
        //cnt(위에서 중복된 수의 갯수) 만큼 answer의 길이 설정
        answer=new int[cnt];
        j=0;
        //j와 i의 위치가 다르면 answer[k]에 값을 넣고 다시 j와 i의 index 옮김
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){answer[k++]=arr[j];j=i;}
            //이렇게하면 마지막 수는 추가가 안되기 때문에 한 줄 더 작성
            if(i==arr.length-1){answer[k]=arr[i];}
        }

        return answer;
    }
}
