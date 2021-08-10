package Test6m24days;


public enum RunMenu {
	블록버스터("BB"),블록타이거("BT"),블랙앵거스("BA"),뉴욕오리진("NO");
	
	private String abbreviation;

	public static String[] names() {
		RunMenu[] menues = values();
		String[] names = new String[menues.length];

		for (int i = 0; i < menues.length; i++) {
			names[i] = menues[i].name();
		}
		return names;
	}
	private RunMenu(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}
