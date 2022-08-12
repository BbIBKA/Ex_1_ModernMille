public class BonusMilesService {
    public int calculate(int cost) {
        if (cost >= 20) {
            cost = cost / 20;
        } else {
            cost = 0;
        }
        return cost;
    }
}
