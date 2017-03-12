package power;

import com.sun.tools.ws.processor.model.Fault;

import javax.jws.WebService;
import java.math.BigInteger;
import java.util.List;
/**
 * Created by Daan on 12-3-2017.
 */
@WebService( endpointInterface= "power.WSInterface")
public class stdServiceImpl implements WSInterface{
    @Override
    public Response calculateSTD(Request request) {
        ObjectFactory factory = new ObjectFactory();
        Response response = factory.createResponse();
            List<Double> list = request.getListvalues();
            double sum = 0;
            for (int i = 0;i<list.size();i++){
                sum += list.get(i);
            }
            double mean = sum / list.size();
            double variance = 0;
            for (int i = 0;i<list.size();i++){
                variance += Math.pow(list.get(i) - mean,2);
            }
            double result = Math.sqrt(variance / list.size());
            response.setResult(result);


        return response;
    }
}
