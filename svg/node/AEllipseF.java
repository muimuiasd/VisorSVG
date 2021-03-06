/* This file was generated by SableCC (http://www.sablecc.org/). */

package svg.node;

import svg.analysis.*;

@SuppressWarnings("nls")
public final class AEllipseF extends PF
{
    private TEllipse _ellipse_;
    private PE1 _e1_;

    public AEllipseF()
    {
        // Constructor
    }

    public AEllipseF(
        @SuppressWarnings("hiding") TEllipse _ellipse_,
        @SuppressWarnings("hiding") PE1 _e1_)
    {
        // Constructor
        setEllipse(_ellipse_);

        setE1(_e1_);

    }

    @Override
    public Object clone()
    {
        return new AEllipseF(
            cloneNode(this._ellipse_),
            cloneNode(this._e1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEllipseF(this);
    }

    public TEllipse getEllipse()
    {
        return this._ellipse_;
    }

    public void setEllipse(TEllipse node)
    {
        if(this._ellipse_ != null)
        {
            this._ellipse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ellipse_ = node;
    }

    public PE1 getE1()
    {
        return this._e1_;
    }

    public void setE1(PE1 node)
    {
        if(this._e1_ != null)
        {
            this._e1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ellipse_)
            + toString(this._e1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ellipse_ == child)
        {
            this._ellipse_ = null;
            return;
        }

        if(this._e1_ == child)
        {
            this._e1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ellipse_ == oldChild)
        {
            setEllipse((TEllipse) newChild);
            return;
        }

        if(this._e1_ == oldChild)
        {
            setE1((PE1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
