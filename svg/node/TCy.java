/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TCy extends Token
{
    public TCy()
    {
        super.setText("cy");
    }

    public TCy(int line, int pos)
    {
        super.setText("cy");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCy(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCy(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCy text.");
    }
}
