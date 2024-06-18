package static1;

public class Car {
    private String carName;
    private static int carCnt;

    public Car(String carName) {
        this.carName = carName;
        carCnt ++;
        System.out.println("차량 구입, 이름: " + carName);
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCnt);
    }
}
