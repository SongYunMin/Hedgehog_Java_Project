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
	static public ID_PassWord ID_PW = new ID_PassWord();

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
		DataTransfer q = new DataTransfer();
		q.Transfer("data");
	}
}