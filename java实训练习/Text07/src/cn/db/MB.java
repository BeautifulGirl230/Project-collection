package cn.db;

public class MB {

	public static void main(String[] args) {
		MDB m = new MDB();
		m.getTvcard().show();
		m.getTvcard().run();
		m.getTvcard().stop();
		
		m.getChartext().show();
		m.getChartext().run();
		m.getChartext().stop();
	}

}
