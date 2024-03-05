class Solution {
    public int solution(int[] num_list) {
        int a=0;
        int b=0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                a+=num_list[i];
                a*=10;
            }
            else{
                b+=num_list[i];    
                b*=10;
            }
        }
        int answer = (a+b)/10;
        return answer;
    }
}