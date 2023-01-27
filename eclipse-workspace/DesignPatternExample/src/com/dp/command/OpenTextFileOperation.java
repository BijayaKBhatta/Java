package com.dp.command;

public class OpenTextFileOperation implements TextFileOperation {
    private TextFile textFile;

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.open();
	}

}
