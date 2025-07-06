


class ConstantWind
{
    public static int maxSumOfWindow(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Window size is larger than array.");
            return -1;
        }

        // Compute sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            // Subtract element going out and add element coming in
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumOfWindow(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
