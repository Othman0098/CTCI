Point intersection(Point start1, Point end1, Point start2, Point end2) {
    
    // Consider the case if one of them has slope == infinite;
    if (start1.x == end1.x || start2.x == end2.x) {
        if (start1.x == end1.x && start2.x == end2.x) {
            if (start1.x == start2.x) {
                // ....
                return intersection_Point;    
            } else
                return null;
        } else if (start1.x == end1.x) {
            //  ...
            return intersection_Point;
        } else {
            //  ...
            return intersection_Point;
        }
    } else {
        //  Compute the overlap of two line segments on x coordinates;
        //  ...
        return intersection_Point;
    }
    
}


//  Standard Solution seems to be more clear and easy to understand;
