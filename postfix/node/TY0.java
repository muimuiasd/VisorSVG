/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TY0 extends Token
{
    public TY0()
    {
        super.setText("y");
    }

    public TY0(int line, int pos)
    {
        super.setText("y");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TY0(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTY0(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TY0 text.");
    }
}
