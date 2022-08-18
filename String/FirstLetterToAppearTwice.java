package String;

public class FirstLetterToAppearTwice {
    class Solution {
        public char repeatedCharacter(String s) {
            char[] arr= new char[s.length()];
            boolean found=false;
            int i=0;

            for(i=0; i<s.length(); i++){
                arr[i]=s.charAt(i);
                for(int j=0; j<i; j++){
                    char a=s.charAt(i);
                    char b=arr[j];
                    if(a==b){
                        found=true;
                        break;
                    }
                }
                if(found) break;
            }
            return s.charAt(i);
        }
    }
}
