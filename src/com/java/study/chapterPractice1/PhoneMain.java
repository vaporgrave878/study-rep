package com.java.study.chapterPractice1;

public class PhoneMain {

    public static void main(String[] args) {
        Phone ph1 = new Phone();
        ph1.number = 967977745;
        ph1.model = "Apple";
        ph1.weight = 300;
        ph1.receiveCall("Eve");
        System.out.println(ph1.getNumber());

        Phone ph2 = new Phone();
        ph2.number = 972933441;
        ph2.model = "Samsung";
        ph2.weight = 320;
        ph2.receiveCall("Max");
        ph2.receiveCall("Yura", 979024374);
        System.out.println(ph2.getNumber());

        Phone ph3 = new Phone();
        ph3.number = 553724518;
        ph3.model = "Xiaomi";
        ph3.weight = 290;
        ph3.receiveCall("Sonya");
        System.out.println(ph3.getNumber());

        Phone mess = new Phone();
        mess.sendMessage(ph1.number, ph3.number);

        System.out.println(ph1.number + " " + ph1.model + " " + ph1.weight);
        System.out.println(ph2.number + " " + ph2.model + " " + ph2.weight);
        System.out.println(ph3.number + " " + ph3.model + " " + ph3.weight);
    }
}
