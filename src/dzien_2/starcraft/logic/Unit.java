package dzien_2.starcraft.logic;

public class Unit implements Actions {

 private int experience;
 private int fire;
 private int defence;
 private double fireRate;
 private int unitLevel;


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public double getFireRate() {
        return fireRate;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    public int getUnitLevel() {
        return unitLevel;
    }

    public void setUnitLevel(int unitLevel) {
        this.unitLevel = unitLevel;
    }

    @Override
    public void fight(Unit unit) {
        unit.setExperience(unit.getExperience() + 40);
        LevelBonusImpl levelUp = new LevelBonusImpl();
        levelUp.checkBonus(unit);
    }
}
