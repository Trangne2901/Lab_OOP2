package Case_OOP2.b1;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private String shapeName;
    private String color;

    public Shape(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  "Tên hình học: " + shapeName +
                ", màu sắc: " + color;
    }

    public abstract double calArea();
}
