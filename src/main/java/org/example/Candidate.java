package org.example;

public class Candidate {
    Data data;

    public Candidate(Data data){
        this.data = data;
    }

    public Candidate(){

    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "data=" + data +
                '}';
    }
}
