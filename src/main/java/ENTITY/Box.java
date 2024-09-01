package ENTITY;

import java.util.Date;

public class Box extends Guide {

    public Box(
            int id,
            String status,
            Date date,
            double weight,
            int amount,
            String name,
            String department,
            String phoneExt,
            String company,
            String contact,
            String[] phones,
            Address address,
            boolean DHL
    ) {
        super(id, status, date, weight, amount, name, department, phoneExt, company, contact, phones, address, DHL);
        type = "Box";
    }
    @Override
    public double calculateGuideValue() {
        double value = BASE * weight + 25000;
        return value + ( DHL ? value * INCREMENT : 0 );
    }
}
