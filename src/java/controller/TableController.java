package controller;

public class TableController {
    /**
     * TableController class shall be used to control our customer requests for each table
     * Shall cooperate with the StorageController
     */

	private String name;

	public TableController(String name) {
		this.name = name;
	}

	public String getTableController() {
		return this.name;
	}

	public void setTableController(String name) {
		this.name = name;
	}
}
