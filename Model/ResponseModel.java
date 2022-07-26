package com.example.test10.Model;

import java.util.List;

public class ResponseModel {
    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }

    private List<DataModel> data;
}
