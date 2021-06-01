import java.util.Arrays;

public class ArrayUtils {
    public int[] sortArray(int[] tab){
        return Arrays.stream(tab).sorted().toArray();
    }
}
