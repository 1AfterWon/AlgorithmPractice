import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt=1,j=0,k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){cnt++;j=i;}
        }
        answer=new int[cnt];
        j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){answer[k++]=arr[j];j=i;}
            if(i==arr.length-1){answer[k]=arr[i];}
        }

        return answer;
    }
}