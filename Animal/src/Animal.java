public class Animal {
    private String name;
    private boolean canWalk;
    private boolean canSwim;

    private static String[] walk = new String[100];
    private static String[] swim = new String[100];
    private int countWalk = 0;
    private int countSwim = 0;

    public Animal() {
        this.name = "unknown animal";
        this.canWalk = false;
        this.canSwim = false;
    }

    public Animal(String name, boolean canWalk, boolean canSwim) {
        this.name = name;
        this.canWalk = canWalk;
        this.canSwim = canSwim;
    }

    public void setMovement(Animal animal) {
        if (animal.canWalk) {
            walk[countWalk++] = animal.name;
        }
        if (animal.canSwim) {
            swim[countSwim++] = animal.name;
        }
    }

    public void printMovement() {
        System.out.println("Animals that walk:");
        for (int i = 0; i < countWalk; i++) {
            System.out.println(walk[i]);
        }
        System.out.println("Animals that swim:");
        for (int i = 0; i < countSwim; i++) {
            System.out.println(swim[i]);
        }
    }

    public static void main(String[] args) {
        Animal A = new Animal();
        Pig newPig = new Pig();
        A.setMovement(newPig);
        Duck newDuck = new Duck();
        A.setMovement(newDuck);
        Fish newFish = new Fish();
        A.setMovement(newFish);
        A.printMovement();
    }
}