package wrapper;

public enum Size {
	SMALL("S"), MEDIUM("M"),
	LARGE("L"), EXTRA_LARGE("XL");

	private String abbreviation;

	public static String[] names() {
		Size[] sizes = values();
		String[] names = new String[sizes.length];

		for (int i = 0; i < sizes.length; i++) {
			names[i] = sizes[i].name();
		}
		return names;
	}

	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
