import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        int c = Integer.parseInt(ab);
        int d = 2*a*b;
        if(c>=d){
            answer = c;
        }
        else{
            answer = d;
        }
        return answer;
    }
}