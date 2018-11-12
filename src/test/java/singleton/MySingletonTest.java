package singleton;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MySingletonTest {

    @Test
    public void testMySingleton_One() {
        final Deque<Integer> deque = new ArrayDeque<>();

        Runnable r = () -> {
            MySingleton mySingleton = MySingleton.getInstance();
            deque.offer(mySingleton.hashCode());
        };

        Thread thread_one = new Thread(r);
        Thread thread_two = new Thread(r);

        thread_one.start();
        thread_two.start();

        try {
            thread_one.join();
            thread_two.join();
        } catch (InterruptedException e) {
            fail();
        }

        assertEquals(deque.poll(), deque.poll());
    }
}
