import java.util.Scanner ;

public class Mars {
    private static final float EARTH_SAIZILDAEVA = 9.81f;
    private static final float MARS_SAIZILDAEVA = 3.86f;


    public static void main(final String[] args) {
        Scanner scannerSaizildaeva = new Scanner(System.in);
        float weightEarthSaizildaeva = scannerSaizildaeva.nextFloat();
        double weightMarsSaizildaeva = weightEarthSaizildaeva * MARS_SAIZILDAEVA / EARTH_SAIZILDAEVA;
        System.out.format("Your weight on Mars would be equal to %.4f%n", weightMarsSaizildaeva);
        int weightMarsIntSaizildaeva = (int) weightMarsSaizildaeva;
        System.out.println(" converting the weight to int " + weightMarsIntSaizildaeva);
        char weightMarsCharSaizildaeva = (char) (weightMarsIntSaizildaeva + '0');
        System.out.println(" converting the int to char, warning possible data lose because int can contain more than one digit " + weightMarsCharSaizildaeva);
        int adjustedWeightSaizildaeva = weightMarsCharSaizildaeva - '0' + 5;
        System.out.println(" converting the char to int " + adjustedWeightSaizildaeva);
    }

}