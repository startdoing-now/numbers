import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {

    public static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    public static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();
    public static BigDecimal Calculate (String principal, String rate, int period, String contribution) throws ParseException {
        //balance y = p(1+r)^y + c[((1+r)^y - 1)/r]
        String rateAsPercent = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period);//(1+r)^y
        BigDecimal b = a.subtract(new BigDecimal("1"));//(1+r)^y - 1)
        BigDecimal c = b.divide(new BigDecimal(rateAsPercent));//((1+r)^y - 1)/r
        BigDecimal d = c.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));//c[((1+r)^y - 1)/r]
        BigDecimal e = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString()));
        BigDecimal f = e.add(d);
        return  f;





    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("#,###.00vnd;(#vnd)");
        DecimalFormat pf = new DecimalFormat("#,###.00000%");
//        System.out.println(pf.format(12456.09686));

        BigDecimal balance = CompoundInterestCalc.Calculate("$23333,300", "8%", 10, "$37,500");

//        System.out.println(df.format(balance.negate()));
        String myMoney = String.format("%,(.2fvnd", balance);
        System.out.println(myMoney);


    }



}
