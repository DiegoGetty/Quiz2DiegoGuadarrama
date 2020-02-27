import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args) {
        // left empty on purpose
    }

    @Test
    public void testBubbleSort() {

        int[] inputs = {5,4,3,2,1};
        int[] expects = {1,2,3,4,5};

        bubbleSort(inputs);

        assertArrayEquals(inputs, expects);
    }

    // to sort in ascending order
    public static void bubbleSort(int[] data) {
        // check data size
        int n = data.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (data[j] > data[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
    }

    private static void swap(int[] data, int j) {
        int k = data[j];
        data[j] = data[j+1];
        data[j+1] = k;
    }
}