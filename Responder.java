import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
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
    private HashMap<String, String> palabrasClaves;

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
        palabrasClaves = new HashMap<>();
        String palabra = "hola";
        String palabra2 = "cielito";
        String palabra3 = "gas";
        String palabra4 = "adios";
        palabrasClaves.put(palabra,"hola que tal  estas?");
        palabrasClaves.put(palabra2,"dime cielito");
        palabrasClaves.put(palabra3,"dejastes cerrado el gas?");
        palabrasClaves.put(palabra4,"adios!! nos vemos!!!");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return  respuestas.get(random.nextInt(respuestas.size()));
    }

    public String respuestaPorPalabra(String palabras){

        String respuesta = "";

        if(palabrasClaves.containsKey(palabras)){
            respuesta = palabrasClaves.get(palabras);
        }

        else{
            if(respuestas.size() > 0){
                int num = random.nextInt(respuestas.size());
                respuesta = respuestas.get(num);
                respuestas.remove(respuesta);

            }

        }
        return respuesta;
    }
}
