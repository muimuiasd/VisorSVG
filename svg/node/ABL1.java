/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class ABL1 extends PL1
{
    private PL0 _l0_;
    private PAtt _att_;

    public ABL1()
    {
        // Constructor
    }

    public ABL1(
        @SuppressWarnings("hiding") PL0 _l0_,
        @SuppressWarnings("hiding") PAtt _att_)
    {
        // Constructor
        setL0(_l0_);

        setAtt(_att_);

    }

    @Override
    public Object clone()
    {
        return new ABL1(
            cloneNode(this._l0_),
            cloneNode(this._att_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABL1(this);
    }

    public PL0 getL0()
    {
        return this._l0_;
    }

    public void setL0(PL0 node)
    {
        if(this._l0_ != null)
        {
            this._l0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l0_ = node;
    }

    public PAtt getAtt()
    {
        return this._att_;
    }

    public void setAtt(PAtt node)
    {
        if(this._att_ != null)
        {
            this._att_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._att_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._l0_)
            + toString(this._att_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._l0_ == child)
        {
            this._l0_ = null;
            return;
        }

        if(this._att_ == child)
        {
            this._att_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._l0_ == oldChild)
        {
            setL0((PL0) newChild);
            return;
        }

        if(this._att_ == oldChild)
        {
            setAtt((PAtt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
