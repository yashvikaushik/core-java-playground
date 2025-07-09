package networkProgramming;
import java.net.*;
import java.io.*;
public class WhoIsClient {
    public static void main(String[] args) {
        if(args.length<1)
        return;

        String domainName=args[0];

        String hostname="whois.internic.net";
        int port =43;
        System.out.println("connceting to"+hostname+" on port "+port+" for domain: "+domainName);
        try(Socket socket=new Socket(hostname,port)){
            System.out.println("connceted  to "+hostname+" on port "+port);
            OutputStream output=socket.getOutputStream();
            PrintWriter writer=new PrintWriter(output,true);
            System.out.println("sending domain name: "+domainName);
            writer.println(domainName);
            System.out.println("waiting for response....");
            InputStream input=socket.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(input));
            String line;
            System.out.println("response from server");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }



        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    
}
