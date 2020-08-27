public final class DesktopComputer implements java.io.Serializable{

	private final String gpu;
	private final BaseComputer bc;

	public static DesktopComputer getDesktopComputerInstance(String gpu, String cpu, int ramSize, int diskSize){
		
		if (!(cpu.equals("i5") || cpu.equals("i7"))){
			System.out.println("***ERROR : Invalid CPU ***");
		}else if (!((ramSize == 8) || (ramSize == 16))){
			System.out.println("***ERROR : Invalid RAM Size ***");
		}else if (!((diskSize == 250) || (diskSize == 500))){
			System.out.println("***ERROR : Invalid Disk Size ***");
		}else if (!( gpu.equals("intel") || gpu.equals("amd") || gpu.equals("nvidia"))){
			System.out.println("***ERROR : Invalid Screen Size ***");
		}else{
			return new DesktopComputer(gpu, cpu, ramSize, diskSize);
		}
		return null;
	}

	private DesktopComputer(String gpu, String cpu, int ramSize, int diskSize){
		this.gpu = gpu;
		bc = BaseComputer.getBaseComputerInstance(cpu, ramSize, diskSize);
	}
	
	public String getGPU(){
		return gpu;
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
	
}
