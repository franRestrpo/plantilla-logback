package com.fryck.log;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

public class CustomLogLayout extends LayoutBase<ILoggingEvent>{
 
    @Override
    public String doLayout(ILoggingEvent event) {
        StringBuffer sbuf = new StringBuffer(128);
        sbuf.append(new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(event.getTimeStamp())));
        sbuf.append(" ");
        sbuf.append(String.format("%-6s", event.getLevel()));
        sbuf.append(" ");
        sbuf.append(event.getFormattedMessage());
        if((event.getLevel() == Level.ERROR || event.getLevel() == Level.WARN) && event.getThrowableProxy() !=null) {
            sbuf.append(" - ");
            sbuf.append(StringUtils.substringBefore(event.getThrowableProxy().getMessage(), IOUtils.LINE_SEPARATOR));
        }
        sbuf.append(CoreConstants.LINE_SEPARATOR);
        return sbuf.toString();
    }
 
}
