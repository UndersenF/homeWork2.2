public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 30, 20, 35, 30, 70);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 40, 40, 25, 40, 65);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 25, 20, 25, 30, 30);

        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 15, 16, 34, 39, 45, 67, 34);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 17, 16, 34, 39, 45, 67, 36);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 27, 78, 56, 23, 67, 45, 34);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 20, 50, 90, 50, 10);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 20, 30, 40, 50, 40);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флечли", 20, 30, 40, 50, 90);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 90, 80, 70, 60, 50);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 90, 80, 70, 60, 50);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 90, 80, 70, 60, 50);

        Hogwarts.printInfAboutStudent(harryPotter);
        Gryffindor.compareGryffindorStudents(ronWeasley,hermioneGranger);
        System.out.println();

        Hogwarts.printInfAboutStudent(dracoMalfoy);
        Slytherin.compareSlytherinStudents(dracoMalfoy,grahamMontague);
        System.out.println();

        Hogwarts.printInfAboutStudent(cedricDiggory);
        String name = cedricDiggory.getName();
        String name2 = justinFinchFletchley.getName();
        System.out.printf("Сумма Пуффендуйских качеств у %s", name + " - " +  Hufflepuff.getSumOfTraits(cedricDiggory) + "\n");
        System.out.printf("Сумма Пуффендуйских качеств у %s", name2 + " - " +  Hufflepuff.getSumOfTraits(justinFinchFletchley) + "\n");
        Hufflepuff.compareHufflepuffStudents(cedricDiggory,justinFinchFletchley);
        System.out.println();

        Hogwarts.printInfAboutStudent(choChang);
        Ravenclaw.compareRavenclawStudents(choChang, padmaPatil);
        System.out.println();

        Hogwarts.compareStudentsPowerOfMagic(dracoMalfoy,harryPotter);
    }
}