package com.sba.parkingsystem;

public class MallParking implements ParkingSystem{
    int time;
    double surcharge=0.10;

    MallParking(int time){
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
        System.out.print("Price for mall parking is $");
        return ticketvalue;
    }

}
