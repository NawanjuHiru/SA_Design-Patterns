package Exercise03;

public class Query {

	private String SELECT;
	private String FROM;
	private String WHERE;
	
	public String getSELECT() {
		return SELECT;
	}
	public void setSELECT(String sELECT) {
		SELECT = sELECT;
	}
	public String getFROM() {
		return FROM;
	}
	public void setFROM(String fROM) {
		FROM = fROM;
	}
	public String getWHERE() {
		return WHERE;
	}
	public void setWHERE(String wHERE) {
		WHERE = wHERE;
	}
	public String toString() {
		String SELECT = this.getSELECT();
		String FROM = this.getFROM();
		String WHERE = this.getWHERE();
		
		String query = "SELECT " + SELECT.trim() + " FROM " + FROM.trim();

		if (WHERE != null && !WHERE.trim().equals("")) {
			query += " WHERE " + WHERE;
		}

		return query;
	}
}
