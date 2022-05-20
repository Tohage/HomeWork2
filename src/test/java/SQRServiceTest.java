import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void test1() {
        SQRService service = new SQRService();
        int actual = service.RaiseToAPowerToTwo(300);
        int expect = 3;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void test2() {
        SQRService service = new SQRService();
        int actual = service.RaiseToAPowerToTwo(500);
        int expect = 3;
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void test3() {
        SQRService service = new SQRService();
        int actual = service.RaiseToAPowerToTwo(1000);
        int expect = 3;
        Assertions.assertEquals(expect, actual);
    }
}





