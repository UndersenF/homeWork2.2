public class Hogwarts {
    private String name;
    private int powerOfWitchcraft;
    private int transgression;

    public Hogwarts(String name, int powerOfWitchcraft, int transgression) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }

    public static void printInfAboutStudent(Hogwarts name) {
        System.out.println(name);
    }

    public static void compareStudentsPowerOfMagic(Hogwarts firstStudent, Hogwarts secondStudent) {
        String firstSt = firstStudent.getName();
        String secondSt = secondStudent.getName();
        if (getSumOfPowerOfMagic(firstStudent) > getSumOfPowerOfMagic(secondStudent)) {
            System.out.printf("У %s сила магии больше чем у %s", firstSt, secondSt);
        } else {
            System.out.printf("У %s сила магии больше чем у %s", secondSt, firstSt);
        }
    }

    public static int getSumOfPowerOfMagic(Hogwarts student) {
        return student.getTransgression() + student.getPowerOfWitchcraft();
    }


    public String getName() {
        return name;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfWitchcraft=" + powerOfWitchcraft +
                ", transgression=" + transgression +
                '}';
    }
}
