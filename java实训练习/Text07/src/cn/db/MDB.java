package cn.db;

public class MDB {
	public TVCard tvcard = new TVCard();
	public CharText chartext = new CharText();
	
	public CharText getChartext() {
		return chartext;
	}

	public void setChartext(CharText chartext) {
		this.chartext = chartext;
	}

	public TVCard getTvcard() {
		return tvcard;
	}

	public void setTvcard(TVCard tvcard) {
		this.tvcard = tvcard;
	}
	
}
