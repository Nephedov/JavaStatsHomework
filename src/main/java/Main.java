import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        int[] payments = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();
        int a = service.countLowMonth(payments);
        System.out.println(a);
    }
}
