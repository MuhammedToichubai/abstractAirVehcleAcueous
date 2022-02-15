package com.company;

public class Main {

    public static void main(String[] args) {
        Air airplane = new Airplane();
        Air rocket = new Rocket();
        Air helicopter = new HelicopterVertolet();
        Air gliderPlaner = new GliderPlaner();

        Terrestrial tractor = new Tractor();
        Terrestrial car = new Car();
        Terrestrial metro = new Metro();
        Terrestrial train = new TrainPoezd();

        Aqueous glider = new Glider();
        Aqueous liner = new Liner();
        Aqueous ship = new Ship();
        Aqueous outboardMotor = new OutboardMotor();
        
        VehicleTransport[] vehicleTransports = {airplane,rocket,helicopter,gliderPlaner,tractor,car,metro,train,glider,liner,ship,outboardMotor};
        for (VehicleTransport str:vehicleTransports) {
            if (str instanceof Airplane){
                ((Airplane)str).open();
                ((Airplane)str).turn();
                System.out.println("---------------------------------");
            }
            if (str instanceof Rocket){
                ((Rocket)str).jurot();
                ((Rocket)str).uchat();
                System.out.println("---------------------------------");
            }
            if (str instanceof HelicopterVertolet){
                ((HelicopterVertolet)str).uchat();
                ((HelicopterVertolet)str).konuu();
                System.out.println("---------------------------------");
            }
            if (str instanceof GliderPlaner){
                ((GliderPlaner)str).biyiktik();
                ((GliderPlaner)str).yldamdyk();
                System.out.println("---------------------------------");
            }
            if (str instanceof Tractor){
                ((Tractor)str).jeraidoo();
                ((Tractor)str).oruu();
                System.out.println("---------------------------------");
            }
            if (str instanceof Car){
                ((Car)str).benzin();
                ((Car)str).taxi();
                System.out.println("---------------------------------");
            }
            if (str instanceof Metro){
                ((Metro)str).tashuu();
                ((Metro)str).eshikAchuu();
                System.out.println("---------------------------------");
            }
            if (str instanceof TrainPoezd){
                ((TrainPoezd)str).jukTashuu();
                ((TrainPoezd)str).unChygaruu();
                System.out.println("---------------------------------");
            }
            if (str instanceof Glider){
                ((Glider)str).balyk();
                ((Glider)str).jaryshuu();
                System.out.println("---------------------------------");
            }
            if (str instanceof Liner){
                ((Liner)str).gruzavik();
                ((Liner)str).passajir();
                System.out.println("---------------------------------");
            }
            if (str instanceof Ship){
                ((Ship)str).ekskursiya();
                ((Ship)str).jashoo();
                System.out.println("---------------------------------");
            }
            if (str instanceof OutboardMotor){
                ((OutboardMotor)str).kutkaruu();
                ((OutboardMotor)str).dostavka();
                System.out.println("---------------------------------");
            }
airplane.toString();


        }

    }
}
