class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int bottom = Math.min(y1, y2);
        int top = Math.max(y1, y2);

        int nearX = Math.max(left, Math.min(xCenter, right));
        int nearY = Math.max(bottom, Math.min(yCenter, top));

        int dx = nearX - xCenter;
        int dy = nearY - yCenter;

        return dx*dx + dy*dy <= radius*radius;
    }
}