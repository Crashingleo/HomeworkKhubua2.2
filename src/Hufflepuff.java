public class Hufflepuff extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.
    //power transhesion
    //На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
    //Zaharia Smith, Sedrik Digory, Djastin Flinch-Fletchi
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return honesty + loyalty + diligence;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше чем " + hufflepuff.getName());
        } else if (ability1 < ability2) {
            System.out.println(hufflepuff.getName() + " лучше чем" + getName());
        } else {
            System.out.println(getName() + " и " + hufflepuff.getName() + " равны");
        }
    }

    public String toString() {
        return String.format(super.toString() + " " + honesty + "" + loyalty + "" + diligence);
    }
}
