/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class ACoorx0 extends PCoorx0
{
    private TX0 _x0_;
    private TIg _ig_;
    private PNum _num_;

    public ACoorx0()
    {
        // Constructor
    }

    public ACoorx0(
        @SuppressWarnings("hiding") TX0 _x0_,
        @SuppressWarnings("hiding") TIg _ig_,
        @SuppressWarnings("hiding") PNum _num_)
    {
        // Constructor
        setX0(_x0_);

        setIg(_ig_);

        setNum(_num_);

    }

    @Override
    public Object clone()
    {
        return new ACoorx0(
            cloneNode(this._x0_),
            cloneNode(this._ig_),
            cloneNode(this._num_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACoorx0(this);
    }

    public TX0 getX0()
    {
        return this._x0_;
    }

    public void setX0(TX0 node)
    {
        if(this._x0_ != null)
        {
            this._x0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._x0_ = node;
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

    public PNum getNum()
    {
        return this._num_;
    }

    public void setNum(PNum node)
    {
        if(this._num_ != null)
        {
            this._num_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._num_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._x0_)
            + toString(this._ig_)
            + toString(this._num_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._x0_ == child)
        {
            this._x0_ = null;
            return;
        }

        if(this._ig_ == child)
        {
            this._ig_ = null;
            return;
        }

        if(this._num_ == child)
        {
            this._num_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._x0_ == oldChild)
        {
            setX0((TX0) newChild);
            return;
        }

        if(this._ig_ == oldChild)
        {
            setIg((TIg) newChild);
            return;
        }

        if(this._num_ == oldChild)
        {
            setNum((PNum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
