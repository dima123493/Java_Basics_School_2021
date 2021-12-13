package com.dataart.school.lessons.Lecture9.Lambda;

public class ReturnValue {
    interface Driver{
        long licenceID(long localID);
    }

    public static void main(String[] args) {
        Driver driver = new Driver() {
            @Override
            public long licenceID(long localID) {
                return Long.parseLong(1234560002+""+localID);//Country ID + localID
            }
        };
        System.out.println("Driver ID for current driver is: "+ driver.licenceID(987));

        //TODO Make lambda for the above
        Driver driver1 = localID -> Long.parseLong(1234560002+""+localID);//Country ID + localID
        System.out.println("Driver ID for current driver is: "+ driver1.licenceID(987));

    }
}
