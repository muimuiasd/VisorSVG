/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TX extends Token
{
    public TX()
    {
        super.setText("x");
    }

    public TX(int line, int pos)
    {
        super.setText("x");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TX(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTX(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TX text.");
    }
}
