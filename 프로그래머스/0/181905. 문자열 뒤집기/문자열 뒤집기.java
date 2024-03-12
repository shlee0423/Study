class Solution {
    public String solution(String my_string, int s, int e) {
        String a = my_string.substring(s,e+1);
        String answer = new StringBuilder(a).reverse().toString();
        String b = my_string.substring(0,s) + answer + my_string.substring(e+1);
        return b;
    }
}