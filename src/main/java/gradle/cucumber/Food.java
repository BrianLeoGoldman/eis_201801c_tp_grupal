package gradle.cucumber;

public abstract class Food {

    protected Integer points;

    public Integer getPoints() {
        return points;
    }

    public abstract void effect(Pacman pacman);
}
