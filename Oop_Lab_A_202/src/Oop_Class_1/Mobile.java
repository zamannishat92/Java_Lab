package Oop_Class_1;

public class Mobile {
        private int charge;

        public Mobile(){
            charge = 10;
        }

        public void slowCharge(){
            charge = charge + 4;
        }

        public void fastCharge(){
            charge = charge + 10;
        }

        public void useMobile(){
            charge = charge - 3;
        }

        public int getCharge(){
            return charge;
        }
    }

