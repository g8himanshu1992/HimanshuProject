//Following example shows how to change the host name to its specific IP address with the help of InetAddress.getByName() method of net.
//InetAddress class.
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
   public static void main(String[] args) 
  {
      InetAddress address = null;
      try {
         address = InetAddress.getByName
         ("www.javatutorial.com");
          }
	  catch (UnknownHostException e)
          {
         System.exit(2);
          }
      System.out.println(address.getHostName() + "="
      + address.getHostAddress());
      System.exit(0);
   }
}