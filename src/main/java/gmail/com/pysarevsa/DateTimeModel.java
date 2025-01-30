package gmail.com.pysarevsa;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DateTimeModel {


    @JsonInclude(JsonInclude.Include.NON_NULL)


    public static class Example {

        @JsonProperty("status")
        private String status;
        @JsonProperty("message")
        private String message;
        @JsonProperty("countryCode")
        private String countryCode;
        @JsonProperty("countryName")
        private String countryName;
        @JsonProperty("regionName")
        private String regionName;
        @JsonProperty("cityName")
        private String cityName;
        @JsonProperty("zoneName")
        private String zoneName;
        @JsonProperty("abbreviation")
        private String abbreviation;
        @JsonProperty("gmtOffset")
        private Integer gmtOffset;
        @JsonProperty("dst")
        private String dst;
        @JsonProperty("zoneStart")
        private Integer zoneStart;
        @JsonProperty("zoneEnd")
        private Integer zoneEnd;
        @JsonProperty("nextAbbreviation")
        private String nextAbbreviation;
        @JsonProperty("timestamp")
        private Integer timestamp;
        @JsonProperty("formatted")
        private String formatted;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty("message")
        public String getMessage() {
            return message;
        }

        @JsonProperty("message")
        public void setMessage(String message) {
            this.message = message;
        }

        @JsonProperty("countryCode")
        public String getCountryCode() {
            return countryCode;
        }

        @JsonProperty("countryCode")
        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        @JsonProperty("countryName")
        public String getCountryName() {
            return countryName;
        }

        @JsonProperty("countryName")
        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        @JsonProperty("regionName")
        public String getRegionName() {
            return regionName;
        }

        @JsonProperty("regionName")
        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        @JsonProperty("cityName")
        public String getCityName() {
            return cityName;
        }

        @JsonProperty("cityName")
        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        @JsonProperty("zoneName")
        public String getZoneName() {
            return zoneName;
        }

        @JsonProperty("zoneName")
        public void setZoneName(String zoneName) {
            this.zoneName = zoneName;
        }

        @JsonProperty("abbreviation")
        public String getAbbreviation() {
            return abbreviation;
        }

        @JsonProperty("abbreviation")
        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        @JsonProperty("gmtOffset")
        public Integer getGmtOffset() {
            return gmtOffset;
        }

        @JsonProperty("gmtOffset")
        public void setGmtOffset(Integer gmtOffset) {
            this.gmtOffset = gmtOffset;
        }

        @JsonProperty("dst")
        public String getDst() {
            return dst;
        }

        @JsonProperty("dst")
        public void setDst(String dst) {
            this.dst = dst;
        }

        @JsonProperty("zoneStart")
        public Integer getZoneStart() {
            return zoneStart;
        }

        @JsonProperty("zoneStart")
        public void setZoneStart(Integer zoneStart) {
            this.zoneStart = zoneStart;
        }

        @JsonProperty("zoneEnd")
        public Integer getZoneEnd() {
            return zoneEnd;
        }

        @JsonProperty("zoneEnd")
        public void setZoneEnd(Integer zoneEnd) {
            this.zoneEnd = zoneEnd;
        }

        @JsonProperty("nextAbbreviation")
        public String getNextAbbreviation() {
            return nextAbbreviation;
        }

        @JsonProperty("nextAbbreviation")
        public void setNextAbbreviation(String nextAbbreviation) {
            this.nextAbbreviation = nextAbbreviation;
        }

        @JsonProperty("timestamp")
        public Integer getTimestamp() {
            return timestamp;
        }

        @JsonProperty("timestamp")
        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        @JsonProperty("formatted")
        public String getFormatted() {
            return formatted;
        }

        @JsonProperty("formatted")
        public void setFormatted(String formatted) {
            this.formatted = formatted;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}
