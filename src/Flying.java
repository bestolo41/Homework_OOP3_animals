import java.util.Objects;

public class Flying extends Birds {
    private String movementType;

    public Flying(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isBlank() || movementType.isEmpty()) this.movementType = "Нет информации";
        else this.movementType = movementType;
    }

    public void fly() {
        System.out.println("Летаю");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    @Override
    public void go() {
        System.out.println("Перемещаюсь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying that = (Flying) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Тип передвижения: " + getMovementType() + "\n" +
                "Принадлежит классу: " + this.getClass();
    }
}
