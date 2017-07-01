/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AAStw extends PStw
{
    private TStrokew _strokew_;
    private TIg _ig_;
    private TC0 _c0_;

    public AAStw()
    {
        // Constructor
    }

    public AAStw(
        @SuppressWarnings("hiding") TStrokew _strokew_,
        @SuppressWarnings("hiding") TIg _ig_,
        @SuppressWarnings("hiding") TC0 _c0_)
    {
        // Constructor
        setStrokew(_strokew_);

        setIg(_ig_);

        setC0(_c0_);

    }

    @Override
    public Object clone()
    {
        return new AAStw(
            cloneNode(this._strokew_),
            cloneNode(this._ig_),
            cloneNode(this._c0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAStw(this);
    }

    public TStrokew getStrokew()
    {
        return this._strokew_;
    }

    public void setStrokew(TStrokew node)
    {
        if(this._strokew_ != null)
        {
            this._strokew_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._strokew_ = node;
    }

    public TIg getIg()
    {
        return this._ig_;
    }

    public void setIg(TIg node)
    {
        if(this._ig_ != null)
        {
            this._ig_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ig_ = node;
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
            + toString(this._strokew_)
            + toString(this._ig_)
            + toString(this._c0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._strokew_ == child)
        {
            this._strokew_ = null;
            return;
        }

        if(this._ig_ == child)
        {
            this._ig_ = null;
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
        if(this._strokew_ == oldChild)
        {
            setStrokew((TStrokew) newChild);
            return;
        }

        if(this._ig_ == oldChild)
        {
            setIg((TIg) newChild);
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
