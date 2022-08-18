package String;

public class CheckPermutation {
        public static void main(String args[]) {
            String a="aba";
            String b="bob";

            System.out.println(checkPermutation(a,b));
        }

        static boolean checkPermutation(String a, String b){
            boolean bool=true;


            if(a.length()==b.length())
                bool=check(a,b); //for the sake of OOP I made another Method
            else
                bool= false;

            return bool;
        }

        static boolean check(String a, String b){
            int i=0; int j=0; int l=a.length(); boolean bool2=true;


            char[] bChar=new char[l];

            //Making char array from String b
            for(i=0; i<l; i++){
                bChar[i]=b.charAt(i);
            }

            //Checking each char of String a into char[] b array
            for(i=0; i<l; i++){

                for(j=0; j<l; j++){

                    if(a.charAt(i)==bChar[j]){
                        bChar[j]=' ';
                        break;
                    }
                }
                if(j==l) {
                    bool2= false;
                    break;
                }

            }
            return bool2;
        }
    }