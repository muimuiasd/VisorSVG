/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class TX2 extends Token
{
    public TX2()
    {
        super.setText("x2");
    }

    public TX2(int line, int pos)
    {
        super.setText("x2");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TX2(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTX2(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TX2 text.");
    }
}
