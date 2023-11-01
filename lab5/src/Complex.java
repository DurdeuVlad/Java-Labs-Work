public class Complex {
    protected int re, im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex number){
        return new Complex(this.re + number.re, this.im + number.im);
    }

    public Complex substract(Complex number){
        return new Complex(this.re - number.re, this.im -number.im);
    }

    public Complex multiply(int alpha){
        return new Complex(this.re * alpha, this.im * alpha);
    }
    public Complex multiply(Complex complex){
        return new Complex(this.re * complex.re, this.im * complex.im);
    }


    @Override
    public String toString() {
        if(im==0) return re+"";
        if(im<0) return re +
                " - " + im*(-1) +
                'i';
        return re +
                " + " + im +
                'i';
    }
}
