package Hogwarts;

public class RavenclawStudent extends HogwartsStudent {
    private final String faculty = "Ravenclaw";
    private int intelligence;   // интеллект
    private int wisdom;         // мудрость
    private int wit;            // остроумие
    private int creativity;     // тврочество

    public RavenclawStudent(String studentsName, int magicPower, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(studentsName, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Intelligence: " + this.getIntelligence()
                + "; Wisdom: " + this.getWisdom()
                + "; Wit: " + this.getWit()
                + "; Creativity: " + this.getCreativity()
                + "\n");
    }

    public String compareRavenclaw(RavenclawStudent match) {
        if (this.qualitiesSum() > match.qualitiesSum())
            return this.getStudentsName() + " is better " + this.getFaculty() + " student than " + match.getStudentsName();
        else if (match.qualitiesSum() > this.qualitiesSum())
            return match.getStudentsName() + " is better " + this.getFaculty() + " student than " + this.getStudentsName();
        else
            return this.getStudentsName() + " and " + match.getStudentsName() + " are equally good " + this.getFaculty() + " students";
    }

    private long qualitiesSum() {
        return this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
    }
}
