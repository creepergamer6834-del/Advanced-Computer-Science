public class Pokemon {
    private String name;
    private String type;

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "electric");
        Pokemon mewtwo = new Pokemon("Mewtwo", "psychic");

        // System.out.println(pikachu.toString());
        // System.out.println(mewtwo.toString());

        Pokemon[] pokedex = new Pokemon[151];
        pokedex[25] = new Pokemon("Pikachu", "electric");
        pokedex[150] = new Pokemon("Mewtwo", "psychic");
        pokedex[75] = new Pokemon("Graveler", "ground");

        for (int i = 0; i < pokedex.length; i++) {
            if (pokedex[i] != null) {
                System.out.println(pokedex[i].toString());
            }
        }

        int[] numbers = new int[4];
        for (int number : numbers){
            System.out.println(number);
        }
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return name + " " + type;
    }
}
