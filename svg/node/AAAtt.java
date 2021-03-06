/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class AAAtt extends PAtt
{
    private PAtt0 _att0_;

    public AAAtt()
    {
        // Constructor
    }

    public AAAtt(
        @SuppressWarnings("hiding") PAtt0 _att0_)
    {
        // Constructor
        setAtt0(_att0_);

    }

    @Override
    public Object clone()
    {
        return new AAAtt(
            cloneNode(this._att0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAAtt(this);
    }

    public PAtt0 getAtt0()
    {
        return this._att0_;
    }

    public void setAtt0(PAtt0 node)
    {
        if(this._att0_ != null)
        {
            this._att0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._att0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._att0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._att0_ == child)
        {
            this._att0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._att0_ == oldChild)
        {
            setAtt0((PAtt0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
