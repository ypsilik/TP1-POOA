package fr.iutvalence.info.m3105.stackmachine;

public class Instruction
{

	int numOpCode; 
	Object objetInst;
	
	public Instruction(int in, Object object)
	{
		this.numOpCode = in;
		this.objetInst = object;
	}

	public int getOpCode()
	{
		return this.numOpCode;
	}

	public int[] getParams()
	{
		return null;
	}
}
