package bitmanipulation;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class NoOf1BitsInBinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(numSetBits(5645));
    }
    public static int numSetBits(int A) {
        AtomicInteger count= new AtomicInteger();
        IntStream.range(0,32).forEach(i->{
            int s = A & (1 << i);
            if (s != 0) {
                count.getAndIncrement();
            }
        });
        return count.get();
    }

}