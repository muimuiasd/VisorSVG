/* This file was generated by SableCC (http://www.sablecc.org/). */

package postfix.node;

import postfix.analysis.*;

@SuppressWarnings("nls")
public final class AFA extends PA
{
    private TPolyline _polyline_;
    private PP _a_;

    public AFA()
    {
        // Constructor
    }

    public AFA(
        @SuppressWarnings("hiding") TPolyline _polyline_,
        @SuppressWarnings("hiding") PP _a_)
    {
        // Constructor
        setPolyline(_polyline_);

        setA(_a_);

    }

    @Override
    public Object clone()
    {
        return new AFA(
            cloneNode(this._polyline_),
            cloneNode(this._a_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFA(this);
    }

    public TPolyline getPolyline()
    {
        return this._polyline_;
    }

    public void setPolyline(TPolyline node)
    {
        if(this._polyline_ != null)
        {
            this._polyline_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._polyline_ = node;
    }

    public PP getA()
    {
        return this._a_;
    }

    public void setA(PP node)
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
            + toString(this._polyline_)
            + toString(this._a_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._polyline_ == child)
        {
            this._polyline_ = null;
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
        if(this._polyline_ == oldChild)
        {
            setPolyline((TPolyline) newChild);
            return;
        }

        if(this._a_ == oldChild)
        {
            setA((PP) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
