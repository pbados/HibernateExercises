package com.patryk.zadanie2;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LongAttributeConverter implements AttributeConverter<LocalDate, Long> {

    public static Long parsowanieZLDDoLonga(LocalDate ld){
        String s = "";
        s+=ld;
        s = s.replace("-","");
        System.out.println(s);

        Long data = Long.valueOf(s);
        return data;
    }

    public static LocalDate parsowanieZLongaDoLD(Long data){
        String dataStr = String.valueOf(data);
        int rok = Integer.valueOf(dataStr.substring(1, 4));
        int miesiac = Integer.valueOf(dataStr.substring(5, 6));
        int dzien = Integer.valueOf(dataStr.substring(7, 8));

        LocalDate ld = LocalDate.of(rok, miesiac, dzien);
        return ld;
    }

    @Override
    public Long convertToDatabaseColumn(LocalDate locDate) {
        return (locDate == null ? null : parsowanieZLDDoLonga(locDate));
    }

    @Override
    public LocalDate convertToEntityAttribute(Long sqlDate) {
        return (sqlDate == null ? null : parsowanieZLongaDoLD(sqlDate));
    }
}
