package lab2.task3;

public class Polygon {
    private int edgeNumber; //nr colturi
    private Point[] points;
    public Polygon(int edgeNumber){
        this.edgeNumber = edgeNumber;

        points = new Point[edgeNumber];
    }
    public Polygon(float[] _points){

        this(_points.length/2);
        for(int i = 0 ; i < _points.length ; i += 2){
            points[i/2] = new Point(_points[i], _points[i+1]);
        }

    }
    void showPolygon(){
        for(Point a : points)
            System.out.println(a);
    }
}
