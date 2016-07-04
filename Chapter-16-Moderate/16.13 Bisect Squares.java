/**
 * The line that cuts two squares in half must connect the two middles.
 * 
 * Be Careful;
 * 
 * Learn from the standard answer;
 * 
 */

public class Square {
    ...
    public Point middle() {
        return new Point((this.left + this.right) / 2.0, (this.top + this.bottom) / 2.0);
    }
    
    /* Return the point where the line segment connecting mid1 and mid2 intercepts the edge of square 1. */
    public Point extend(Point mid1, Point mid2, double size) {
        /* Find what direction the line mid2 -> mid1 goes. */
        double xdir = mid1.x < mid2.x ? -1 : 1;
        double ydir = mid1.y < mid2.y ? -1 : 1;
        
        /* Special case for slope = infinity. */
        if (mid1.x == mid2.x) {
            return new Point(mid1.x, mid1.y + ydir * size / 2.0);
        }
        
        double slope = (mid1.y - mid2.y) / (mid1.x - mid2.x);
        double x1 = 0;
        double y1 = 0;
        
        if (Math.abs(slope) == 1) {
            x1 = mid1.x + xdir * size / 2.0;
            y1 = mid1.y + ydir * size / 2.0;
        } else if (Math.abs(slope) < 1)
            x1 = mid1.x + xdir * size / 2.0;
            y1 = slope * (x1 - mid1.x) + mid1.y;
        } else {
            y1 = mid1.y + ydir * size / 2.0;
            x1 = (y1 - mid1.y) / slope + mid1.x;
        }
        return new Point(x1, y1);
    }
    
    public Line cut(Square other) {
        Point p1 = extend(this.middle(), other.middle(), this.size);
        Point p2 = extend(this.middle(), other.middle(), -1 * this.size);
        Point p3 = extend(other.middle(), this.middle(), other.size);
        Point p4 = extend(other.middle(), this.middle(), -1 * other.size);
        
        Point start = p1;
        Point end = p1;
        Point[] points = {p2, p3, p4};
        for (int i = 0; i < points.length; i++) {
            if (points[i].x < start.x || (points[i].x == start.x && points[i].y < start.y)) {
                start = points[i];
            } else if (points[i].x > end.x || (points[i].x == end.x && points[i].y > end.y)) {
                end = points[i];
            }
        }
        
        return new Line(start, end);
    }
    
}
