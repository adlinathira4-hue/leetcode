class Solution {
    public boolean squareIsWhite(String coordinates) {
        char column = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        if ((column + row) % 2 == 0) {
            return false; // Black square
        } else {
            return true; // White square
        }
        
    }

}