package strategyPattern;

import com.CounterX.strategyPattern.sorter.BucketSort;
import com.CounterX.strategyPattern.sorter.MixedQuickSorter;
import com.CounterX.strategyPattern.sorter.Sorter;
import org.junit.Test;

import java.util.Arrays;

public class SorterTest {

    private final int[] origin = {-74,48,-20,2,10,-84,-5,-9,11,-24,-91,2,-71,64,63,80,28,-30,-58,-11,-44,-87,-22,54,-74,-10,-55,-28,-46,29,10,50,-72,34,26,25,8,51,13,30,35,-8,50,65,-6,16,-2,21,-78,35,-13,14,23,-3,26,-90,86,25,-56,91,-13,92,-25,37,57,-20,-69,98,95,45,47,29,86,-28,73,-44,-46,65,-84,-96,-24,-12,72,-68,93,57,92,52,-45,-2,85,-63,56,55,12,-85,77,-39};
    private final int[] answer = {-96,-91,-90,-87,-85,-84,-84,-78,-74,-74,-72,-71,-69,-68,-63,-58,-56,-55,-46,-46,-45,-44,-44,-39,-30,-28,-28,-25,-24,-24,-22,-20,-20,-13,-13,-12,-11,-10,-9,-8,-6,-5,-3,-2,-2,2,2,8,10,10,11,12,13,14,16,21,23,25,25,26,26,28,29,29,30,34,35,35,37,45,47,48,50,50,51,52,54,55,56,57,57,63,64,65,65,72,73,77,80,85,86,86,91,92,92,93,95,98};

    @Test
    public void test01() {
        int[] a = Arrays.copyOf(origin, origin.length);
        int[] b = answer;
        Sorter sorter = new MixedQuickSorter();
        sorter.sort(a);
        showResult(a, b);
        check(a, b);
    }

    @Test
    public void test02() {
        int[] a = Arrays.copyOf(origin, origin.length);
        int[] b = answer;
        Sorter sorter = new BucketSort();
        sorter.sort(a);
        showResult(a, b);
        check(a, b);
    }

    private void showResult(int[] a, int[] b) {
        System.out.println("a: " + show(a));
        System.out.println("b: " + show(b));
    }

    private String show(int[] a) {
        StringBuilder builder = new StringBuilder("[");
        for (int i : a) {
            builder.append(i).append(", ");
        }
        builder.append("\b\b]");
        return builder.toString();
    }

    private void check(int[] a, int[] b) {
        System.out.print("两数组相等的判断结果为：");
        if (a.length != b.length) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

}
