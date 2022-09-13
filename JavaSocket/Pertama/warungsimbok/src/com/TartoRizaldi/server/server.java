package com.TartoRizaldi.server;

import java.io.*;
import java.net.*;
public class server {

	public static void main(String[] args) throws IOException {
		ServerSocket warungsimbok = new ServerSocket(969);
		
		Socket pelanggan = warungsimbok.accept();
		
		System.out.println("pelanggan terhubung");
		
		InputStreamReader isr =new InputStreamReader(pelanggan.getInputStream());
		BufferedReader br =new BufferedReader(isr);
		
		String maupesan = br.readLine();
	    System.out.println(""+maupesan);

	}

}
