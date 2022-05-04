public class BonusMilesService {

    public int calculate(int cost) {
        int countBonus = 20;
        int bonus = cost / countBonus;
        return bonus;
    }
}
