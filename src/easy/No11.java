package easy;

import java.util.Arrays;

public class No11 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
        System.out.println(solution(11));
        System.out.println(solution(100));
        System.out.println(solution(1000));
    }

    static public int solution(int N) {
        int count = 0;

        int[] tempArr = new int[2 * N];
        int[] lastArr = new int[2 * N];

        tempArr[tempArr.length - 1] = 1;
        tempArr[tempArr.length - 2] = 1;

        for (int i = 0; i < N - 1; i++) {
            lastArr = tempArr.clone();

            for (int j = 0; j < tempArr.length; j++) { // * 10
                if (j + 1 < tempArr.length) {
                    tempArr[j] = tempArr[j + 1];
                } else {
                    tempArr[j] = 0;
                }
            }

            for (int j = 0; j < tempArr.length; j++) { //  + lastArr
                tempArr[j] += lastArr[j];
            }

            for (int j = 1; j < tempArr.length; j++) { // >= 10
                if (tempArr[tempArr.length - j] > 9) {
                    tempArr[tempArr.length - j] = tempArr[tempArr.length - j] - 10;
                    tempArr[tempArr.length - j - 1] = tempArr[tempArr.length - j - 1] + 1;
                }
            }
        }

//        System.out.println(Arrays.toString(tempArr));

        for (int i : tempArr) {
            if (i == 1) {
                count++;
            }
        }

        return count;
    }
}