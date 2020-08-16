
public class TrappingRainWater {

    public int trap(int[] height) {
        int result = 0;
        int length = height.length;
        for(int i = 1; i < length - 1; i++) {
            int max_left = 0, max_right = 0;
            for(int j = i; j >=0; j--) {
                max_left = Math.max(max_left, height[j]);
            }
            for(int j = i; j < length; j++) {
                max_right = Math.max(max_right, height[j]);
            }
            result += Math.min(max_left, max_right) - height[i];
        }
        return result;
    }

    public int trap1(int[] height) {
        int sum = 0, maxLeft = 0, maxRight = 0, left = 1, right = height.length - 2;
        for (int i = 1; i < height.length - 1; i++) {
            if (height[left - 1] < height[right + 1]) {
                maxLeft = Math.max(maxLeft, height[left - 1]);
                int min = maxLeft;
                if (min > height[left]) {
                    sum += (min - height[left]);
                }
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right + 1]);
                int min = maxRight;
                if (min > height[right]) {
                    sum += (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWater water = new TrappingRainWater();
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water.trap(arr));
        System.out.println(water.trap1(arr));
    }
}
