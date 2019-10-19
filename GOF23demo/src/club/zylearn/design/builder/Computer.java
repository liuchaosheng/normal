package club.zylearn.design.builder;

public class Computer {
	private String cpu;
	private String memory;
	private String pan;
	private String main;
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", pan=" + pan + ", main=" + main + "]";
	}
}
