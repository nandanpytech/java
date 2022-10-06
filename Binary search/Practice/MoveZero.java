package Practice;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums={0,1,2,0,12};

        int i = 0, j = 0, n = nums.length;
        while (i < n) {
            if (nums[i] != 0) {                  // only swap  non-zero elements with j
                nums[j++] = nums[i];             //keep tracking j bcoz lastly we need to make zero all elements form j to n
            }
            i++;
        }
        for (i = j; i < n; i++) {             //it make all elements zero form j to n
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }


}
