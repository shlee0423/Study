class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a=0;
        int b=0;
        if(arr1.length>arr2.length){
            answer=1;
        }
        else if(arr1.length<arr2.length){
            answer=-1;
        }
        else{
            for(int i=0; i<arr1.length; i++){
                a+=arr1[i];
            }
            for(int j=0; j<arr2.length; j++){
                b+=arr2[j];
            }
            if(a>b){
                answer=1;
            }
            else if(a<b){
                answer=-1;
            }
        }
        return answer;
    }
}