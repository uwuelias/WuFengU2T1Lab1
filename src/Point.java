public class Point {
    private int xvalue;
    private int yvalue;
    private int xyvalue;
    public Point(int xvalue, int yvalue){
        this.xvalue = xvalue;
        this.yvalue = yvalue;
    }
    public Point(int xyvalue) {
        if (xyvalue  ) {
            this.xvalue = 0;
            this.yvalue = 0;
        }
        this.xvalue = xyvalue;
        this.yvalue = xyvalue;
    }
    public int getX() {
        return xvalue;
    }
    public int getY() {
        return yvalue;
    }
    public String coordinate() {
        return "("+ getX() + ", " + getY() + ")";
    }
    public String quadrant() {

    }
}
