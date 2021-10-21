PROBLEM STATEMENT:
Find the sum of all the primes below two million.


JAVA SOLUTION:

public class Main {

    public static void main(String[] args) {
	// write your code here

        long sum =0L;
        for (long i = 1; i<2_000_000L;i++){
            int c=0;
            if (i%2==0)
                continue;
            for (long j = 1L;j<=i;j++){

                if (i%j==0)
                    c++;


            }

            if (c==2)
                sum+=i;

        }

                System.out.println(sum);

    }
}



