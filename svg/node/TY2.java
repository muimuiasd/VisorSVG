/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TY2 extends Token
{
    public TY2()
    {
        super.setText("y2");
    }

    public TY2(int line, int pos)
    {
        super.setText("y2");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TY2(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTY2(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TY2 text.");
    }
}
