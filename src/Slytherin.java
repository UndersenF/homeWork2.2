import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstOfPower;


    public Slytherin(String name, int powerOfWitchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstOfPower) {
        super(name, powerOfWitchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstOfPower = thirstOfPower;
    }

    public static void compareSlytherinStudents(Slytherin firstStudent, Slytherin secondStudent) {
        String firstName = firstStudent.getName();
        String secondName = secondStudent.getName();
        if (getSumOfTraits(firstStudent) > getSumOfTraits(secondStudent)) {
            System.out.printf("%s лучший Слезеринец чем %s\n", firstName, secondName);
        } else {
            System.out.printf("%s лучший Слезеринец чем %s\n", secondName, firstName);

        }
    }

    public static int getSumOfTraits(Slytherin student) {
        return student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getThirstOfPower();
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstOfPower == slytherin.thirstOfPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstOfPower);
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstOfPower=" + thirstOfPower +
                ", transgression=" + getTransgression() +
                ", powerOfWitchcraft=" + getPowerOfWitchcraft() +
                '}';
    }
}
