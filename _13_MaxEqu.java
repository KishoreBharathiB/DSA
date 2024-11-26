public class _13_MaxEqu {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int maxSum = getMax(arr);
        System.out.println(maxSum);
    }
    
    public static int getMax(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i ++) {
            totalSum += arr[i];
        }

        for(int i = 0 ; i < arr.length; i++) {
            totalSum -= arr[i];
            if(leftSum == totalSum && leftSum > maxSum) {
                maxSum = leftSum;
            }

            leftSum += arr[i];
        }
        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }
}
