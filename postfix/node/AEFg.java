/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AEFg extends PFg
{
    private TPolygon _polygon_;

    public AEFg()
    {
        // Constructor
    }

    public AEFg(
        @SuppressWarnings("hiding") TPolygon _polygon_)
    {
        // Constructor
        setPolygon(_polygon_);

    }

    @Override
    public Object clone()
    {
        return new AEFg(
            cloneNode(this._polygon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEFg(this);
    }

    public TPolygon getPolygon()
    {
        return this._polygon_;
    }

    public void setPolygon(TPolygon node)
    {
        if(this._polygon_ != null)
        {
            this._polygon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._polygon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._polygon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._polygon_ == child)
        {
            this._polygon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._polygon_ == oldChild)
        {
            setPolygon((TPolygon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}