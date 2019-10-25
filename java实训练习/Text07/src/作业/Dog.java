package 作业;

import cn.db.PCI;

public class Dog extends GetSet implements PCIGetSet {
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void foot() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void sayHello(int mood) {
		System.out.println("提示:	斗牛犬对你摇了摇尾巴\n");

	}

	@Override
	public void setMood(int mood2) {
		System.out.println("提示:	摸了摸斗牛犬它开心的对你旺旺叫，只差凑过来咬你一口！！\n");
		
	}
	
	@Override
	public void foot(int mood3) {
		System.out.println("提示:	你把斗牛犬吓住了发出呜呜的声音，好像在说你咋长得比它还凶呢\n");
		
	}
	
	@Override
	public void sayHello2(int mood) {
		System.out.println("提示:	缅甸猫发出了喵~的叫声！！\n");

	}

	@Override
	public void setMood2(int mood2) {
		System.out.println("提示:	摸了摸缅甸猫它发出了咕噜咕噜声！！\n");
		
	}
	
	@Override
	public void foot2(int mood3) {
		System.out.println("提示:	你把缅甸猫吓住了发出嘶嘶的声音，它似乎随时准备跟你来几爪！！！！\n");
		
	}
	
	@Override
	public void sayHello3(int mood) {
		System.out.println("提示:	青蛙在岸边呱呱的叫.......\n");

	}

	@Override
	public void setMood3(int mood2) {
		System.out.println("提示:	没有反应，它似乎不像理你.......\n");
		
	}
	
	@Override
	public void foot3(int mood3) {
		System.out.println("提示:	扑通！！！！你把青蛙赶跑了。。。。。。\n");
		
	}
	
}
