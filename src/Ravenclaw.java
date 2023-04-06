public class Ravenclaw extends Hogwarts{
    //Когтевранцы умны, мудры, остроумны и полны творчества.
    //power transhesion
    //На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
    //Chzhoy Chang, Padma Patil, Markus Belbi
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int ability(){
        return wit + creativity +smart + wisdom;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше чем " + ravenclaw.getName());
        } else if (ability1 < ability2) {
            System.out.println(ravenclaw.getName() + " лучше чем" + getName());
        } else {
            System.out.println(getName() + " и " + ravenclaw.getName() + " равны");
        }
    }
    public String toString(){
        return String.format(super.toString() + " " +wit + " " +creativity + " "+smart +" "+ wisdom);
    }
}
