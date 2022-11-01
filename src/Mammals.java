import java.util.Objects;

public abstract class Mammals extends Animals {
    private String environment;
    private int speed;

    public final String getEnvironment() {
        return environment;
    }

    public final void setEnvironment(String environment) {
        if (environment == null || environment.isEmpty() || environment.isBlank()) this.environment = "Нет информации";
        else this.environment = environment;
    }

    public final int getSpeed() {
        return speed;
    }

    public final void setSpeed(int speed) {
        if (speed <= 0) this.speed = 1;
        else this.speed = speed;
        }

    public Mammals(String name, int age, String environment, int speed) {
        super(name, age);
        setEnvironment(environment);
        setSpeed(speed);
    }

    public void walking() {
        System.out.println("Гуляю");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Среда обитания: " + getEnvironment() + "\n" +
                "Скорость передвижения: " + getSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(environment, mammals.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }
}