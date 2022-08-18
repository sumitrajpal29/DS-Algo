package String;

public class RemoveConsecutiveDuplicate  {
        public static void main(String[] args){
            String str="aaaa";
            System.out.println(removeConsecutive(str));
        }

        static String removeConsecutive(String str){

            String newStr="";
            newStr+=str.charAt(0);

            for(int i=1; i<str.length(); i++){

                if(str.charAt(i)!=str.charAt(i-1))
                    newStr+=str.charAt(i);
            }

            return newStr;
        }
    }

