package Hogwarts;

public class GryffindorStudent extends HogwartsStudent {
    private final String faculty = "Gryffindor";
    private int nobility;   // благородствоь
    private int honor;      // честь
    private int courage;    // храбрость

    public GryffindorStudent(String studentsName, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(studentsName, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Nobility: " + this.getNobility()
                + "; Honor: " + this.getHonor()
                + "; Courage: " + this.getCourage()
                + "\n");
    }

    public String compareGriffindor(GryffindorStudent match) {
        if (this.qualitiesSum() > match.qualitiesSum())
            return this.getStudentsName() + " is better " + this.getFaculty() + " student than " + match.getStudentsName();
        else if (match.qualitiesSum() > this.qualitiesSum())
            return match.getStudentsName() + " is better " + this.getFaculty() + " student than " + this.getStudentsName();
        else
            return this.getStudentsName() + " and " + match.getStudentsName() + " are equally good " + this.getFaculty() + " students";
    }

    private long qualitiesSum() {
        return this.getNobility() + this.getHonor() + this.getCourage();
    }

}
