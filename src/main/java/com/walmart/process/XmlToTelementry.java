package com.walmart.process;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.walmart.dto.Telementry;

public class XmlToTelementry {
    public Telementry convert() {
        XmlMapper xmlMapper = new XmlMapper();
        Telementry telementry = xmlMapper.readValue(xml, Telementry.class);

        return telementry;
    }
}
