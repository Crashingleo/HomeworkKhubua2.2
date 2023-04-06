public class Gryffindor extends Hogwarts {
    //Всем Гриффиндорцам присущи благородство, честь и храбрость.
    //power transhesion
    //Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
    //Harry Potter Germione Greyndger Rone Yizly

    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return honor + bravery + nobility;

    }

    public void compareGryffindor(Gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше чем " + gryffindor.getName());
        } else if (ability1 < ability2) {
            System.out.println(gryffindor.getName() + " лучше чем" + getName());
        } else {
            System.out.println(getName() + " и " + gryffindor.getName() + " равны");
        }
    }

    public String toString() {
        return String.format(super.toString() + " " + honor + "храбрость " + bravery + " " +nobility);
    }
}

