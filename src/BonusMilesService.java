public class BonusMilesService {
    public int calculate(int cost){
        int rub = 20;
        int countMiles = cost / rub;
        return countMiles;
    }

}
