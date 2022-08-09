public class BonusMilesService {
    public int calculate(int price) {
    int cost = 20;
    int miles = (price / cost);

System.out.println("Итого:" + miles);

        return miles;

        }
}