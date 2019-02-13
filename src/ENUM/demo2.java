package ENUM;
//枚举可以实现接口，但是每一个枚举对象都必须实现所有方法
//枚举可以定义抽象方法，但是每个枚举对象都必须实现每个抽象方法
public enum demo2 implements show{
	EAST{

		@Override
		public String show() {
			// TODO 自动生成的方法存根
			return "这是东部";
		}
	},
	NORTH{

		@Override
		public String show() {
			// TODO 自动生成的方法存根
			return "这是北部";
		}
	},
	WEST{

		@Override
		public String show() {
			// TODO 自动生成的方法存根
			return "这是西部";
		}
	},
	SOUTH{

		@Override
		public String show() {
			// TODO 自动生成的方法存根
			return "这是南部";
		}
	};
	
}
