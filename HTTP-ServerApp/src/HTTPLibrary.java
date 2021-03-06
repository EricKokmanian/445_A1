import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HTTPLibrary {

	public static void main(String[] args) throws IOException {
	
		if(args[0].equals("httpc")){
		if(args.length > 0) {
			
			if(args[1].toLowerCase().equals("get")) {
		 		    HTTPLibrary.GetRequest(args);
			}
			else if (args[1].toLowerCase().equals("post")){
				HTTPLibrary.PostRequest(args);
			}
			else {
				if(args.length == 3 && args[2].equals("post")) {
					System.out.println("Usage:\n"
							+ "\thttpc post [-v] [-h key:value] [-d inline-data] [-f file] URL\n"
							+ "Post executes a HTTP POST request for a given URL with inline data or from file.\n"
							+ "\t-v: Prints the detail of the response such as protocol, status, and headers.\n"
							+ "\t-h: key:value Associates headers to HTTP Request with the format 'key:value'.\n"
							+ "\t-d: string Associates an inline data to the body HTTP POST request.\n"
							+ "\t-f: file Associates the content of a file to the body HTTP POST request.\n"
							+ "Either [-d] or [-f] can be used but not both.");
				}
				else if(args.length == 3 && args[2].equals("get")) {
					System.out.println("Usage:\n"
							+ "\thttpc get [-v] [-h key:value] URL\n"
							+ "Get executes a HTTP GET request for a given URL.\n"
							+ "\t-v: Prints the detail of the response such as protocol, status, and headers.\n"
							+ "\t-h: key:value Associates headers to HTTP Request with the format 'key:value'.");
				}
				else {
					System.out.println("httpc is a curl-like application but supports HTTP protocol only.\n"
							+ "Usage: \n"
							+ "\thttpc command [arguments]\n"
							+ "The commands are:\n"
							+ "\t- get: executes a HTTP GET request and prints the response.\n"
							+ "\t- post: executes a HTTP POST request and prints the response.\n"
							+ "\t- help: prints this screen.\n"
							+ "Use \"httpc help [command]\" for more information about a command");
				}
			}
		}
		else {
			System.out.println("Please enter valid arguments of the form:\n" + 
					"httpc (get|post) [-v] (-h \"k:v\")* [-d inline-data] [-f file] URL");
		}
	} 


	}
	
	// Method representing the GET operation
	public static void GetRequest(String[] args) {
		
		HTTPGet httpGet = new HTTPGet();
		
		httpGet.setUrl(args[args.length - 1]);
		
		httpGet.operation(args);
		
	}
	
	
	// Method representing the POST operation
	public static void PostRequest(String[] args) {
		
		HTTPPost httpPost = new HTTPPost();
		
		httpPost.setUrl(args[args.length - 1]);
		
		httpPost.operation(args);
		
	}	

}
