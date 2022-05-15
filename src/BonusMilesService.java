public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        int bonus = 20;
        cost = price / bonus;
        return cost;
    }
}
