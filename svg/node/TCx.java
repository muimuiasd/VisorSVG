/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TCx extends Token
{
    public TCx()
    {
        super.setText("cx");
    }

    public TCx(int line, int pos)
    {
        super.setText("cx");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCx(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCx(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCx text.");
    }
}
