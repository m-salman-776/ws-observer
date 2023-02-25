package com.wsobserver.service;

import com.wsobserver.models.classes.WeatherData;
import com.wsobserver.repository.dbImpl.DbMock;

public class WsService {
    private DbMock dbMock;
    public WsService(){
        dbMock = new DbMock();
    }
    public DbMock getInstance(){
        return this.dbMock;
    }
}
