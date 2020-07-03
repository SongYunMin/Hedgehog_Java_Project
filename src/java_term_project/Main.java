package java_term_project;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {
	public static ID_PassWord ID_PW = new ID_PassWord();
	public static DataTransfer a = new DataTransfer();
	public Main() {
	} // »ý¼ºÀÚ

	public static void main(String[] args) throws IOException{
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//a.Transfer("data");
	}
}