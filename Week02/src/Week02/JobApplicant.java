package Week02;

public class JobApplicant {

	private String name;
	private long phoneNo;
	private boolean isWord;
	private boolean isSpreadSheets;
	private boolean isDatababes;
	private boolean isGraphic;
	
	
	
	public JobApplicant(String name, long phoneNo, boolean isWord, boolean isSpreadSheets, boolean isDatababes, boolean isGraphic ) {
		
		this.name = name;
		this.phoneNo=phoneNo;
		this.isDatababes = isDatababes;
		this.isGraphic= isGraphic;
		this.isWord=isWord;
		this.isSpreadSheets=isSpreadSheets;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public boolean isWord() {
		return isWord;
	}

	public boolean isSpreadSheets() {
		return isSpreadSheets;
	}

	public boolean isDatababes() {
		return isDatababes;
	}

	public boolean isGraphic() {
		return isGraphic;
	}

	public void check() {
		
		if((isDatababes==true&&isGraphic&&isWord)||(isDatababes==true&&isGraphic&&isSpreadSheets)||(isWord==true&&isGraphic&&isSpreadSheets)||(isWord==true&&isDatababes&&isSpreadSheets)){
			System.out.println(name + ", You are eligible");
		}
		else {
			System.out.println(name +", You are not eligible");
		}
		
		
	}
}
