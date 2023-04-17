import ru.netology.javaqa.javahwcycles.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        System.out.println("Количество месяцев отдыха: " + service.calculate(10_000, 3_000, 20_000));
    }
}
