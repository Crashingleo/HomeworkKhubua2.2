public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;

    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int baseAbility() {
        return magic + transgression;
    }

    public abstract int ability();

    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = baseAbility();
        int ability2 = hogwarts.baseAbility();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучше чем " + hogwarts.getName());
        } else if (ability1 < ability2) {
            System.out.println(hogwarts.getName() + " лучше чем" + getName());
        } else {
            System.out.println(getName() + " и " + hogwarts.getName() + " равны");
        }
    }

    public void compare(Gryffindor gryffindor) {
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
        return String.format("Студент "
                + name
                + " сила магии - "
                + magic
                + "сила трансгрессии"
                + transgression);
    }
    public void print(){
        System.out.println(this);
    }
}

