package com.demo;

public class Windowsfactory implements GUIFactory{
	public Button createButton()
	{
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckBox();
	}

}
