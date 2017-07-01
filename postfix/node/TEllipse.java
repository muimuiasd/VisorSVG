/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class TEllipse extends Token
{
    public TEllipse()
    {
        super.setText("ellipse");
    }

    public TEllipse(int line, int pos)
    {
        super.setText("ellipse");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEllipse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEllipse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEllipse text.");
    }
}
