package Hogwarts;

public class HogwartsStudent {
    private String studentsName;
    private int magicPower;
    private int transgression;

    public HogwartsStudent(String studentsName, int magicPower, int transgression) {
        this.studentsName = studentsName;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return ("Student: "+this.getStudentsName()+"\nMagic power: "+this.getMagicPower()+"; Transgression: "+this.getTransgression()+"\n");
    }

    public String compareHogwartsStudents(HogwartsStudent match) {
        if (this.qualitiesSum() > match.qualitiesSum())
            return this.getStudentsName() + " is better student than " + match.getStudentsName();
        else if (match.qualitiesSum() > this.qualitiesSum())
            return match.getStudentsName() + " is better student than " + this.getStudentsName();
        else
            return this.getStudentsName() + " and " + match.getStudentsName() + " are equally good students";
    }

    private long qualitiesSum() {
        return this.getMagicPower() + this.getTransgression();
    }
}
