package easy;

// 二分法
class Find_value_Index {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 5, 7, 9}, 5));  // 2
        System.out.println(solution(new int[]{1, 5, 5, 5, 5}, 5));  // 1
        System.out.println(solution(new int[]{5, 5, 6, 7, 8}, 5));  // 0
        System.out.println(solution(new int[]{1}, 5));  // -1
        System.out.println(solution(new int[]{5}, 5));  // 0
        System.out.println(solution(new int[]{}, 5));   // -1
    }

    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int left = 0;
        int right = N - 1;

        while (left < right) {
            int m = (left + right) / 2;
            if (A[m] >= X) {
                right = m;
            } else {
                if (left == m) {
                    return A[left] == X ? left : right;
                }
                left = m;
            }
        }

        if (A[left] == X) {
            return left;
        }
        return -1;
    }

    int originSolution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int left = 0;
        int right = N - 1;

        while (left < right) {
            int m = (left + right) / 2;
            if (A[m] > X) {
                right = m - 1;
            } else {
                left = m;
            }
        }

        if (A[left] == X) {
            return left;
        }
        return -1;
    }
}