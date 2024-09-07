package ENTITY;

import java.util.Date;

public class Envelope extends Guide{
    public Envelope(
            int id,
            Status status,
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
        type = "Envelope";
    }
    @Override
    public double calculateGuideValue() {
        double value = BASE + 10000;
        return value + ( DHL ? value * INCREMENT : 0 );
    }
}
