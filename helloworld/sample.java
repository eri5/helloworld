import java.io.*;

class sample{
  public static void main(String args[]) throws IOException {
    System.out.println("Helloworld");
  	
  	InputStreamReader is = new InputStreamReader(System.in);       
    BufferedReader br = new BufferedReader(is); 
  	
  	String str = br.readLine();                                    
    System.out.println(str + "‚ª“ü—Í‚³‚ê‚Ü‚µ‚½.");
  }
}