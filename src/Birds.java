import java.util.Objects;

public abstract class Birds extends Animals {
    private String environment;

    public Birds(String name, int age, String environment) {
        super(name, age);
        setEnvironment(environment);
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (environment == null || environment.isEmpty() || environment.isBlank()) this.environment = "Нет информации";
        else this.environment = environment;
    }

    public final void hunt() {
        System.out.println("Охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(environment, birds.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Среда обитания: " + getEnvironment();
    }
}
