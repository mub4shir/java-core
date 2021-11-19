import java.util.HashSet;

public class GFG {

    public static void main(String[] args) {
        //        int numbers[] = {1, 2, 3, 4};
        //        int numbers[] = {6, 3, 5, 8};
        //        int kk = 1;
        int numbers[] = {2, 1, 2, 1, 3};
        int kk = 2;
        HashSet<Integer> evenElements = new HashSet<>();
        HashSet<Integer> oddElements = new HashSet<>();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenElements.add(numbers[i]);
            } else {
                oddElements.add(numbers[i]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int odd = 0;
                for (int k = i; k <= j; k++) {
                    boolean flag = true;
                    for (int l = 0; l < i; l++) {
                        if (numbers[l] == numbers[i] && numbers[l + 1] == numbers[j]) {
                            flag = false;
                        }
                    }
                    if (flag) {
                        if (numbers[k] % 2 != 0) {
                            odd = odd + 1;
                        }
                    }
                }
                if (odd != 0 && odd <= kk) {
                    count = count + 1;
                }
            }
        }
        System.out.println(count + oddElements.size() + evenElements.size());
    }
}