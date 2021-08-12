// 
package tcs;

public class Sort_01 {
  //  1, 0, 0, 2, 0, 1, 0, 0, 1, 2
  //  0 ,1, 0, 2, 0, 1, 0, 0, 1, 2
  //  0, 0, 1, 2, 0, 1, 0, 0, 1, 2
  //  0, 0, 1, 1, 0, 1, 0, 0, 2, 2
  //  0, 0, 0, 0, 0, 1, 1, 1, 2, 2  
    public static void solution(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {

                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;

                    high--;
                    break;
                }

            }
        }
        for (int element : arr) {
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 0, 1, 0, 0, 1, 2};
        solution(arr);

    }
}
