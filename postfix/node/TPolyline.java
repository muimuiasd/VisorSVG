/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TPolyline extends Token
{
    public TPolyline()
    {
        super.setText("polyline");
    }

    public TPolyline(int line, int pos)
    {
        super.setText("polyline");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPolyline(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPolyline(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPolyline text.");
    }
}
