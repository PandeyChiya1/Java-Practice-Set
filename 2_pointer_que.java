//Find the sum of first and last element, then move inward and print sums for each pair.
//Example:
//Input: [1, 2, 3, 4, 5]
//Output: 6 (1+5), 6 (2+4), 3 (3+0)

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int l=0;
        int h=arr.length-1;

        while(l<=h){
           int sum = 0;
           sum = arr[l] + arr[h];

            if(l==h){
                System.out.println(arr[l]);
            }else{
                System.out.println(sum);
            }



            l++;
            h--;
            
        }
    }
}
