package Hogwarts;

public class HufflepuffStudent extends HogwartsStudent {
    private final String faculty = "Hufflepuff";
    private int industry;   // трудолюбие
    private int loyalty;   // верность
    private int honesty;   // честность

    public HufflepuffStudent(String studentsName, int magicPower, int transgression, int industry, int loyalty, int honesty) {
        super(studentsName, magicPower, transgression);
        this.industry = industry;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Industry: " + this.getIndustry()
                + "; Loyalty: " + this.getLoyalty()
                + "; Honesty: " + this.getHonesty()
                + "\n");
    }

    public String compareHufflepuff(HufflepuffStudent match) {
        if (this.qualitiesSum() > match.qualitiesSum())
            return this.getStudentsName() + " is better " + this.getFaculty() + " student than " + match.getStudentsName();
        else if (match.qualitiesSum() > this.qualitiesSum())
            return match.getStudentsName() + " is better " + this.getFaculty() + " student than " + this.getStudentsName();
        else
            return this.getStudentsName() + " and " + match.getStudentsName() + " are equally good " + this.getFaculty() + " students";
    }

    private long qualitiesSum() {
        return this.getIndustry() + this.getLoyalty() + this.getHonesty();
    }
}
