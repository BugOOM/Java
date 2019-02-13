package Class;

public class Class {
	private int hour;
	private int minute;
	private int second;
	public Class(int h,int m,int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public Class(Class c) {
		this(c.getHour(),c.getMinute(),c.getSecond());
	}
	private int getSecond() {
		// TODO 自动生成的方法存根
		return second;
	}
	private int getMinute() {
		// TODO 自动生成的方法存根
		return minute;
	}
	private int getHour() {
		// TODO 自动生成的方法存根
		return hour;
	}
	private void setSecond(int s) {
		// TODO 自动生成的方法存根
		second=(s>=0&&s<60)?s:0;
	}
	private void setHour(int h) {
		// TODO 自动生成的方法存根
		hour=(h>=0&&h<24)?h:0;
	}
	private void setMinute(int m) {
		// TODO 自动生成的方法存根
		minute=(m>=0&&m<60)?m:0;
	}
	public String getTime() {
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour()==0||getHour()==12)?12:getHour()%12),getMinute(),getSecond(),(getHour()<12?"Am":"PM"));
	}
}
	