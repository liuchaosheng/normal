package club.zylearn.design.builder;

// 导演者
public class Director {
	public Computer builderComputer(IComputerBuilder builder) {
		Computer computer = new Computer();
		computer.setCpu(builder.createCpu());
		computer.setMain(builder.createMain());
		computer.setMemory(builder.createMemory());
		computer.setPan(builder.createPan());
		return computer;
	}
}	
