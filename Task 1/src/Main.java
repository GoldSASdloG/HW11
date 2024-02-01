public class Main {
    public static void main(String[] args) {

        Phone.madeIn = "China";
        Phone samsuhg = new Phone("8746399475", "sgh23-23", 120);
        samsuhg.reservCall("Pavel");

        Phone aifon = new Phone("8963554635", "11pro", 87);
        aifon.reservCall("Gosha", "89211337444");
        System.out.println(aifon.madeIn);

        Phone nokia = new Phone("8935465368", "21111", 430);
        nokia.reservCall("Vasia");
        System.out.println(nokia.madeIn);
    }
}
