package pl.michalrola._5_Generics.Item33;

public class Main {
    public static void main(String[] args) {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "Java");
        favorites.putFavorite(Integer.class, 0xCafebabe);
        favorites.putFavorite(Class.class, Favorites.class);

        String favoriteString = favorites.getFavorite(String.class);
        int favoriteInteger = favorites.getFavorite(Integer.class);
        Class<?> favoriteClass = favorites.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString,
                favoriteInteger, favoriteClass.getName());
    }
}
