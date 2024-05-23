package tz2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public int[] arr;
    int size;
    static final int ARR_SIZE = 1000000;

    public Main(String path) {
        try {
            size = 0;
            arr = new int[ARR_SIZE];
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextInt()) {
                arr[size] = scanner.nextInt();
                ++size;
            }
        } catch (FileNotFoundException error) {}

    }

    public int _min() {
        int mi = arr[0];
        for (int i = 0; i < size; ++i) {
            mi = Math.min(mi, arr[i]);
        }
        return mi;
    }

    public int _max() {
        int mi = arr[0];
        for (int i = 0; i < size; ++i) {
            mi = Math.max(mi, arr[i]);
        }
        return mi;
    }

    public int _sum() throws Exception {
        long mi = 0;
        for (int i = 0; i < size; ++i) {
            mi += arr[i];
            if (mi > Integer.MAX_VALUE) {
                throw new Exception("Overflow!");
            }
        }
        return (int)mi;
    }

    public int _mult() throws Exception {
        long mi = 1;
        for (int i = 0; i < size; ++i) {
            mi *= arr[i];
            if (mi > Integer.MAX_VALUE) {
                throw new Exception("Overflow!");
            }
        }
        return (int)mi;
    }
}