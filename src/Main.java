import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gryffindor harry = generateGryffindor("Гарри Поттер");
        Gryffindor ron = generateGryffindor("Рон Уизли");
        Ravenclaw luna = generateRavenclaw("Палумна Лавгуд");
        Slytherin draco = generateSlytherin("Драко Малфой");
        Hufflepuff sedric = generateHufflepuff("Седрик Дигори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        sedric.print();

    }

    private static Gryffindor generateGryffindor(String name) {
        return new Gryffindor(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclaw(String name) {
        return new Ravenclaw(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuff(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherin(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}