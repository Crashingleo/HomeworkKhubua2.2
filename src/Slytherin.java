public class Slytherin extends Hogwarts {
    //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    //power transhesion
    //Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
    //Drako Malfoy, Grehem Montegy, Gregory Goyl
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public Slytherin(String name, int magic, int transgression,
                     int cunning, int determination, int ambition,
                     int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
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

    public int getIngenuity() {
        return ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public int ability() {
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше чем " + slytherin.getName());
        } else if (ability1 < ability2) {
            System.out.println(slytherin.getName() + " лучше чем" + getName());
        } else {
            System.out.println(getName() + " и " + slytherin.getName() + " равны");
        }
    }

    public String toString() {
        return String.format(super.toString() + " " + cunning + " " + determination + " " + ambition + " " +
                ingenuity + " " + thirstForPower);
    }
}
