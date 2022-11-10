public class Main {
    public static void main(String[] args) {

        int sk1 = -11;
        double sk2 = 20;
        double sk3 = 10;
        double sk4 = 40;


        boolean atsakymasArTeigiamas = arTeigimas(sk1);
        System.out.println(atsakymasArTeigiamas);

        boolean atsakymasArNeigiamas = arNeigiamas(sk1);
        System.out.println(atsakymasArNeigiamas);

        boolean atsakymasSandaugaIrSuma = sandaugaIrSuma(sk2, sk3);
        System.out.println(atsakymasSandaugaIrSuma);

        String t1 = "ajbfifirhwfasdnf";

        arDaugiauUzDesimt(t1);

        boolean atsakymasArIntervale = arYraIntervale(sk2, sk3, sk4);
        System.out.println(atsakymasArIntervale);

    }



    public static boolean arTeigimas (int skaicius){
        if (skaicius > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean arNeigiamas (int skaicius){
        if (skaicius < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean sandaugaIrSuma (double x, double y){
        if (x * y > x + y){
            return true;
        }
        else {
            return false;
        }

    }

    public static void arDaugiauUzDesimt (String t1){
        if (t1.length() <= 10){
            System.out.println(t1 + t1);
        }
        else {
            System.out.println(t1);
        }
    }

    public static boolean arYraIntervale (double skaicius, double pradzia, double pabaga){
        if (skaicius >= pradzia && skaicius <= pabaga){
            return true;
        }
        else {
            return false;
        }
    }


}