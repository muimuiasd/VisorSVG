/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class ABC1 extends PC1
{
    private PC2 _c2_;
    private PAtt _att_;

    public ABC1()
    {
        // Constructor
    }

    public ABC1(
        @SuppressWarnings("hiding") PC2 _c2_,
        @SuppressWarnings("hiding") PAtt _att_)
    {
        // Constructor
        setC2(_c2_);

        setAtt(_att_);

    }

    @Override
    public Object clone()
    {
        return new ABC1(
            cloneNode(this._c2_),
            cloneNode(this._att_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABC1(this);
    }

    public PC2 getC2()
    {
        return this._c2_;
    }

    public void setC2(PC2 node)
    {
        if(this._c2_ != null)
        {
            this._c2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c2_ = node;
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
            + toString(this._c2_)
            + toString(this._att_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._c2_ == child)
        {
            this._c2_ = null;
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
        if(this._c2_ == oldChild)
        {
            setC2((PC2) newChild);
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
