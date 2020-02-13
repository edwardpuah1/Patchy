
public class columnVarStore {
	
	private String varName;
	private String colName;
	private String updateName;
	
	public columnVarStore(String colName, String varName, String updateName) {
		this.colName = colName;
		this.varName = varName;
		this.updateName = updateName;
	}
	
	public String getColName() {
		return this.colName;
	}
	
	public String getVarName() {
		return this.varName;
	}
	
	public String getUpdateName() {
		return this.updateName;
	}
	
	public String toString() {
		return this.colName + " " + this.varName + " " + this.updateName;
	}

}
