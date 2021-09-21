public class Main {
    public static void function(int arr[], int i) {
        if (i< arr.length){
            System.out.print(arr[i]+" ");
            i++;
            function(arr,i);
        }
    }
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        int i = 0;
        function(num,i);
    }
}
