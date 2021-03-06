/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class ABSp0 extends PSp0
{
    private TStroke _stroke_;
    private TDosp _dosp_;
    private TC0 _c0_;

    public ABSp0()
    {
        // Constructor
    }

    public ABSp0(
        @SuppressWarnings("hiding") TStroke _stroke_,
        @SuppressWarnings("hiding") TDosp _dosp_,
        @SuppressWarnings("hiding") TC0 _c0_)
    {
        // Constructor
        setStroke(_stroke_);

        setDosp(_dosp_);

        setC0(_c0_);

    }

    @Override
    public Object clone()
    {
        return new ABSp0(
            cloneNode(this._stroke_),
            cloneNode(this._dosp_),
            cloneNode(this._c0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABSp0(this);
    }

    public TStroke getStroke()
    {
        return this._stroke_;
    }

    public void setStroke(TStroke node)
    {
        if(this._stroke_ != null)
        {
            this._stroke_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stroke_ = node;
    }

    public TDosp getDosp()
    {
        return this._dosp_;
    }

    public void setDosp(TDosp node)
    {
        if(this._dosp_ != null)
        {
            this._dosp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dosp_ = node;
    }

    public TC0 getC0()
    {
        return this._c0_;
    }

    public void setC0(TC0 node)
    {
        if(this._c0_ != null)
        {
            this._c0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stroke_)
            + toString(this._dosp_)
            + toString(this._c0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stroke_ == child)
        {
            this._stroke_ = null;
            return;
        }

        if(this._dosp_ == child)
        {
            this._dosp_ = null;
            return;
        }

        if(this._c0_ == child)
        {
            this._c0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stroke_ == oldChild)
        {
            setStroke((TStroke) newChild);
            return;
        }

        if(this._dosp_ == oldChild)
        {
            setDosp((TDosp) newChild);
            return;
        }

        if(this._c0_ == oldChild)
        {
            setC0((TC0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
