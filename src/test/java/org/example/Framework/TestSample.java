package org.example.Framework;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {
    public static void main(String[] args) throws IOException {
        DataDriven dataDriven = new DataDriven();
        //get data from excel..we can use this data in any selenium element
        ArrayList expectedRowData = dataDriven.getData("AddProfile");
        System.out.println(expectedRowData.get(0));
        System.out.println(expectedRowData.get(1));
        System.out.println(expectedRowData.get(2));
        System.out.println(expectedRowData.get(3));

    }
}
