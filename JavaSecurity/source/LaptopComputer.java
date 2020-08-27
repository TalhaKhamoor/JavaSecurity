public final class LaptopComputer implements java.io.Serializable{

	private final int screenSize;
	private final BaseComputer bc;

	public static LaptopComputer getLaptopComputerInstance(int screenSize, String cpu, int ramSize, int diskSize){
		if (!(cpu.equals("i5") || cpu.equals("i7"))){
			System.out.println("***ERROR : Invalid CPU ***");
		}else if (!((ramSize == 8) || (ramSize == 16))){
			System.out.println("***ERROR : Invalid RAM Size ***");
		}else if (!((diskSize == 250) || (diskSize == 500))){
			System.out.println("***ERROR : Invalid Disk Size ***");
		}else if (!((screenSize == 13) || (screenSize == 15))){
			System.out.println("***ERROR : Invalid Screen Size ***");
		}else{
			return new LaptopComputer(screenSize, cpu, ramSize, diskSize);
		}
		return null;
	
	}

	private LaptopComputer(int screenSize, String cpu, int ramSize, int diskSize){
		this.screenSize = screenSize;
		bc = BaseComputer.getBaseComputerInstance(cpu, ramSize, diskSize);
	}

	public int getScreenSize(){
		return screenSize;
	}

	public String getCPU(){
		return bc.getCPU();
	}
	
	public int getRamSize(){
		return bc.getRamSize();
	}

	public int getDiskSize(){
		return bc.getDiskSize();
	}
	
	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException{
		stream.defaultWriteObject();
	}
	
}
