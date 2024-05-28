package org.learning;

public class Ticket {
        public int age;
        public double totalPrice;
        public double priceKm=0.21;

        public Ticket(double km,int age){
            totalPrice=km * priceKm;
            this.age=age;
        }


        public double sale(){
            double newTotalPrice=0;
            double sale;
            if(age<18){
                sale = totalPrice * 25 / 100;
                newTotalPrice = totalPrice - sale;
            }else if(age>65){

                sale = totalPrice * 40 / 100;
                newTotalPrice = totalPrice - sale;
            }
            return newTotalPrice;
        }




}
