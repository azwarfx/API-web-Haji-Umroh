package com.azwarazuhri.alamsor;

import oshi.*;
import oshi.hardware.NetworkIF;;
public class Tes {
	public static void main(String []args) throws InterruptedException {
		//Do the correct calculations
		long timeStamp = System.currentTimeMillis();
		SystemInfo si = new SystemInfo();
		
		
		
		for (NetworkIF net : si.getHardware().getNetworkIFs()) {

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
            Thread.sleep(2000); //Sleep for a bit longer, 2s should cover almost every possible problem
            net.updateNetworkStats(); //Updating network stats
            long download2 = net.getBytesRecv();
            long timestamp2 = net.getTimeStamp();
            System.out.println("prova " + (download2 - download1)/(timestamp2 - timestamp1));
            //Do the correct calculations
           
		}
	}
}
