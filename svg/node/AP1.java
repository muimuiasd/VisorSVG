/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class AP1 extends PP1
{
    private TN _n_;
    private TComa _coma_;
    private TN _a_;

    public AP1()
    {
        // Constructor
    }

    public AP1(
        @SuppressWarnings("hiding") TN _n_,
        @SuppressWarnings("hiding") TComa _coma_,
        @SuppressWarnings("hiding") TN _a_)
    {
        // Constructor
        setN(_n_);

        setComa(_coma_);

        setA(_a_);

    }

    @Override
    public Object clone()
    {
        return new AP1(
            cloneNode(this._n_),
            cloneNode(this._coma_),
            cloneNode(this._a_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAP1(this);
    }

    public TN getN()
    {
        return this._n_;
    }

    public void setN(TN node)
    {
        if(this._n_ != null)
        {
            this._n_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._n_ = node;
    }

    public TComa getComa()
    {
        return this._coma_;
    }

    public void setComa(TComa node)
    {
        if(this._coma_ != null)
        {
            this._coma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._coma_ = node;
    }

    public TN getA()
    {
        return this._a_;
    }

    public void setA(TN node)
    {
        if(this._a_ != null)
        {
            this._a_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._a_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._n_)
            + toString(this._coma_)
            + toString(this._a_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._n_ == child)
        {
            this._n_ = null;
            return;
        }

        if(this._coma_ == child)
        {
            this._coma_ = null;
            return;
        }

        if(this._a_ == child)
        {
            this._a_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._n_ == oldChild)
        {
            setN((TN) newChild);
            return;
        }

        if(this._coma_ == oldChild)
        {
            setComa((TComa) newChild);
            return;
        }

        if(this._a_ == oldChild)
        {
            setA((TN) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
