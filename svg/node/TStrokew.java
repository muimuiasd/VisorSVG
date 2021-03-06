/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TStrokew extends Token
{
    public TStrokew()
    {
        super.setText("stroke-width");
    }

    public TStrokew(int line, int pos)
    {
        super.setText("stroke-width");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStrokew(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStrokew(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStrokew text.");
    }
}
