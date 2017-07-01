/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class ACA extends PA
{
    private TRect _rect_;
    private PR1 _r1_;

    public ACA()
    {
        // Constructor
    }

    public ACA(
        @SuppressWarnings("hiding") TRect _rect_,
        @SuppressWarnings("hiding") PR1 _r1_)
    {
        // Constructor
        setRect(_rect_);

        setR1(_r1_);

    }

    @Override
    public Object clone()
    {
        return new ACA(
            cloneNode(this._rect_),
            cloneNode(this._r1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACA(this);
    }

    public TRect getRect()
    {
        return this._rect_;
    }

    public void setRect(TRect node)
    {
        if(this._rect_ != null)
        {
            this._rect_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rect_ = node;
    }

    public PR1 getR1()
    {
        return this._r1_;
    }

    public void setR1(PR1 node)
    {
        if(this._r1_ != null)
        {
            this._r1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._r1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rect_)
            + toString(this._r1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rect_ == child)
        {
            this._rect_ = null;
            return;
        }

        if(this._r1_ == child)
        {
            this._r1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rect_ == oldChild)
        {
            setRect((TRect) newChild);
            return;
        }

        if(this._r1_ == oldChild)
        {
            setR1((PR1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
