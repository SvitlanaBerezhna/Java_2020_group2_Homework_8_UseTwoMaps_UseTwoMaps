package ua.testing;

import java.util.Objects;

/**
 * <h1>Use Two Maps</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-09
 */
public class DTOProdCodeCarrier {
    private String serviceType;
    private String carrier;
    private String nationalType;
    private String countryShortName;

    public DTOProdCodeCarrier builder() {
        return new DTOProdCodeCarrier();
    }

    public DTOProdCodeCarrier serviceType(String val) {
        serviceType = val;
        return this;
    }

    public DTOProdCodeCarrier carrier(String val) {
        carrier = val;
        return this;
    }

    public DTOProdCodeCarrier nationalType(String val) {
        nationalType = val;
        return this;
    }

    public DTOProdCodeCarrier countryShortName(String val) {
        countryShortName = val;
        return this;
    }

    public DTOProdCodeCarrier build() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTOProdCodeCarrier that = (DTOProdCodeCarrier) o;
        return Objects.equals(serviceType, that.serviceType) &&
                Objects.equals(carrier, that.carrier) &&
                Objects.equals(nationalType, that.nationalType) &&
                Objects.equals(countryShortName, that.countryShortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, carrier, nationalType, countryShortName);
    }

    @Override
    public String toString() {
        return "DTOProdCodeCarrier{" +
                "serviceType='" + serviceType + '\'' +
                ", carrier='" + carrier + '\'' +
                ", nationalType='" + nationalType + '\'' +
                ", countryShortName='" + countryShortName + '\'' +
                '}';
    }
}
