public class Student implements Cloneable {
    String nume;
    Masina masina;

    public Student(String nume, Masina masina) {
        this.nume = nume;
        this.masina = masina;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", masina=" + masina +
                '}';
    }

    @Override
    public Student clone() {
        Student clone = new Student(nume, masina.clone());
        return clone;
    }
}
