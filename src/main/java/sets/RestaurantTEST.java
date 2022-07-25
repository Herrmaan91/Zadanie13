package sets;

public class RestaurantTEST {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.dodajDanie(new Dish("Gołądki z ziemniakami", 55, 500, TYP.DINNER));
        restaurant.dodajDanie(new Dish("Schabowy z frytkami", 73, 660, TYP.DINNER));
        restaurant.dodajDanie(new Dish("Ryba Dorata z frytkami", 90, 450, TYP.DINNER));
        restaurant.dodajDanie(new Dish("Placek po węgierskuu", 47, 960, TYP.DINNER));
        restaurant.dodajDanie(new Dish("Jajecznica z boczkiem", 44, 440, TYP.BREAKFAST));

        System.out.println(restaurant);

        try {
            Dish znalezione = restaurant.szukajDaniaPoNazwie("Placek po węgiersku");
            System.out.println("UDAŁO SIĘ " + znalezione);
        }catch (RestaurantException e){
            System.out.println(e.getMessage());
        }
    }
}
