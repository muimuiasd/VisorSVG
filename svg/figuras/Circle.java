
package svg.figuras;

public class Circle extends Figura{
  int cx;
  int cy;
  int r;


  public Circle (String nombre, int cx, int cy, int r, int strokewidth, String stroke, String fill) {
    super("Circle", strokewidth, stroke, fill);
    this.cx = cx;
    this.cy = cy;
    this.r = r;
    nombreFigura = nombre;

  }
  public Circle (String nombre) {
    super("Circle");
    nombreFigura = nombre; 
  }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getCx() {
        return cx;
    }

    public int getCy() {
        return cy;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
      this.r = r;
    }


}
