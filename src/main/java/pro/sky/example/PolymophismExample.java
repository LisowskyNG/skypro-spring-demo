package pro.sky.example;

import pro.sky.domain.Driver;
import pro.sky.domain.TruckDriver;

public class PolymophismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver(
                "Макс",
                "Рокатански",
                "123",
                "2456"
        );
        driver.setDriverLicenseNumber("1234");
        System.out.println("driver.getDriverLicenseNumber() = " + driver.getDriverLicenseNumber());

    }
}
