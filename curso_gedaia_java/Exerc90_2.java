import java.util.*;

public class Exerc90_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digita os numeros e separa com espaço, ou vai da errado:");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        int numSubconjuntos = 1 << nums.length;
        for (int i = 0; i < numSubconjuntos; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }

        result.forEach(System.out::println);
        scanner.close();
    }
}