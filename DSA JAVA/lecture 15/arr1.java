public class arr1 {
public static void main(String[] args) {
    int[] arr= {1,2,2,3,4};
    boolean d = false;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]==arr[j]){
                d=true;
            }
        }
    }
    if(d){
        System.out.println("duplicate");
    }else{
        System.out.println("no duplicate");
    }
}
}