/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class THeight extends Token
{
    public THeight()
    {
        super.setText("height");
    }

    public THeight(int line, int pos)
    {
        super.setText("height");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new THeight(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTHeight(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change THeight text.");
    }
}
