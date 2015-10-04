package fr.iutvalence.info.m3105.stackmachine;

public interface MemoryInterface
{
	public int getStartAddress();

	public void write(int currentAddress, Object opCode);
}
