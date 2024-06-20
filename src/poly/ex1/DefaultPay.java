package poly.ex1;

public class DefaultPay implements pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
