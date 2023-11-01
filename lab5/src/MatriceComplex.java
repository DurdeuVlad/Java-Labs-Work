import java.util.Arrays;

public class MatriceComplex {
    protected Complex[][] matrice;


    public MatriceComplex(Complex[][] matrice) {
        this.matrice = matrice;
    }

    public Complex[][] getMatrice() {
        return matrice;
    }

    public MatriceComplex add(MatriceComplex matrice){
        if(matrice.getMatrice().length != this.matrice.length) return null;
        MatriceComplex newMatrice = new MatriceComplex(matrice.getMatrice());
        for (int i = 0; i < matrice.getMatrice().length; i++) {
            for (int j = 0; j < matrice.getMatrice().length; j++) {
                newMatrice.matrice[i][j] = newMatrice.matrice[i][j].add(this.matrice[i][j]);
            }
        }
        return newMatrice;
    }
    public MatriceComplex substract(MatriceComplex matrice){
        if(matrice.getMatrice().length != this.matrice.length) return null;
        MatriceComplex newMatrice = new MatriceComplex(matrice.getMatrice());
        for (int i = 0; i < matrice.getMatrice().length; i++) {
            for (int j = 0; j < matrice.getMatrice().length; j++) {
                newMatrice.matrice[i][j] = newMatrice.matrice[i][j].substract(this.matrice[i][j]);
            }
        }
        return newMatrice;
    }

    public void setMatrice(Complex[][] matrice) {
        this.matrice = matrice;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                s += matrice[i][j].toString() +", ";
            }
            s+= "\n";
        }
        return s;
    }
}
