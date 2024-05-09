package com.sba.parkingsystem;

public class Main {
    public static void main(String[] args) {

        HospitalParking hm=new HospitalParking(6);
        System.out.println(hm.processTicket());


        MallParking mm=new MallParking(6);
        System.out.println(mm.processTicket());


    }
}