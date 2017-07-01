/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AS extends PS
{
    private TSvg1 _svg1_;
    private PPr _pr_;
    private TSvg2 _svg2_;

    public AS()
    {
        // Constructor
    }

    public AS(
        @SuppressWarnings("hiding") TSvg1 _svg1_,
        @SuppressWarnings("hiding") PPr _pr_,
        @SuppressWarnings("hiding") TSvg2 _svg2_)
    {
        // Constructor
        setSvg1(_svg1_);

        setPr(_pr_);

        setSvg2(_svg2_);

    }

    @Override
    public Object clone()
    {
        return new AS(
            cloneNode(this._svg1_),
            cloneNode(this._pr_),
            cloneNode(this._svg2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAS(this);
    }

    public TSvg1 getSvg1()
    {
        return this._svg1_;
    }

    public void setSvg1(TSvg1 node)
    {
        if(this._svg1_ != null)
        {
            this._svg1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._svg1_ = node;
    }

    public PPr getPr()
    {
        return this._pr_;
    }

    public void setPr(PPr node)
    {
        if(this._pr_ != null)
        {
            this._pr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pr_ = node;
    }

    public TSvg2 getSvg2()
    {
        return this._svg2_;
    }

    public void setSvg2(TSvg2 node)
    {
        if(this._svg2_ != null)
        {
            this._svg2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._svg2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._svg1_)
            + toString(this._pr_)
            + toString(this._svg2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._svg1_ == child)
        {
            this._svg1_ = null;
            return;
        }

        if(this._pr_ == child)
        {
            this._pr_ = null;
            return;
        }

        if(this._svg2_ == child)
        {
            this._svg2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._svg1_ == oldChild)
        {
            setSvg1((TSvg1) newChild);
            return;
        }

        if(this._pr_ == oldChild)
        {
            setPr((PPr) newChild);
            return;
        }

        if(this._svg2_ == oldChild)
        {
            setSvg2((TSvg2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
