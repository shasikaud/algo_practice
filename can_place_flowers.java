'''
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
'''

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0) return true;
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n <= 1) return true;

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n -= 1;
            if (n==0) return true;
        }

        if (flowerbed[flowerbed.length-1] == 0 
        && flowerbed[flowerbed.length-2] == 0) {
            flowerbed[flowerbed.length-1] = 1;
            n -= 1;
            if (n==0) return true;
        }

        for (int i=1; i<flowerbed.length-1; i++) {
            // System.out.println(i);
            if (n==0) return true;
            if (flowerbed[i-1] == 0 && flowerbed[i] == 0 
            && flowerbed[i+1] == 0) {
                flowerbed[i] = 1;
                n -= 1;
            } 
        }
        
        if (n==0) return true;
        return false;
    }
}