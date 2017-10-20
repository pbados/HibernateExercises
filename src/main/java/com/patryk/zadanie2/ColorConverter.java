package com.patryk.zadanie2;

import com.patryk.zadanie2.Model.Color;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ColorConverter implements AttributeConverter<Color, String> {

    @Override
    public String convertToDatabaseColumn(Color attribute) {
        switch (attribute) {
            case CZERWONY:
                return "R";
            case ZIELONY:
                return "G";
            case NIEBIESKI:
                return "B";
            default:
                throw new IllegalArgumentException("Unknown" + attribute);
        }
    }

    @Override
    public Color convertToEntityAttribute(String dbData) {
        switch (dbData) {
            case "R":
                return Color.CZERWONY;
            case "G":
                return Color.ZIELONY;
            case "B":
                return Color.NIEBIESKI;
            default:
                throw new IllegalArgumentException("Unknown" + dbData);
        }
    }
}

