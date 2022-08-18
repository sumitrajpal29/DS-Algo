package String;

public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            String prefix="";
            String largestPrefix="";
            boolean flag=true;
            int l=0; int i=0;

            while(flag){


                for(i=0; i<strs.length; i++){
                    if(strs[i]==""){
                        flag=false;
                    }
                    else
                        prefix+=strs[i].charAt(l);

                    if(strs[i].charAt(l)!=prefix.charAt(l))
                        flag=false;
                }
                if(flag) {
                    largestPrefix=prefix;
                    l++;
                }
            }
            return largestPrefix;
        }
    }
}
