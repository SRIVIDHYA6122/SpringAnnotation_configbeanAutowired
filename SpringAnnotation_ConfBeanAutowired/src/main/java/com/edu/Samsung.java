package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	MobileProcessor mcpu;

	public MobileProcessor getMcpu() {
		return mcpu;
	}

	public void setMcpu(MobileProcessor mcpu) {
		this.mcpu = mcpu;
	}
	public void MobileConfig() {
		System.out.println("8GB RAM -  DUALCORE , 128PX - CAMERA");
		mcpu.processor();
	}
}
	
	
		


