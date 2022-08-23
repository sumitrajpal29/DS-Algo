public class HelloWorld {
    public static void main(String[] args) {
        int[] arr={5, 0, 7, 4, 8, 1, 3, 0, 7, 2, 0};
        push(arr);
        for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
    }
    static int[] push(int[] arr){
        int j=0,i=0 ;
        while(i<arr.length){
            
            if(arr[i]!=0&&arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
            if(arr[j]!=0)
            j++;
            
            i++;
        }
        return arr;
    }
}