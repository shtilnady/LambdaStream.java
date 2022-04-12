import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"wkme", "lwdii", "lsad", "dpsi", "sokck", "apsld", "ginr", "ap", "ber"};
        String[] sortedArray = Arrays.stream(array).sorted().toArray(String[]::new);
        Arrays.stream(sortedArray).forEach(System.out::println);

        System.out.println();

        Operation divThirteen = (x) -> x%13 == 0;
        int[] num = {13, 22, 3, 52, 78, 48, 15293, 2197, 130000, 850};
        for (int x: num) System.out.println(x + " " + divThirteen.divide(x));
    }
}

interface Operation {
    boolean divide(int x);
}