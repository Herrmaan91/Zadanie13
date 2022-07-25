package sets;

import java.util.HashSet;
import java.util.Objects;

public class Restaurant {
    HashSet<Dish> zbiorDan = new HashSet<>();

    void dodajDanie(Dish danie) {
        zbiorDan.add(danie);
    }

    void usunDanie(Dish danie) {
        zbiorDan.remove(danie);
    }

    Dish szukajDaniaPoNazwie(String nazwa) throws RestaurantException{
        for (Dish dish : zbiorDan) {
            if (dish.name == nazwa) return dish;
        }
        throw new RestaurantException("Nie znalazło dania!");
    }
    Dish szukajDaniaPoTypie(TYP typ) throws RestaurantException{
        for (Dish dish : zbiorDan) {
            if (dish.typ == typ) return dish;
        }
        throw new RestaurantException("Nie znalazło dania!");
    }

        @Override
        public String toString () {
            return "Restaurant{" +
                    "zbiorDan=" + zbiorDan +
                    '}';
        }
    }
