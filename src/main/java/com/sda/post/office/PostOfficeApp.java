package com.sda.post.office;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package pack = new Package("coś");

 PackageStatus [] statuses = PackageStatus.values();

        for (PackageStatus status : statuses) {
            System.out.println(status);
        }

        // 2. Pobierz od uzytkownika  nazwe wybranego statusu
        String  chosenStatus = "SENT";

        // 3. Stworzyc obiekt wybranego statusu


    }
}
