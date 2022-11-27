class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1단계: 대문자를 소문자로
        String step1=new_id.toLowerCase();
        
        //2단계:필요하지 않은 문자 제거
        String step2="";
        for(int i=0;i<step1.length();i++){
            if( ('a'<=step1.charAt(i)&&step1.charAt(i)<='z')||
                ('0'<=step1.charAt(i)&&step1.charAt(i)<='9')||
                step1.charAt(i)=='-'||step1.charAt(i)=='_'||step1.charAt(i)=='.'
            )
        step2+=step1.charAt(i);
        }
        
        //3단계:.. 를 .로 변경
        String step3=step2;
        while(step3.contains("..")){
            step3= step3.replace("..", ".");
        }
        
        //4단계: 처음이나 끝에 . 있으면 제거
        String step4=step3;
        if(step4.length()>0){
        if(step4.charAt(0)=='.'){step4=step4.substring(1,step4.length());}}
        if(step4.length()>0){
        if(step4.charAt(step4.length()-1)=='.'){step4=step4.substring(0, step4.length()-1);}}
        
        
        
        //5단계: 빈 문자열이면 a를 대입
        String step5=step4;
        if(step4.equals("")){
            step5+="a";
        }
        
        //6단계: 길이가 16자 이상이면 길이를 15 후 마침표 검사 다시
        String step6=step5;
        if(step6.length()>15){
            step6=step6.substring(0, 15);
        }
        if(step6.charAt(step6.length()-1)=='.'){step6=step6.substring(0, step6.length()-1);}     
        
        String step7=step6;
        while(step7.length()<3){
            step7+=step7.charAt(step7.length()-1);
        }
        
        answer+=step7;
        return answer;
    }
}