public class MinTimeToVisitPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points == null || points.length <= 1) {return 0;}
        int res = 0;
        for (int i = 1; i<points.length;i++) {
            // Min time = max difference between points
            int x2 = points[i][0], x1 = points[i-1][0];
            int y2 = points[i][1], y1 = points[i-1][1];
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            res += Math.max(dx, dy);
        }
        return res;
    }
}
