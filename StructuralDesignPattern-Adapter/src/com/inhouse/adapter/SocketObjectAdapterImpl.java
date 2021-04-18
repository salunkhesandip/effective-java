package com.inhouse.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket sock = new Socket();
	
	@Override
	public Volt get120Volts() {
		return sock.getVolt();
	}

	@Override
	public Volt get40Volts() {
		Volt v = sock.getVolt();
		return convertVolt(v,3);
	}

	@Override
	public Volt get3Volts() {
		Volt v = sock.getVolt();
		return convertVolt(v,40);
	}
	
	public static Volt convertVolt(Volt v , int i) {
		return new Volt(v.getVolts()/i);
	}

}
