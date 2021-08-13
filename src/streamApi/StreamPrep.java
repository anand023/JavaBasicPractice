package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StreamPrep {
    public static void main(String[] args) {
        List<Integer> numbersList= new ArrayList();

        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        // old way or iterative way
        int temp =0;
        for (int num : numbersList){
            temp=temp+num;
        }
        System.out.println(temp);

        // using lambda
        AtomicInteger ansL= new AtomicInteger();
        numbersList.forEach((i) -> {
            ansL.set(ansL.get() + i);
            System.out.println(ansL.get());
        });
        //stream API And reduce method
        int sum= numbersList.stream().reduce(0,(ans, i) -> ans+i);
        System.out.println(sum);

        int[] nums={1,2,4,5,7};

        IntStream.range(0,nums.length).map(i->i==0?nums[i]:(nums[i]+=nums[i-1])).toArray();

        /*Arrays.stream(nums).map((i, n) -> {
            if (i == 0) n = n;
            n += n;
        }).toArray();*/
        char[] s = {'h','e','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int l = s.length;
        int t = l;
        if(t%2 == 0)t=t+1;
        for(int i = 0; i < t/2; i++){
            char temp = s[i];
            s[i] = s[l-i-1];
            s[l-1-i] = temp;
        }

    }
}
