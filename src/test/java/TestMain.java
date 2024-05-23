import org.junit.Test;

import tz2.Main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

public class TestMain {
    @Test
    public void testfuncs() {
        try {
            System.out.println("Functions test start");

            String path1 = "src/main/resources/test1.txt";
            Main main1 = new Main(path1);

            assertEquals(main1._min(), 1);
            assertEquals(main1._max(), 4);
            assertEquals(main1._sum(), 10);
            assertEquals(main1._mult(), 24);
        } catch (Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Test
    public void performancetest() {
        try {
            System.out.println("Performance test start");

            String path2 = "src/main/resources/test2.txt";
            String path3 = "src/main/resources/test3.txt";

            Main main2 = new Main(path2);
            Main main3 = new Main(path3);

            // _min
            long start1 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main2._min();
            }

            long end1 = System.nanoTime();
            long start2 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main3._min();
            }

            long end2 = System.nanoTime();
        
            assertTrue(start1 - end1 > start2 - end2);
            // _max

            start1 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main2._max();
            }

            end1 = System.nanoTime();
            start2 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main3._max();
            }

            end2 = System.nanoTime();
        
            assertTrue(start1 - end1 > start2 - end2);

            // _sum

            start1 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main2._sum();
            }

            end1 = System.nanoTime();
            start2 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main3._sum();
            }

            end2 = System.nanoTime();
        
            assertTrue(start1 - end1 > start2 - end2);

            // _mult

            start1 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main2._mult();
            }

            end1 = System.nanoTime();
            start2 = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                main3._mult();
            }

            end2 = System.nanoTime();
        
            assertTrue(start1 - end1 > start2 - end2);

        } catch (Exception e) {
            fail("Exception " + e.getMessage());
    }
    }

    @Test
    public void singleelementtest() {
        try {
            System.out.println("Single-element array test start");

            String path4 = "src/main/resources/test4.txt";
            Main main4 = new Main(path4);

            int firstel = main4.arr[0];

            assertEquals(main4._min(), firstel);
            assertEquals(main4._max(), firstel);
            assertEquals(main4._sum(), firstel);
            assertEquals(main4._mult(), firstel);
        } catch (Exception e) {
            fail("Exception " + e.getMessage());
        }
    }

    @Test
    public void graphic() {
        try {
            for (int i = 5; i < 105; i++) {
                String path = "src/main/resources/test" + i + ".txt";
                Main main = new Main(path);

                long start = System.nanoTime();

                main._sum();

                long end = System.nanoTime();
                System.out.println(end - start);
            }
        } catch (Exception e) {
            fail("Exception " + e.getMessage());
        }
    }
}