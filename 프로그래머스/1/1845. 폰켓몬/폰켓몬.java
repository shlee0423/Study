import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int[] newNums = Arrays.stream(nums).distinct().toArray();
        int answer = 0;
        int a = newNums.length; //중복제거 갯수
        int b = nums.length/2;  //가져갈 마릿수
        if(a<=b){
            answer=a;
        }
        else{
            answer=b;
        }
        return answer;
    }
}