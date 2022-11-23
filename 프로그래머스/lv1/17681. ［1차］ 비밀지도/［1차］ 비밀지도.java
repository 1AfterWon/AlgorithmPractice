
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer=new String[n];
        //프로그램 순서
        //1. |로 해독결과 얻기(아직 10진법)
        //2. 2진법으로 변경
        //3. 출력 형태로 변경 (ex: '## ##')
        
        for(int i=0;i<answer.length;i++){
            //비트연산자로 해독결과 + 2진법으로 바꿔 str에 저장
            String str=Integer.toBinaryString(arr1[i]|arr2[i]);
            //str을 6자리로 바꿔주고 맨 앞 빈 공간은 빈공간으로!
            str=String.format("%"+n+"s",str);
            //answer[i]를 빈 공간으로 설정! (안하면 null임)
            answer[i]=""; 
            //문자열에서 특정 위치 문자가 1이면 #으로, 아니면(공백이나 0)이면 공백으로 바꾸기
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){answer[i]+="#";}
                else{answer[i]+=" ";}
            }
        }
        
        
        return answer;
    }
}