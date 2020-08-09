package EnumMapBasic;


enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class Main {

    public static void main(String[] args) {
        Basic.display();
        Methods.display();
        Object.display();




// Specific Data Type:
        // EnumMap:
                // We can use Integer/String/Char/Double/Float/Long/Short/Boolean/Enum etc.

                // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, String> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Double> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Float> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Short> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Integer> sizes1 = new EnumMap<>(Size.class);
                // EnumMap<Size, Boolean> sizes1 = new EnumMap<>(Size.class);


// Class Objects:
        // EnumMap:
                // EnumMap<Key, Book> map = new EnumMap<Key, Book>(Key.class);


    }
}
