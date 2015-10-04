package fr.iutvalence.info.m3105.stackmachine;

public class Stack implements StackInterface
{

	public Stack(int i) throws InvalidParametersException
	{
		if(i<=0) throw new InvalidParametersException();
	}

}
