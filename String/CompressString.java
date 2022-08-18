package String;

public class CompressString {
        public static void main(String args[]) {
            String str="bbbcddddefddfddiuuuii";
            System.out.println(compress(str));
        }

        static String compress(String str){

            String newStr=""+str.charAt(0);
            int counter=1;

            for(int i=1; i<str.length(); i++){

                if(str.charAt(i-1)==str.charAt(i)){
                    counter++;
                }
                else{
                    if(counter>1) newStr+=Integer.toString(counter);
                    counter=1;
                    newStr+=str.charAt(i);
                }

                if(i==str.length()-1&&counter>1) newStr+=Integer.toString(counter);
            }
            return newStr;
        }
    }
