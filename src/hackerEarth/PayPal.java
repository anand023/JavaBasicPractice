package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PayPal {

    public static void square_list_values_8() {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Function<Integer, Integer> square = x -> x * x;
        numbers.stream().map(square).forEach(x -> System.out.println(x));

        // or
        List<Integer> squareNumbers = numbers.stream().map(square)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);

        }

        wr.close();
        br.close();*/
        //square_list_values_8();
        int l=32, r=22;
        long out_ = solve(l, r);
        System.out.println("solve "+out_);
    }
    static long solve(int l, int r){
        // Your code goes here
        int count=0;
        long toggel=l;
        while(toggel > 9){
            ArrayList<Long> list=new ArrayList();
            while(toggel>0){
                list.add(toggel%10);
                toggel=toggel/10;
            }
            Function<Long, Long> square = x -> x * x;
            List<Long> squareNumbers = list.stream().map(square)
                    .collect(Collectors.toList());
            long sum=0;
            for(long li:squareNumbers){
                System.out.println("squareNumbers "+squareNumbers);
                sum=sum+li;
            }
            System.out.println("sum "+ sum);
            if(sum>9){
                toggel=sum;
                continue;
            }
            if(sum==1){
                if(count==0){
                    toggel=r;
                    count=1;
                }else{
                    toggel=1;
                }
            }else{
                count=0;
                break;
            }
        }
        if(count==1){
            return l+r;
        }
        return -1;
    }

}
