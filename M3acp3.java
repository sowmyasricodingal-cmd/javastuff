public class M3acp3 {

    public static void main(String[] args) {

        Level first = new Level(true, 100);
        Level second = new Level(true, 200);
        Level third = new Level(false, 300);

        Game game1 = new Game(first, second, third, false);

        System.out.println("Game 1 Score: " + game1.getScore());

        Level a = new Level(true, 150);
        Level b = new Level(true, 250);
        Level c = new Level(true, 350);

        Game game2 = new Game(a, b, c, true);

        System.out.println("Game 2 Score: " + game2.getScore());
    }
}
