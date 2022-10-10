public class Solution {

  public static int solution(int n) {
   int sum = 0;
    for (int i = 1; i < n; i++) {
      if (i % 3 == 0 && i %  5 == 0) {
        sum += i;
      }else if (i % 3 == 0 || i % 5 == 0){
         sum += i;
      }
    }
    return sum;
    
    
  }
  
  public static void main (String[] args) {
    int nA = 10;
    int nB = 25;
    int nC = 99;
    System.out.println(solution(nA));
    System.out.println(solution(nB));
    System.out.println(solution(nC));
  }
}