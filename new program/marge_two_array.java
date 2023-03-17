public class marge_two_array {
    public static void main(String[] args) {

        int arr[] ={1,2,3,4};
        int arr1[]={5,6,7,8};


        int arr2[]=new int[arr.length+ arr1.length];

        for (int i = 0; i < arr.length; i=i+1) {
            arr2[i]=arr[i];

        }
        for (int i = 0; i < arr1.length; i=i+1) {
            arr2[arr.length+i]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i=i+1) {

            System.out.println(arr2[i]);
        }
    }
}
