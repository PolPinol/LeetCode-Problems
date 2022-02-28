class Solution {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        
        int sizeX = binaryX.length();
        int sizeY = binaryY.length();
        int size = Math.max(sizeX, sizeY);
        boolean startCounting = false;
        int distance = 0;
        
        System.out.println(binaryX);
        System.out.println(binaryY);
        
        for (int i = 0; i < size; i++) {
            int actualX;
            int actualY;
            
            if (i < sizeX) {
                actualX = Character.getNumericValue(binaryX.charAt(sizeX - i - 1));
            } else {
                actualX = 0;
            }
            
            if (i < sizeY) {
                actualY = Character.getNumericValue(binaryY.charAt(sizeY - i - 1));
            } else {
                actualY = 0;
            }
            
            distance += actualX ^ actualY;
        }
        
        return distance;
    }
}