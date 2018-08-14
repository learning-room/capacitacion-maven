package capacitacion.maven.dos.dos;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sujeto {


    public static String transformar( Object persona) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        return  mapper.writeValueAsString(persona);
    }

}
