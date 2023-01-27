package com.dp.command;

public class SaveTextFileOperation implements TextFileOperation{
    private TextFile textFile;

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.save();
	}

}
