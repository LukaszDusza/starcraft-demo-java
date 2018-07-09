package dzien_2.starcraft.logic;

public interface LevelBonus {
    void fireBonus(Unit unit);
    void defenceBonus(Unit unit);
    void fireRateBonus(Unit unit);
    Unit checkBonus(Unit unit);
    void increaseLevel(Unit unit);

}
