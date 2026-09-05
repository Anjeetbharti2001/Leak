public class Stars{
    public static void main(String args[]){
        int [] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maxwater = 0;

        while(left < right){
            int width = right - left;

            int h = Math.min(height[left], height[right]);
            int water = width * h;

            maxwater = Math.max(maxwater, water);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println("maximum water = " + maxwater);
    }
}