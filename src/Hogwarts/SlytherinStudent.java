package Hogwarts;

public class SlytherinStudent extends HogwartsStudent {
    private final String faculty = "Slytherin";
    private int cunning;            // хитрость
    private int determination;      // решительность
    private int ambition;           // амбициозность
    private int resourcefulness;    // находчивость
    private int lustForPower;       // жажда власти

    public SlytherinStudent(String studentsName, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentsName, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Cunning: " + this.getCunning()
                + "; Determination: " + this.getDetermination()
                + "; Ambition: " + this.getAmbition()
                + "; Resourcefulness: " + this.getResourcefulness()
                + "; Lust for power: " + this.getLustForPower()
                + "\n");
    }

    public String compareSlytherin(SlytherinStudent match) {
        if (this.qualitiesSum() > match.qualitiesSum())
            return this.getStudentsName() + " is better " + this.getFaculty() + " student than " + match.getStudentsName();
        else if (match.qualitiesSum() > this.qualitiesSum())
            return match.getStudentsName() + " is better " + this.getFaculty() + " student than " + this.getStudentsName();
        else
            return this.getStudentsName() + " and " + match.getStudentsName() + " are equally good " + this.getFaculty() + " students";
    }

    private long qualitiesSum() {
        return this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
    }
}
