package com.inhouse.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volts() {
		return getVolt();
	}

	@Override
	public Volt get40Volts() {
		Volt v = getVolt();
		return convertVolt(v,3);
	}

	@Override
	public Volt get3Volts() {
		Volt v = getVolt();
		return convertVolt(v,40);
	}

	public Volt convertVolt(Volt v , int i) {
		return new Volt(v.getVolts()/i);
	}
}
