package com.company.table;

import java.util.HashMap;
import java.util.Map;

public class IDTable {
    private Map<String, Statement> mainTable;

    public IDTable() {
        mainTable = new HashMap<>();
    }

    public void addVariable(String id, String type, String value) {
        mainTable.put(id, new Statement(id, type, value));
    }

    public String getValue(String id) {
        return mainTable.get(id).getValue();
    }

    public void setValue(String id, String value) {
        Statement temp = mainTable.get(id);
        temp.setValue(value);
        mainTable.replace(id, temp);
    }

    public void deleteVariable(String id) {
        mainTable.remove(id);
    }

    public boolean searchVariable(String id) {
        Statement temp = mainTable.get(id);
        if (temp != null)
            temp.print();
        return temp == null;
    }
}
