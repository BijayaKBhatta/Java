package com.dp.command;


//A simple Java program to demonstrate
//implementation of Command Pattern using
//a remote control example.

//An interface for command
interface Command
{
	public void execute();
}

//Light class have the ability to on and off  
class Light
{
	public void on()
	{
		System.out.println("Light is on");
	}
	public void off()
	{
		System.out.println("Light is off");
	}
}


class Freeze
{
	public void on()
	{
		System.out.println("Freeze is on");
	}
	public void off()
	{
		System.out.println("Freeze is off");
	}
}

class LightOnCommand implements Command
{
	Light light;

	// The constructor is passed the light it
	// is going to control.
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	public void execute()
	{
		light.on();
	}
}
class LightOffCommand implements Command
{
	Light light;
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	public void execute()
	{
		light.off();
	}
}


//A Simple remote control with one button
class SimpleRemoteControl
{
	Command slot; // only one button

	public SimpleRemoteControl()
	{
	}

	public void setCommand(Command command)
	{
		// set the command the remote will
		// execute
		slot = command; // LightOnCommand - obj
	}

	public void buttonWasPressed()
	{
		slot.execute();// LightOnCommand - eecute
	}
}

//Driver class
class RemoteControlTest
{
	public static void main(String[] args)
	{
		SimpleRemoteControl remote =
				new SimpleRemoteControl();
		Light light = new Light();
		Freeze freeze = new Freeze();
		// we can change command dynamically
		int keyPressed = 3; // user input
		if(keyPressed==1) {
			remote.setCommand(new LightOnCommand(light));
			remote.buttonWasPressed();
			
		}else if(keyPressed==2) {
		remote.setCommand(new LightOffCommand(light));
		remote.buttonWasPressed();
		}/*else if(keyPressed==3) {
			remote.setCommand(new FreezeOnCommand(freeze));
			remote.buttonWasPressed();
			}*/
		
		
		
		
		//remote.buttonWasPressed();
	}
}

