/*
 * copyright ....
 */

package club.zylearn.utils;

/**
 * 链表的实现类
 * @author 朝阳
 * @since [2019-09-25]
 * @version [1.0]
 */
public class LinkedList {
	/*
	 * 定义包含数据的节点类，因为该类只是提供给自己用
	 * 所以可以定义为内部类，而且内部类可以方便的访问外部类私有属性
	 */
	private class Node{
		/*
		 * 使用Object类来保存所有的类型的对象
		 */
		private Object data;
		
		/*
		 * 下一个节点的引用
		 */
		private Node next;
		
		/**
		 * 带一个参数的构造器
		 * @param data 表示要被节点封装的数据
		 */
		public Node(Object data) {
			this.data = data;
		}
		
		/**
		 * 默认的构造器
		 */
		public Node() {
		}
		
		/**
		 * 试图在当前节点后面增加节点
		 * @param newNode 新的节点信息带有数据
		 */
		public void addNode(Node newNode) {
			if(this.next == null) {
				// 如果当前节点为尾部节点则直接添加
				this.next = newNode;
			}else {
				// 如果当前节点不是尾部几点则传递给下一个节点
				this.next.addNode(newNode);
			}
		}
		
		/**
		 * 试图在比对当前节点的索引跟传入索引是否一致
		 * @param index
		 * @return
		 */
		public Object getNode(int index) {
			if(index == LinkedList.this.foot++) {
				// 索引一致则返回当前对象
				return this.data;
			}else {
				// 否则递归往下找
				return this.next.getNode(index);
			}
		}
		
		/**
		 * 试图对象当前节点包装的对象和传入对象是否相等
		 * 如果不想等，则往后递归。
		 * @param obj 传入的待对比的对象
		 * @return 是否包含
		 */
		public boolean containsNode(Object obj) {
			if(obj.equals(this.data)) {
				// 如果当前节点包装的数据跟传入数据相等则返回true
				return true;
			}else {
				// 如果后续还有节点则递归下一个节点
				if(this.next != null) {
					return this.next.containsNode(obj);
				}else {
					// 如果后续没有节点了，则直接返回false
					return false;
				}
			}
		}
		
		/**
		 * 试图对比传入对象跟当前节点，如果相等则删除当前节点
		 * 否则递归调用下一个节点。
		 * @param previous
		 * @param obj
		 */
		public void removeNode(Node previous,Object obj) {
			if(obj.equals(this.data)) {
				// 当前节点要被移除
				previous.next = this.next;
			}else {
				// 否则递归到下一个节点
				this.next.removeNode(this, obj);
			}
		}
		
		/**
		 * 试图判断当前节点索引并在当前节点上设置值
		 * @param index 需要设置的索引位置
		 * @param obj 新的值
		 */
		public void setNode(int index,Object obj) {
			if(LinkedList.this.foot++ == index) {
				// 如果当前节点正好为传入索引，则进行值得设置
				this.data = obj;
			}else {
				// 否则往下递归
				this.next.setNode(index, obj);
			}
		}
		
	}
	
	/*
	 * 外部类只需要持有根节点的引用就可以遍历所保存的所有数据
	 */
	private Node root;
	
	/*
	 * 定义链表中保存的数据个数
	 */
	private int count = 0;
	
	/**
	 * 表示每次遍历的索引变量
	 */
	private int foot = 0 ;
	
	/**
	 * 向链表中添加数据
	 * @param data  待添加的对象
	 */
	public void add(Object data) {
		Node newNode = new Node(data);
		// 如果链表为空
		if(count == 0) {
			// 直接将新节点设置为根节点
			this.root = newNode;
		}else {
			// 交给节点去递归添加
			this.root.addNode(newNode);
		}
		count++;
	}
	
	/**
	 * 用于计算链表中存放对象的个数
	 * @return 链表的长度
	 */
	public int size() {
		return this.count;
	}
	
	/**
	 * 取得index索引处的对象
	 * @param index 索引值
	 * @return 返回索引处的对象
	 */
	public Object get(int index) {
		// 如果索引不存在返回null
		if(index >= this.count) {
			return null;
		}
		// 将索引变量设置为0，表示从跟节点遍历
		this.foot = 0;
		
		// 从跟节点开始递归寻找
		return this.root.getNode(index);
	}
	
	/**
	 * 判断链表中是否包含了传入对象
	 * @param obj 传入对象
	 * @return 包含返回true否则返回false
	 */
	public boolean contains(Object obj) {
		// 如果传入对象为空，则返回false
		if(obj == null) {
			return false;
		}
		
		// 从根节点调用节点的递归查询方法
		return this.root.containsNode(obj);
	}
	
	/**
	 * 判断链表是否为空
	 * @return 空则返回true否则返回false
	 */
	public boolean isEmpty() {
		return this.count == 0;
	}
	
	/**
	 * 从链表中删除某一数据
	 * @param obj 传入的待删除的数据对象
	 */
	public void remove(Object obj) {
		// 判断是否包含该元素
		if(this.contains(obj)) {
			// 判断根节点包装的数据对象跟传入对象是否相等
			if(obj.equals(this.root.data)) {
				// 如果相等则直接替换掉根节点
				this.root = this.root.next;
			}else {
				// 如果不是根节点则递归调用节点的removeNode方法来处理
				this.root.next.removeNode(this.root,obj);
			}
			this.count--;
		}
	}
	
	/**
	 * 将链表中的数据以对象数组形式返回
	 * @return 对象数组
	 */
	public Object[] toArray() {
		if(this.count == 0) {
			return null;
		}
		// 申请空间
		Object[] dataArray = new Object[this.count];
		
		// 遍历链表
		Node currentNode = this.root;
		int tempIndex = 0;
		while(currentNode != null) {
			dataArray[tempIndex++] = currentNode.data;
			currentNode = currentNode.next;
		}
		return dataArray;
	}
	
	/**
	 * 向某个索引位置设置数据
	 * @param index 索引位置
	 * @param obj 需要设置的新的值
	 */
	public void set(int index,Object obj) {
		// 将动态索引变量设置为0
		this.foot = 0;
		
		// 调用节点的设置方法，进行递归
		this.root.setNode(index,obj);
	}
}
