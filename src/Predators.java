import java.util.Objects;

public class Predators extends Mammals {
    private String foodType;

    public Predators(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        setFoodType(foodType);
    }

    public void hunt() {
        System.out.println("Охочусь");
    }
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if (foodType == null || foodType.isEmpty() || foodType.isBlank()) this.foodType = "Нет информации";
        else this.foodType = foodType;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }


    @Override
    public void go() {
        System.out.println("Двигаюсь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators that = (Predators) o;
        return Objects.equals(foodType, that.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Тип пищи: " + getFoodType() + "\n" +
                "Принадлежит классу: " + this.getClass();
    }
}
