package arraylist;

public class Square {

  private double side;

  public Square() {
    side = 0.0;
  }

  public Square(double side) {
    this.side = side;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getArea() {
    return Math.pow(side, 2);
  }

  @Override
  public String toString() {
    return "Square [side=" + side + "]";
  }

}
