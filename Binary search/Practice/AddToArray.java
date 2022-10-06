package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
        int[]num={1,2,3,4};
        int k=127;
        List<Integer> res = new ArrayList<>();
        int i = num.length;
        while(--i >= 0 || k > 0) {       //continously decrement the value
            if(i >= 0)
                k += num[i];             //Quotient added to the k always instead of num

            res.add(k % 10);
            k /= 10;
        }
        Collections.reverse(res);       //Collection used to reverse

        System.out.println(res);
    }
}
