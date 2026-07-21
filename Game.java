public class Game {

    private Level level1;
    private Level level2;
    private Level level3;
    private boolean bonus;

    public Game(Level l1, Level l2, Level l3, boolean bonus) {
        level1 = l1;
        level2 = l2;
        level3 = l3;
        this.bonus = bonus;
    }

    public boolean isBonus() {
        return bonus;
    }

    public int getScore() {

        int score = 0;

        if (level1.goalReached()) {
            score += level1.getPoints();

            if (level2.goalReached()) {
                score += level2.getPoints();

                if (level3.goalReached()) {
                    score += level3.getPoints();
                }
            }
        }

        if (isBonus()) {
            score *= 3;
        }

        return score;
    }
}
