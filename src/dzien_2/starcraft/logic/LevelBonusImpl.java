package dzien_2.starcraft.logic;

public class LevelBonusImpl implements LevelBonus {
    @Override
    public void fireBonus(Unit unit) {
            unit.setFire(unit.getFire() + 10);
    }

    @Override
    public void defenceBonus(Unit unit) {
            unit.setDefence(unit.getDefence() + 12);
    }

    @Override
    public void fireRateBonus(Unit unit) {
            unit.setFireRate(unit.getFireRate() + 0.2);
    }

    @Override
    public Unit checkBonus(Unit unit) {
        if(unit.getExperience() > 100){
            fireBonus(unit);
            defenceBonus(unit);
            fireRateBonus(unit);

            if(unit.getExperience() % 10 == 0 ) {
                increaseLevel(unit);
            }
        }

        return unit;
    }

    @Override
    public void increaseLevel(Unit unit) {
        unit.setUnitLevel(unit.getUnitLevel() + 1);
    }


}
