package com.joenpaco.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PropertiesDto {

    @JsonProperty("mag")
    private String mag;
    @JsonProperty("place")
    private String place;
    @JsonProperty("time")
    private String time;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("tz")
    private String tz;
    @JsonProperty("url")
    private String url;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("felt")
    private Object felt;
    @JsonProperty("cdi")
    private Object cdi;
    @JsonProperty("mmi")
    private Object mmi;
    @JsonProperty("alert")
    private Object alert;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tsunami")
    private String tsunami;
    @JsonProperty("sig")
    private String sig;
    @JsonProperty("net")
    private String net;
    @JsonProperty("code")
    private String code;
    @JsonProperty("ids")
    private String ids;
    @JsonProperty("sources")
    private String sources;
    @JsonProperty("types")
    private String types;
    @JsonProperty("nst")
    private String nst;
    @JsonProperty("dmin")
    private String dmin;
    @JsonProperty("rms")
    private String rms;
    @JsonProperty("gap")
    private String gap;
    @JsonProperty("magType")
    private String magType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;


    public PropertiesDto() {
    }

    public PropertiesDto(String mag, String place, String time, String updated, String tz, String url, String detail, Object felt, Object cdi, Object mmi, Object alert, String status, String tsunami, String sig, String net, String code, String ids, String sources, String types, String nst, String dmin, String rms, String gap, String magType, String type, String title) {
        this.mag = mag;
        this.place = place;
        this.time = time;
        this.updated = updated;
        this.tz = tz;
        this.url = url;
        this.detail = detail;
        this.felt = felt;
        this.cdi = cdi;
        this.mmi = mmi;
        this.alert = alert;
        this.status = status;
        this.tsunami = tsunami;
        this.sig = sig;
        this.net = net;
        this.code = code;
        this.ids = ids;
        this.sources = sources;
        this.types = types;
        this.nst = nst;
        this.dmin = dmin;
        this.rms = rms;
        this.gap = gap;
        this.magType = magType;
        this.type = type;
        this.title = title;
    }

    @JsonProperty("mag")
    public String getMag() {
        return mag;
    }

    @JsonProperty("mag")
    public void setMag(String mag) {
        this.mag = mag;
    }

    @JsonProperty("place")
    public String getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(String place) {
        this.place = place;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @JsonProperty("felt")
    public Object getFelt() {
        return felt;
    }

    @JsonProperty("felt")
    public void setFelt(Object felt) {
        this.felt = felt;
    }

    @JsonProperty("cdi")
    public Object getCdi() {
        return cdi;
    }

    @JsonProperty("cdi")
    public void setCdi(Object cdi) {
        this.cdi = cdi;
    }

    @JsonProperty("mmi")
    public Object getMmi() {
        return mmi;
    }

    @JsonProperty("mmi")
    public void setMmi(Object mmi) {
        this.mmi = mmi;
    }

    @JsonProperty("alert")
    public Object getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(Object alert) {
        this.alert = alert;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("tsunami")
    public String getTsunami() {
        return tsunami;
    }

    @JsonProperty("tsunami")
    public void setTsunami(String tsunami) {
        this.tsunami = tsunami;
    }

    @JsonProperty("sig")
    public String getSig() {
        return sig;
    }

    @JsonProperty("sig")
    public void setSig(String sig) {
        this.sig = sig;
    }

    @JsonProperty("net")
    public String getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(String net) {
        this.net = net;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("ids")
    public String getIds() {
        return ids;
    }

    @JsonProperty("ids")
    public void setIds(String ids) {
        this.ids = ids;
    }

    @JsonProperty("sources")
    public String getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(String sources) {
        this.sources = sources;
    }

    @JsonProperty("types")
    public String getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(String types) {
        this.types = types;
    }

    @JsonProperty("nst")
    public String getNst() {
        return nst;
    }

    @JsonProperty("nst")
    public void setNst(String nst) {
        this.nst = nst;
    }

    @JsonProperty("dmin")
    public String getDmin() {
        return dmin;
    }

    @JsonProperty("dmin")
    public void setDmin(String dmin) {
        this.dmin = dmin;
    }

    @JsonProperty("rms")
    public String getRms() {
        return rms;
    }

    @JsonProperty("rms")
    public void setRms(String rms) {
        this.rms = rms;
    }

    @JsonProperty("gap")
    public String getGap() {
        return gap;
    }

    @JsonProperty("gap")
    public void setGap(String gap) {
        this.gap = gap;
    }

    @JsonProperty("magType")
    public String getMagType() {
        return magType;
    }

    @JsonProperty("magType")
    public void setMagType(String magType) {
        this.magType = magType;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

}
