import java.util.Objects;

public class Amphibians extends Animals {

    private String environment;

    public Amphibians(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }

    public void hunt() {
        System.out.println("Охочусь");
    }
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (environment == null || environment.isEmpty() || environment.isBlank()) this.environment = "Нет информации";
        else this.environment = environment;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    @Override
    public void go() {
        System.out.println("Перемещаюсь в воде и на суше");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(environment, that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Среда обитания: " + getEnvironment() + "\n" +
                "Принадлежит классу: " + this.getClass();
    }
}
