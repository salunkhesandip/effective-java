package com.inhouse.factory;


// Factory concrete creator

public class HtmlDialog extends Dialog{
	public Button createButton() {
		return new HtmlButton();
	}

}