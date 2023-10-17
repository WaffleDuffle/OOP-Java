package lab2.task3;

public class Main {
    public static void main(String args[]){
        Point p1 = new Point(1,3);
        p1.changeCoords(6, 8);

        float[] numbers = new float[20];
        for(int i = 0 ; i < numbers.length ; ++i)
            numbers[i] = i;

        Polygon pl1 = new Polygon(numbers);
        pl1.showPolygon();
    }
}
