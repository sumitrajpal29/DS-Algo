package String;

public class ReverseEachWord {
        public static void main(String args[]) {
            String str="Hello, I am Sumit";
            System.out.println(reverseEachWord(str));
        }

        static String reverseEachWord(String string){
            String reversed="";
            String temp="";

            for(int i=string.length()-1; i>=0; i--){

                if(string.charAt(i)==' '){
                    reversed=' '+temp+reversed;
                    temp="";
                }
                else if(i==0){
                    temp+=string.charAt(i);
                    reversed=temp+' '+reversed;
                }
                else
                    temp+=string.charAt(i);

            }

            return reversed;
        }
    }
