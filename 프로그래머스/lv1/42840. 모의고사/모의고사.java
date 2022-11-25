class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        //큰흐름 
        //1. 1~3번 cnt을 생성해서 규칙에 맞게 case문 만들고 변수에 값 넣기    
        int cnt1=1,cnt2=1,cnt3=1;
        int res1=0,res2=0,res3=0;
        int same1=0,same2=0,same3=0;
        for(int i=0;i<answers.length;i++){
            switch(cnt1){
                case 1: res1=1; cnt1++; break;
                case 2: res1=2; cnt1++; break;
                case 3: res1=3; cnt1++; break;
                case 4: res1=4; cnt1++; break;
                case 5: res1=5; cnt1=1; break;
            }
            switch(cnt2){
                case 1: res2=2; cnt2++; break;
                case 2: res2=1; cnt2++; break;
                case 3: res2=2; cnt2++; break;
                case 4: res2=3; cnt2++; break;
                case 5: res2=2; cnt2++; break;
                case 6: res2=4; cnt2++; break;
                case 7: res2=2; cnt2++; break;
                case 8: res2=5; cnt2=1; break;
            }
            switch(cnt3){
                case 1: res3=3; cnt3++; break;
                case 2: res3=3; cnt3++; break;
                case 3: res3=1; cnt3++; break;
                case 4: res3=1; cnt3++; break;
                case 5: res3=2; cnt3++; break;
                case 6: res3=2; cnt3++; break;
                case 7: res3=4; cnt3++; break;
                case 8: res3=4; cnt3++; break;
                case 9: res3=5; cnt3++; break;
                case 10: res3=5; cnt3=1; break;
            }

            //2. answers와 비교해서 같으면 same 증가! same으로 일치한 횟수 확인
            if(answers[i]==res1)same1++;
            if(answers[i]==res2)same2++;
            if(answers[i]==res3)same3++;
            
        //3. 가장 answers와 많은 사람을 넣기
        //3개 같을때, 2개 같을때, 다 다를때 하기

        //다 다를 때
        if(same1!=same2&&same2!=same3&&same3!=same1){
            //각각 1 2 3이 가장 클 경우
            if(same1>same2&&same1>same3)answer=new int[]{1};
            if(same2>same1&&same2>same3)answer=new int[]{2};
            if(same3>same1&&same3>same2)answer=new int[]{3};
        }

        //3개가 같을 때
        if(same1==same2&&same2==same3)answer=new int[]{1,2,3};
        
        //2개가 같을 때
        if(same1==same2&&same1!=same3){
            if(same1>same3){   
                answer=new int[]{1,2};
            }else{
                answer=new int[]{3};
            }
        }
        if(same2==same3&&same2!=same1){
            if(same2>same1){   
                answer=new int[]{2,3};
            }else{
                answer=new int[]{1};
            }
        }
        if(same3==same1&&same3!=same2){
            if(same3>same2){   
                answer=new int[]{1,3};
            }else{
                answer=new int[]{2};
            }
        }
        }
        
        
        return answer;
    }
}