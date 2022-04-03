import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        //    intList.removeIf(x -> (x < 0));       Как я понял удалять из готового ArrayList нельзя
        //    intList.removeIf(x -> (x % 2 != 0));

        Collections.sort(intList);

        for (int i : intList) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
