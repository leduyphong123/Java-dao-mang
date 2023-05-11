public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] arr2=new int[20];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[arr1.length-i-1];
        }
        for(int i:arr2){
            System.out.println(i);
        }
    }
}