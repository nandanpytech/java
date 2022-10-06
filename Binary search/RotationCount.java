public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15,18,2,4,5,6};
        int temp = findpivot(arr);
        int start=0;
        int end=arr.length-1;
        System.out.println(temp+1);
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 case are necessary:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
