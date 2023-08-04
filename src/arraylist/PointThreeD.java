package arraylist;

public class PointThreeD {

  private double xPoint;
  private double yPoint;
  private double zPoint;

  public PointThreeD() {
    xPoint = 0.0;
    yPoint = 0.0;
    zPoint = 0.0;
  }

  public PointThreeD(double xPoint, double yPoint, double zPoint) {
    this.xPoint = xPoint;
    this.yPoint = yPoint;
    this.zPoint = zPoint;
  }

  public double getXPoint() {
    return xPoint;
  }

  public void setXPoint(double xPoint) {
    this.xPoint = xPoint;
  }

  public double getYPoint() {
    return yPoint;
  }

  public void setYPoint(double yPoint) {
    this.yPoint = yPoint;
  }

  public double getZPoint() {
    return zPoint;
  }

  public void setZPoint(double zPoint) {
    this.zPoint = zPoint;
  }

  @Override
  public String toString() {
    return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
  }

}
