class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double ratio[][] = new double[wt.length][2];
        
        for(int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) wt[i];
        }
        
        Arrays.sort(ratio, (a,b) -> Double.compare(b[1], a[1]));
        
        int weight = capacity;
        double finalValue = 0;
        for(int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];
            
            if(weight >= wt[idx]) {
                finalValue += val[idx];
                weight -= wt[idx];
            } else {
                finalValue += ratio[i][1] * weight;
                weight = 0;
            }
        }
        
        return finalValue;
    }
}