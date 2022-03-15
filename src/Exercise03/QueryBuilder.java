package Exercise03;

public class QueryBuilder {

public Query query;
	
	public QueryBuilder select(String select) {
		this.query.setSELECT(select);
		return this;
	}
	public QueryBuilder from(String from) {
		this.query.setFROM(from);
		return this;
	}

	public QueryBuilder where(String where) {
		this.query.setWHERE(where);
		return this;
	}
	public QueryBuilder() {
		this.query = new Query();

	}
	public Query build() {
		// TODO Auto-generated method stub
		String select = this.query.getSELECT();
		String from = this.query.getFROM();

		if (select == null || select.trim().equals("")) {
			throw new IllegalStateException("Query must have a SELECT");
		}

		if (from == null || from.trim().equals("")) {
			throw new IllegalStateException("Query must have a FROM");
		}
		return this.query;
	}
}
