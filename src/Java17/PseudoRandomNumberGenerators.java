package Java17;



import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PseudoRandomNumberGenerators {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGeneratorFactory.of("L64X256MixRandom").create();
        System.out.println(generator.nextInt(100));
    }
}

