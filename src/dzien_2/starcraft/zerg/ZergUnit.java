package dzien_2.starcraft.zerg;

import dzien_2.starcraft.logic.Unit;

public class ZergUnit extends Unit {

    ZergUnitType zergUnitType;

    public ZergUnit(ZergUnitType zergUnitType) {
        this.zergUnitType = zergUnitType;

        switch (zergUnitType) {
            case ZERGLING:
                super.setFire(10);
                super.setDefence(25);
                super.setFireRate(3.2);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case ULTRALISK:
                super.setFire(30);
                super.setDefence(21);
                super.setFireRate(0.9);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case HYDRALISK:
                super.setFire(39);
                super.setDefence(18);
                super.setFireRate(1.2);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case DRONE:
                super.setFire(18);
                super.setDefence(41);
                super.setFireRate(2.6);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case BROODLING:
                super.setFire(37);
                super.setDefence(48);
                super.setFireRate(0.2);
                super.setExperience(0);
                super.setUnitLevel(1);
                break;
            case DEFILER:
                super.setFire(10);
                super.setDefence(25);
                super.setFireRate(0.2);
                super.setExperience(0);
                super.setUnitLevel(1);
        }

    }


    @Override
    public String toString() {
        return "LEVEL: "
                + getUnitLevel()
                +" unit: "
                + zergUnitType
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
