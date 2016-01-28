import javax.swing.JFrame;


public class ServerTest {
	public static void main(String[] args){
		Server jeel = new Server();
		jeel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeel.startRunning();
	}
}
