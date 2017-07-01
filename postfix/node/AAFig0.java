/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAFig0 extends PFig0
{
    private TLine _line_;

    public AAFig0()
    {
        // Constructor
    }

    public AAFig0(
        @SuppressWarnings("hiding") TLine _line_)
    {
        // Constructor
        setLine(_line_);

    }

    @Override
    public Object clone()
    {
        return new AAFig0(
            cloneNode(this._line_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAFig0(this);
    }

    public TLine getLine()
    {
        return this._line_;
    }

    public void setLine(TLine node)
    {
        if(this._line_ != null)
        {
            this._line_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._line_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._line_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._line_ == child)
        {
            this._line_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._line_ == oldChild)
        {
            setLine((TLine) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}