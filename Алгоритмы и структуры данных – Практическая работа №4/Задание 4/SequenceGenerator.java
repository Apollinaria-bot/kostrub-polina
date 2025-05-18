import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SequenceGenerator {
    public static void main(String[] args) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();

        long u0 = 1;
        queue.add(u0);
        seen.add(u0);

        int count = 20;
        int generated = 0;

        System.out.println("Последовательность u без дубликатов:");

        while (generated < count) {
            long current = queue.poll();
            System.out.println(current);
            generated++;

            long y = 2 * current + 1;
            long z = 3 * current + 1;

            if (!seen.contains(y)) {
                seen.add(y);
                queue.add(y);
            }
            if (!seen.contains(z)) {
                seen.add(z);
                queue.add(z);
            }
        }
    }
}