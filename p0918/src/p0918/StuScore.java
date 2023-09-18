package p0918;

public class StuScore {
	static int count = 1;
	{
		stuNO = count;
		count++;
	}
	
	
	public StuScore(int stuNO, String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.stuNO = stuNO;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	

	private int stuNO;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		StuScore.count = count;
	}
	public int getStuNO() {
		return stuNO;
	}
	public void setStuNO(int stuNO) {
		this.stuNO = stuNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
