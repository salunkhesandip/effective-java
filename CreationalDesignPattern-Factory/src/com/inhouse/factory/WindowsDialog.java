package com.inhouse.factory;

// Factory concrete creator

public class WindowsDialog extends Dialog{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}