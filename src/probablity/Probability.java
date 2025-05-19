package probablity;

public class Probability {

    public static double probablityOf(double totalOutComes, double favourableOutComes) {
        if (totalOutComes < favourableOutComes){
            throw new RuntimeException("invalid probability");
        }

        return  favourableOutComes / totalOutComes;
    }
}
