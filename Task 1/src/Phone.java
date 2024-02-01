public class Phone {

    static String madeIn;

    String number;
    String model;
    double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void reservCall(String name){
        reservCall(name, null);
    }

    public void reservCall(String name, String number){
        System.out.println("Звонит абонент по имени " + name + " его номер: " +
                (number == null ? "N/A" : number));
    }


}
