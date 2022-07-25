package sets;

import java.util.Objects;

public class Dish {

    String name;
    int price;
    int calories;
    TYP typ;

    public Dish(String name, int price, int calories, TYP typ) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.typ = typ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return price == dish.price && calories == dish.calories && name.equals(dish.name) && typ == dish.typ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, calories, typ);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", typ=" + typ +
                '}';
    }
}
