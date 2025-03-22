class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] sweep = new int[n + 1];  

        for (int i = 0; i < bookings.length; i++) {
            sweep[bookings[i][0] - 1] += bookings[i][2];
            sweep[bookings[i][1]] -= bookings[i][2];
        }
  
        int[] answer = new int[n];
        answer[0] = sweep[0];
        for (int i = 1; i < n; i++) {
            answer[i] = sweep[i] + answer[i - 1];
        }  
        return answer;  
    }
}