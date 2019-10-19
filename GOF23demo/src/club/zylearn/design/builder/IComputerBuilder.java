package club.zylearn.design.builder;

// 抽象得建造者接口，假如是为了建造计算机
public interface IComputerBuilder {
	public String createCpu();  // 构建cpu
	public String createMemory(); // 构建内存
	public String createPan(); // 构建硬盘
	public String createMain();  // 构建主板
}
