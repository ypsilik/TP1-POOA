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
		// TODO Auto-generated method stub
		return this.numOpCode;
	}

	public int[] getParams()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
