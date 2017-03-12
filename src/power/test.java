package power;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daan on 12-3-2017.
 */
public class test {
    public static void main(String[] args) {
        // Testen van de implementatie code
        List<Double> list = new ArrayList<Double>();
        list.add(15.0);
        list.add(15.0);
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);
        list.add(25.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        list.add(15.0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double mean = sum / list.size();
        double variance = 0;
        for (int i = 0; i < list.size(); i++) {
            variance += Math.pow(list.get(i) - mean, 2);
        }
        Double result = Math.sqrt(variance / list.size());
        System.out.println(result);
    }
}
