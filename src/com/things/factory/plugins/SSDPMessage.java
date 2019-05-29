package com.things.factory.plugins;

public class SSDPMessage {
    public static final String NEWLINE = "\r\n";
    public static final String ADDRESS = "239.255.255.250";
    public static final int PORT = 1900;
    public static final String SL_OK = "HTTP/1.1 200 OK";
    public static final String SL_M_SEARCH = "M-SEARCH * HTTP/1.1";
    public static final String HOST = new StringBuffer("HOST: ").append(ADDRESS).append(":").append(PORT).toString();
    public static final String MAN = "MAN: \"ssdp:discover\"";
    public static final String ST_Product = "ST: urn:schemas-upnp-org:device:Server:1";
    public static final String ST_DEVICE = "ST: urn:schemas-upnp-org:device:";
    public static final String ST_ROOT = "ST: upnp:rootdevice";
    public static final String ST_ALL = "ST: ssdp:all";
    public static final String ST_TF = "ST: urn:things-factory:device";
    public static final String ST_DIAL = "ST: urn:dial-multiscreen-org:service:dial:1";
}