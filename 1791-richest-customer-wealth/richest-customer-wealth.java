class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int rows = accounts.length;
        int cols = accounts[0].length;
        for(int i=0;i<rows;i++)
        {
            int temp = 0;
            for(int j=0;j<cols;j++)
            {
                temp += accounts[i][j];
            }
            sum = Integer.max(sum,temp);
        }
        return sum;
    }
}