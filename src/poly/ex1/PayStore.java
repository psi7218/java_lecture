package poly.ex1;

public abstract class PayStore {

    public static pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        }
        else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}