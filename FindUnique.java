
//    find unique
//    Ayush Mishra — 08/10/2022
//        2 3 1 6 3 6 2
//        2 4 7 2 7
//        Sumit — 08/10/2022
//        2 3 1 6
//        Sumit — 08/10/2022
        import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        int[] array={1,2,3,4,4,6,5,6,7,8,0,1,3};
        findUnique(array);

    }

    static void findUnique(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int j;
        for(int i=0;i<arr.length;i++){

            for(j=0;j<arr.length;j++){
                if(i==j)
                    continue;

                if(arr[i]==arr[j])
                    break;

            }
            if(j==arr.length)
                list.add(arr[i]);
        }
        System.out.println(list);
    }
}
//HarshPrakash — 08/11/2022
        int returnUnique(vector<int> arr){


        for (int i  = 0 ;  i < arr.size(); i++){
        int flag = 0;
        for (int j = 0 ; j <  arr.size(); j++){

        if((arr[i] == arr[j]) && (i != j)){
        flag++;
        }
        }
        if(flag == 0){
        return arr[i];
        }
        }
        return -1;
        }

