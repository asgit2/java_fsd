class car{
    final void wheels(){
        System.out.println("4 tubeless tires with rim");
    }
    void engine(){
        System.out.println("Petrol");
    }
    void AvgSpeed(){
        System.out.println("120kmpm");
    }
}
class Innova extends car{
    @Override
    void engine(){
        System.out.println("petrol+disel");
    }
    @Override
    void AvgSpeed(){
        System.out.println("100kmpm");
    }
}
class Tesla extends car{
    final void engine(){
        System.out.println("Electric vehicle");
    }
}



class InheritanceClass {
    public static void main(String[] args) {
        Innova innova = new Innova();
        System.out.println("----Innova-----");
        innova.engine();
        innova.AvgSpeed();
        innova.wheels();
        System.out.println("---------------------------");
        Tesla tesla = new Tesla();
        System.out.println("----Tesla Moters----");
        tesla.AvgSpeed();
        tesla.engine();
        tesla.wheels();
    }
}