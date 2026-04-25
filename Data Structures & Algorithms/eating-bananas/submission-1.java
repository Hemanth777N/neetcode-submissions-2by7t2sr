//random submission

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                result = mid;
                right = mid - 1; // try smaller speed
            } else {
                left = mid + 1; // need faster speed
            }
        }
        return result;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long totalTime = 0;
        for (int pile : piles) {
            totalTime += (pile + speed - 1) / speed; // ceil division trick
        }
        return totalTime <= h;
    }
}
