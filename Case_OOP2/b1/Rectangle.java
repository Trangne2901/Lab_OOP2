package Case_OOP2.b1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeName, String color, double width, double height) {
        super(shapeName, color);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

//    public String toString() {
//        return "Rectangle{" + "Ten: " + getShapeName()
//                + ", Mau: " + getColor()
//                + ", Chieu dai: " + getHeight()
//                + ", Chieu rong:" + getWidth() + "}";
//    }


    @Override
    public String toString() {
        return super.toString()
                + ", Chieu dai: "+ getHeight()
                + ", Chieu rong: " + getWidth();
    }

    @Override
    public double calArea() {
        return (height * width);
    }
}
