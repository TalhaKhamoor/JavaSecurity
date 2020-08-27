public final class BaseComputer implements java.io.Serializable{

	private final String cpu;
	private final int ramSize;
	private final int diskSize;
	
	public static BaseComputer getBaseComputerInstance(String cpu, int ramSize, int diskSize){
		try{
			if (cpu==null){
				throw new IllegalArgumentException("No null data allowed!");
			}else{
				return new BaseComputer(cpu, ramSize, diskSize);
			}
		}
		catch(IllegalArgumentException e){
			System.out.println("no null data allowed!");
		}
		return null;
	}
	
	private BaseComputer(String cpu, int ramSize, int diskSize){
		this.cpu = cpu;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
	}
	
	public String getCPU(){
		 return cpu;
	}
	
	public int getRamSize(){
		return ramSize;
	}

	public int getDiskSize(){
		return diskSize;
	}
	
	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException{
		stream.defaultWriteObject();
	}

}
