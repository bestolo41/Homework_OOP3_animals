public class Main {
    public static void main(String[] args) {
        Herbivores giraffe = new Herbivores("Мелман", 2, "Саванна", 15, "Листья");
        System.out.println(giraffe);
        giraffe.eat();
        giraffe.sleep();
        giraffe.go();
        giraffe.walking();
        giraffe.graze();

        Predators tiger = new Predators("Тигра", 3, "Джунгли", 50, "Другие животные");

        System.out.println(tiger);
        tiger.eat();
        tiger.sleep();
        tiger.go();
        tiger.walking();
        tiger.hunt();

        Amphibians frog = new Amphibians("Crazy", 1, "Водоемы и земля");

        System.out.println(frog);
        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();

        Flightless penguin = new Flightless("Лоло", 1, "Арктика", "Ходьба");

        System.out.println(penguin);
        penguin.eat();
        penguin.sleep();
        penguin.go();
        penguin.hunt();
        penguin.walking();

        Flying albatross = new Flying("Уилбур", 3, "Море", "Летать");

        System.out.println(albatross);
        albatross.eat();
        albatross.sleep();
        albatross.go();
        albatross.hunt();
        albatross.fly();

    }
}