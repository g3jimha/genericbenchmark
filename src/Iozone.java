
public class Iozone {

	public Iozone() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean install(){
		
		return true;
	}

	public void run(){
		
	}

	public void checkVersion(){
		RunExecution re = new RunExecution();
		System.out.println(re.run("iozone -v"));
	}
}
