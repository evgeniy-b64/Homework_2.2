package Hogwarts;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hogwarts!");
        // ======================================================
        GryffindorStudent[] gryffindorStudents = {
                createGryffindorStudent("Harry Potter"),
                createGryffindorStudent("Ron Weasley"),
                createGryffindorStudent("Hermione Granger")
        };
        for (GryffindorStudent student : gryffindorStudents) {
            System.out.println(student);
        }
        System.out.println();
        // ======================================================
        SlytherinStudent[] slytherinStudents = {
                createSlytherinStudent("Draco Malfoy"),
                createSlytherinStudent("Vincent Crabbe"),
                createSlytherinStudent("Gregory Goyle")
        };
        for (SlytherinStudent student : slytherinStudents) {
            System.out.println(student);
        }
        System.out.println();
        // ======================================================
        RavenclawStudent[] ravenclawStudents = {
                createRavenclawStudent("Padma Patil"),
                createRavenclawStudent("Cho Chang"),
                createRavenclawStudent("Luna Lovegood")
        };
        for (RavenclawStudent student : ravenclawStudents) {
            System.out.println(student);
        }
        System.out.println();
        // ======================================================
        HufflepuffStudent[] hufflepuffStudents = {
                createHufflepuffStudent("Cedric Diggory"),
                createHufflepuffStudent("Zacharias Smith"),
                createHufflepuffStudent("Justin Finch-Fletchley")
        };
        for (HufflepuffStudent student : hufflepuffStudents) {
            System.out.println(student);
        }
        System.out.println();
        // сравнение внутри факультетов
        System.out.println(gryffindorStudents[0].compareGriffindor(gryffindorStudents[1]));
        System.out.println(slytherinStudents[1].compareSlytherin(slytherinStudents[2]));
        System.out.println(ravenclawStudents[0].compareRavenclaw(ravenclawStudents[2]));
        System.out.println(hufflepuffStudents[0].compareHufflepuff(hufflepuffStudents[1]));
        // сравнение между факультетами
        System.out.println(gryffindorStudents[1].compareHogwartsStudents(slytherinStudents[0]));
        System.out.println(ravenclawStudents[1].compareHogwartsStudents(hufflepuffStudents[2]));
    }

    public static GryffindorStudent createGryffindorStudent(String name) {
        Random random = new Random();
        return new GryffindorStudent(name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }

    public static SlytherinStudent createSlytherinStudent(String name) {
        Random random = new Random();
        return new SlytherinStudent(name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }

    public static RavenclawStudent createRavenclawStudent(String name) {
        Random random = new Random();
        return new RavenclawStudent(name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }

    public static HufflepuffStudent createHufflepuffStudent(String name) {
        Random random = new Random();
        return new HufflepuffStudent(name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
    }
}