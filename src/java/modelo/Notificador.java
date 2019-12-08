package modelo;

import com.google.gson.Gson;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class Notificador {

    public static void enviar(DatosParaEnviar dato) throws Exception{
        String URL = "https://fcm.googleapis.com/fcm/send";
        HttpPost httpPost = new HttpPost(URL);

        //add request header
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Authorization", "key=AAAABDjj2UM:APA91bGrjdK-KrS5_PYJGecOLcG3zIkccniS3k-NbgoFK9zk3v2j_JD5ODZ58_nA8PJBTkw4R-q9UtNcVu7MV_1Oq-KSU2ngU3UnwBxikUQxjZY4l3hDXqPLuOQwuQjxC0SbLVYYUjRM");
        
        Gson gson = new Gson();
        String parametros = gson.toJson(dato);
        
        System.out.println("Sending...");
        System.out.println(parametros);
        System.out.println("");
        
        StringEntity entity = new StringEntity(parametros);

       // JSON-Object übergeben
        httpPost.setEntity(entity);

        HttpClient httpClient = HttpClientBuilder.create().build();

        BasicResponseHandler responseHandler = new BasicResponseHandler();
        String response = (String) httpClient.execute(httpPost, responseHandler);
        System.out.println("Response");
        System.out.println(response);
    }
    
}