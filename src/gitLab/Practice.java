package gitLab;

public class Practice {
	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("defintely not")) {
			return str;
		}
		return "defintely not " + str;
	}
}
