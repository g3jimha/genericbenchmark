import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RunExecution {

	public RunExecution() {
		// TODO Auto-generated constructor stub
	}
	
	public String run(String Command){
		StringBuilder sb = new StringBuilder();
		String rv= new String();
		Runtime rt = Runtime.getRuntime();
		try 
        { 
            Process p = rt.exec(Command); 
            p.waitFor(); 
            BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
            String line=reader.readLine(); 
            while(line!=null){ 
                line=reader.readLine(); 
                sb.append(line);
            } 
        }catch(IOException e1) {
        	e1.printStackTrace();
        	return "";
        }catch(InterruptedException e2) {
        	e2.printStackTrace();
        	return "";
        } 

        rv = sb.toString(); 
        
		return rv;
		
	}
}
