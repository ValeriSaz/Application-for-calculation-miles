public class Main {
    public static void main(String[] args) {
        BonusMilesService bonusMilesService = new BonusMilesService();
        int result = bonusMilesService.calculate(3000);
        System.out.println(result + " Количество миль");


    }
}