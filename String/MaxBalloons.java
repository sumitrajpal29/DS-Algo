package String;

public class MaxBalloons {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int b=0; int a=0; int l=0; int o=0; int n=0;

            for(int i=0; i<text.length(); i++){
                char value=text.charAt(i);

                if(value=='b')  b++;
                else if(value=='a')  a++;
                else if(value=='l')  l++;
                else if(value=='o')  o++;
                else if(value=='n')  n++;
            }
            l/=2;o/=2;

            int count=0;
            while(b>0&&a>0&&l>0&&o>0&&n>0){
                count++;
                b--;a--;l--;o--;n--;
            }
            return count;
        }
    }
}
