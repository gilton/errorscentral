package org.labs.babysteps.errorscentral.domain.enums;

public enum Level {
	INFO("Info"), WARN("Warn"), DEBUG("Debug"), FATAL("Fatal"), ERROR("Error");
	
	private String msg;
	
	public String getMsg() { return msg; }
	
	Level(String msg) { this.msg = msg; }
}
