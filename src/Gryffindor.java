import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int powerOfWitchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, powerOfWitchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public static void compareGryffindorStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        String firstName = firstStudent.getName();
        String secondName = secondStudent.getName();
        if (getSumOfTraits(firstStudent) > getSumOfTraits(secondStudent)) {
            System.out.printf("%s лучший Гриффиндорец чем %s\n", firstName, secondName);
        } else {
            System.out.printf("%s лучший Гриффиндорец чем %s\n", secondName, firstName);

        }
    }

    public static int getSumOfTraits(Gryffindor student) {
        return student.getNobility() + student.getHonor() + student.getBravery();
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + getName() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", transgression=" + getTransgression() +
                ", powerOfWitchcraft=" + getPowerOfWitchcraft() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }
}
