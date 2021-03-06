public class Rectangle {
    private int width;
    private int length;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length*this.width;
    }

    public int perimeter() {
        return 2*(this.length+this.width);
    }
}
