import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
 





import javax.net.ssl.HttpsURLConnection;

public class mainClass {
	String url = "http://example.com";
	String charset = java.nio.charset.StandardCharsets.UTF_8.name();
	static HttpURLConnection connect;
	static URL object = null;
	public static void main(String[] args) throws IOException {
		String url = "http://challenge.code2040.org/api/register";
		
		
		try {
			object = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connect =  (HttpURLConnection)object.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connect.setRequestMethod("POST");
			connect.setDoOutput(true);
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 BufferedReader in = new BufferedReader(new InputStreamReader(
                 connect.getInputStream()));
		 String inputLine;
		 while ((inputLine = in.readLine()) != null) 
			 System.out.println(inputLine);
		 in.close();
		connect.connect();
      
		
	}

}
