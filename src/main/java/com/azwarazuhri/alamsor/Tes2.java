package com.azwarazuhri.alamsor;

import oshi.SystemInfo;
import oshi.hardware.NetworkIF;

public class Tes2 extends Thread{

	public static void main(String [] args) throws Exception {
		
		long timeStamp = System.currentTimeMillis();
		SystemInfo si = new SystemInfo();
		for (NetworkIF net : si.getHardware().getNetworkIFs()) {
			System.out.println(net.getNetworkInterface());
			System.out.println(net.getBytesRecv() >= 0);
			
            net.setBytesRecv(10L);
            net.setBytesSent(20L);
            net.setPacketsRecv(30L);
            net.setPacketsSent(40L);
            net.setInErrors(60L);
            net.setOutErrors(70L);
            net.setSpeed(50L);
            net.setTimeStamp(timeStamp);
            
            long download1 = net.getBytesRecv();
            long timestamp1 = net.getTimeStamp();
            Thread.sleep(10000); //Sleep for a bit longer, 2s should cover almost every possible problem
            net.updateNetworkStats(); //Updating network starts
            long download2 = net.getBytesRecv();
            long timestamp2 = net.getTimeStamp();
            System.out.println("Download " + (download2 - download1)/(timestamp2 - timestamp1)+" Kbps");
            //Do the correct calculations
           
            
            long upload1 = net.getBytesRecv();
            long timestampUpload1 = net.getTimeStamp();
            Thread.sleep(10000); //Sleep for a bit longer, 2s should cover almost every possible problem
            net.updateNetworkStats(); //Updating network starts
            long upload2 = net.getBytesRecv();
            long timestampUpload2 = net.getTimeStamp();
            System.out.println("Upload " + (upload2 - upload1)/(timestampUpload2 - timestampUpload1)+" Kbps");
		}
		
	}
}
