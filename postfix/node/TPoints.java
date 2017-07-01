/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TPoints extends Token
{
    public TPoints()
    {
        super.setText("points");
    }

    public TPoints(int line, int pos)
    {
        super.setText("points");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPoints(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPoints(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPoints text.");
    }
}
