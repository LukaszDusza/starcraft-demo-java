package dzien_2.starcraft;

import dzien_2.starcraft.logic.Unit;
import dzien_2.starcraft.terran.TerranUnit;
import dzien_2.starcraft.terran.TerranUnitType;
import dzien_2.starcraft.zerg.ZergUnit;
import dzien_2.starcraft.zerg.ZergUnitType;

public class Main {

    public static void main(String[] args) {

        Unit zergling = new ZergUnit(ZergUnitType.ZERGLING);
        Unit hydralisk = new ZergUnit(ZergUnitType.HYDRALISK);

        for (int i = 0; i < 5; i++) {
            zergling.fight(zergling);
            System.out.println(zergling);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            hydralisk.fight(hydralisk);
            System.out.println(hydralisk);
        }

        System.out.println();

        Unit marine = new TerranUnit(TerranUnitType.MARINE);

        for (int i = 0; i < 8; i++) {
            marine.fight(marine);
            System.out.println(marine);
        }



    }
}
