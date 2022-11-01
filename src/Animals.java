import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public abstract void go();

    public final void sleep() {
        System.out.println("Сплю");
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) this.name = "default";
        else this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age < 0) this.age = 0;
        else this.age = age;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {

        return "\nКличка: " + name + "\n" +
                "Возраст: " + age;
    }
}
