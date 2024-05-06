package org.example;

public class Request {
    String operation;
    Data data;

    public Request(String operation, Data data) {
        this.operation = operation;
        this.data = data;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Request{" +
                "operation='" + operation + '\'' +
                ", data=" + data +
                '}';
    }
}
