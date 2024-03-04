import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int a=1;
        int b=0;
        for(int i=0; i<num_list.length-5; i++){
            answer[b] = num_list[num_list.length-a];
            a++;
            b++;            
        }
        Arrays.sort(answer);
        return answer;
    }
}