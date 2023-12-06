import org.example.CountDoku;
import org.example.DarthValidator;

public class Main {

    public static void main(String[] args) {

        CountDoku darthSidius = new CountDoku();

        CountDoku anakin = new CountDoku();

        CountDoku yoda = new CountDoku();

        CountDoku obiWan = new CountDoku();

        CountDoku luke = new CountDoku();

        darthSidius.incrementInstanceCount();
        darthSidius.incrementCount();
        System.out.println(darthSidius);

        anakin.incrementInstanceCount();
        anakin.incrementCount();
        System.out.println(anakin);

        yoda.incrementInstanceCount();
        yoda.incrementCount();
        System.out.println(yoda);

        obiWan.incrementInstanceCount();
        obiWan.incrementCount();
        System.out.println(obiWan);

        luke.incrementInstanceCount();
        luke.incrementCount();
        System.out.println(luke);

        System.out.println(DarthValidator.add(12,15));

        System.out.println(DarthValidator.multiply(15,16));

        System.out.println(DarthValidator.division(612,0));

        System.out.println(DarthValidator.substraction(-35,50));

    }

}