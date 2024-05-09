package com.sba.parkingsystem;

public class HospitalParking implements ParkingSystem{
    int time;
    double surcharge=0.20;

    HospitalParking(int time){
        this.time = time;
    }
    double ticketvalue;
    @Override
     public double processTicket(){

        if(time>=5 && time<=17){
            ticketvalue=MORNING+MORNING*surcharge;
        }
        else if(time>17 && time<=24){
            ticketvalue=NIGHTLY+NIGHTLY*surcharge;
        }
        else if(time>=1 && time<5){
            ticketvalue=TWENTY_FOUR+TWENTY_FOUR*surcharge;
        }
        System.out.print("Price for Hospital parking is $");
        return ticketvalue;
    }

}
