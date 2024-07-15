import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String name, int powerOfWitchcraft, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerOfWitchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void compareHufflepuffStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        String firstName = firstStudent.getName();
        String secondName = secondStudent.getName();
        if (getSumOfTraits(firstStudent) > getSumOfTraits(secondStudent)) {
            System.out.printf("%s лучший Пуффендуец чем %s\n", firstName, secondName);
        } else {
            System.out.printf("%s лучший Пуффендуец чем %s\n", secondName, firstName);

        }
    }

    public static int getSumOfTraits(Hufflepuff student) {
        return student.getDiligence() + student.getLoyalty() + student.getHonesty();
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hufflepuff that)) return false;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diligence, loyalty, honesty);
    }

    @Override
    public String toString() {
        return  "Hufflepuff{" +
                "name=" + getName() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", transgression=" + getTransgression() +
                ", powerOfWitchcraft=" + getPowerOfWitchcraft() +
                '}';
    }
}
