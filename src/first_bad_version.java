public class first_bad_version {
    public int firstBadVersion(int n) {
        int answer = -1;
        int left = 1;
        int right = n;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                if (answer == -1 || middle < answer) {
                    answer = middle;
                }
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return answer;
    }
}
