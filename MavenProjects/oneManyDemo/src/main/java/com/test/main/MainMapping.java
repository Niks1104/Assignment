package com.test.main;

import java.util.Date;

import org.hibernate.Session;

import com.test.Stock.util.HbUtilClass;
import com.test.model.Stock;
import com.test.model.StockDailyRecord;

public class MainMapping {
public static void main(String[] args) {
System.out.println("Hibernate one to many (XML Mapping)");
Session session = HbUtilClass.getSessionFactory().openSession();

session.beginTransaction();

Stock stock = new Stock();
        stock.setStockCode("1901");
        stock.setStockName("STATIONARY");
        session.save(stock);
        
StockDailyRecord stockDailyRecords = new StockDailyRecord();
stockDailyRecords.setPriceOpen(new Float("1.2"));
stockDailyRecords.setPriceClose(new Float("1.1"));
stockDailyRecords.setPriceChange(new Float("10.0"));
stockDailyRecords.setVolume(3000000L);
stockDailyRecords.setDate(new Date());

stockDailyRecords.setStock(stock);        
stock.getStockDailyRecords().add(stockDailyRecords);

session.save(stockDailyRecords);

session.getTransaction().commit();
System.out.println("Done");
}
}

