package poly.ex;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String word) {
        System.out.println("페이스북에 발송합니다: " + word);
    }
}