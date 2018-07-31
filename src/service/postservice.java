package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class postservice {

	 public static void main(String a[]){
         
	        String url = "http://localhost:8085/RestExamples/rest/Order/Order";
	        HttpURLConnection urlConn = null;
	        BufferedReader reader = null;
	        OutputStream ouputStream = null;
	        String jsonInput = "{\"custmer\":\"Java2novice\",\"address\":\"Bangalore\","+
	                            "\"amount\":\"$2000\"}";
	        try {
	            URL urlObj = new URL(url);
	            urlConn = (HttpURLConnection) urlObj.openConnection();
	            urlConn.setDoOutput(true);
	            urlConn.setRequestMethod("POST");
	            urlConn.setRequestProperty("Content-Type", "application/json");
	            urlConn.setConnectTimeout(5000);
	            urlConn.setReadTimeout(5000);
	            urlConn.setRequestProperty("Accept", "application/json");
	            // send json input request
	            ouputStream = urlConn.getOutputStream();
	            ouputStream.write(jsonInput.getBytes());
	            ouputStream.flush();
	            if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
	                System.err.println("Unable to connect to the URL...");
	                return;
	            }
	            System.out.println("Connected to the server...");
	            InputStream is = urlConn.getInputStream();
	            reader = new BufferedReader(new InputStreamReader((is)));
	            String tmpStr = null;
	            while((tmpStr = reader.readLine()) != null){
	                System.out.println(tmpStr);
	            }
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(reader != null) reader.close();
	                if(urlConn != null) urlConn.disconnect();
	            } catch(Exception ex){
	                 }
	        }
	    }
}
