package svg.figuras;

public class Ellipse extends Figura{
  int cx;
  int cy;
  int rx;
  int ry;
  int strokewidth;
  String fill;
  String stroke;

  public Ellipse (int cx, int cy, int rx, int ry, int sw, String f, String s){
    this.cx = cx;
    this.cy = cy;
    this.rx = rx;
    this.ry = ry;
    strokewidth = sw;
    fill = f;
    stroke = s;

  }
  public Ellipse () {

  }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getRx() {
        return rx;
    }

    public void setRx(int rx) {
        this.rx = rx;
    }

    public int getRy() {
        return ry;
    }

    public void setRy(int ry) {
        this.ry = ry;
    }

    public int getStrokewidth() {
        return strokewidth;
    }

    public void setStrokewidth(int strokewidth) {
        this.strokewidth = strokewidth;
    }

    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getStroke() {
        return stroke;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

}
