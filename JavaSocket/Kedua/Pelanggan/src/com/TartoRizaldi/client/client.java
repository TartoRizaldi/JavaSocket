package com.TartoRizaldi.client;
import java.io.*;
import java.net.*;

public class client {

	public static void main(String[] args)throws IOException{
		Socket pelanggan = new Socket ("localhost",969);
		
		PrintWriter pesan = new PrintWriter(pelanggan.getOutputStream());
		pesan.println("Ilham Membeli Indomie");
		pesan.flush();

		
		 
				

	}

}
