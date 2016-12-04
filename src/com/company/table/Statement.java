package com.company.table;


public class Statement {
    private String identification;
    private String type;
    private String value;

    public Statement(String identification, String type, String value) {
        this.identification = identification;
        this.type = type;
        this.value = value;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println(type + " " + identification + " = " + value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statement statement = (Statement) o;

        if (!identification.equals(statement.identification)) return false;
        if (!type.equals(statement.type)) return false;
        return value.equals(statement.value);

    }

    @Override
    public int hashCode() {
        int result = identification.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }
}
