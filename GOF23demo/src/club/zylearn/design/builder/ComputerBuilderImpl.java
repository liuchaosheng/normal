package club.zylearn.design.builder;

public class ComputerBuilderImpl implements IComputerBuilder {

	@Override
	public String createCpu() {
		return "酷睿i5cpu一块";
	}

	@Override
	public String createMemory() {
		return "容量为16G的RAM";
	}

	@Override
	public String createPan() {
		return "容量为1T的大硬盘";
	}

	@Override
	public String createMain() {
		return "intel生产的普通主板";
	}

}
