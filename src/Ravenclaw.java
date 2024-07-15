import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;


    public Ravenclaw(String name, int powerOfWitchcraft, int transgression, int mind, int wisdom, int wit) {
        super(name, powerOfWitchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
    }

    public static void compareRavenclawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        String firstName = firstStudent.getName();
        String secondName = secondStudent.getName();
        if (getSumOfTraits(firstStudent) > getSumOfTraits(secondStudent)) {
            System.out.printf("%s лучший Когтевранец чем %s\n", firstName, secondName);
        } else {
            System.out.printf("%s лучший Когтевранец чем %s\n", secondName, firstName);

        }
    }

    public static int getSumOfTraits(Ravenclaw student) {
        return student.getMind() + student.getWisdom() + student.getWit();
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mind, wisdom, wit);
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name=" + getName() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", transgression=" + getTransgression() +
                ", powerOfWitchcraft=" + getPowerOfWitchcraft() +
                '}';
    }
}
