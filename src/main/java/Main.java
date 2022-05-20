import ru.netology.sqr.SQRService;
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int res = service.RaiseToAPowerToTwo(1000, 1500);
        System.out.println(res);
    }
}
