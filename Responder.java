import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
   private ArrayList<String> respuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random(System.currentTimeMillis());
        respuestas = new ArrayList<String>();
        respuestas.add("El archivo elegido  se reproduce");
        respuestas.add("El archivo no se encuentra");
        respuestas.add("El archivo es wimy timely");
        respuestas.add("El archivo no se puede leer");
        respuestas.add("Solo tengo 12 archivos tendran que valer para todos");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
         return  respuestas.get(random.nextInt(respuestas.size()));
    }
}
