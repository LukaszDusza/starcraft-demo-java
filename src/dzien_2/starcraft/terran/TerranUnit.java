package dzien_2.starcraft.terran;

import dzien_2.starcraft.logic.Unit;

public class TerranUnit extends Unit {

    TerranUnitType terranUnitType;

    public TerranUnit(TerranUnitType terranUnitType) {
        this.terranUnitType = terranUnitType;

        switch (terranUnitType) {
            case GHOST:
                super.setFire(17);
                super.setDefence(33);
                super.setFireRate(3.2);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case MARINE:
                super.setFire(45);
                super.setDefence(22);
                super.setFireRate(0.9);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case MARUDER:
                super.setFire(27);
                super.setDefence(15);
                super.setFireRate(1.2);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case RAPER:
                super.setFire(31);
                super.setDefence(20);
                super.setFireRate(2.6);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;

        }
    }

    @Override
    public String toString() {
        return "LEVEL: "
                + getUnitLevel()
                +" unit: "
                + terranUnitType
                + " stats: "
                + " fire: "
                + getFire()
                + " defence: "
                + getDefence()
                + " fire rate: "
                + getFireRate()
                + " experience: "
                + getExperience();

    }
}
