public class Main {
    public static void main(String[] args) {
        // Condicion if
        int numeroIf = 3;
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        // Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile = " + numeroWhile);
        }

        // Bucle DoWhile
        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println("numeroDoWhile = " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Bucle For
        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }

        // Switch
        String estacion = "verano";

        switch (estacion){
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }

    }
}