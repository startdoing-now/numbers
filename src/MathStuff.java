import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {

        /*
        * Random có hẳn như ri luôn heng
        *có cae secureRandom nựa
        *
        * */
//        Random random = new Random();
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(9));
//        System.out.println(random.nextInt(10));
//        System.out.println(random.nextInt(10));

        //========BIG DECIMAL========= TÍNH TOÁN CHÍNH XÁC HƠN NHIỂU FLOAT VỚI DOUBLE NẾU KHÔNG MUOONS NÓI LÀ 100%
//        System.out.println(new BigDecimal("1.05").subtract(new BigDecimal("0.15")));//subtract là trừ đi
//        System.out.println(new BigDecimal("1.05").add(new BigDecimal("0.111232445")));//add là cộng
//        //System.out.println(new BigDecimal("1.25").divide(new BigDecimal("4.24534545")));//tại mi muốn tính toán chính xác tuyệt nhưng mà t tính thì không dừng được cho t biết muốn dừng ở mấy số thập phaan để t tính
//        //muốn biết lấy mấy số thập phân thì phải new MathContent heng oke cậu có liền
//        MathContext mc = new MathContext(5);   //mình muốn lấy sau số 0 5 số heng cậu làm giúp mình nhé
//        System.out.println(new BigDecimal("1.25").divide(new BigDecimal("4.24534545"), mc));

        BigDecimal num1 = new BigDecimal("123456789098765432123455678977543123456785323246778642325");
        BigDecimal num2 = new BigDecimal("12345678909876543212345567897754312345678532324677864232578767453463456");
        System.out.println(num1.subtract(num2));



    }
}
