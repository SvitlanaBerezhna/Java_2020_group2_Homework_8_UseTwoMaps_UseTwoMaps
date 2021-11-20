# Task 1 - Use Two Maps

The program code fragment is given: the utility class that uses two Maps:

```
public final class CarrierProdCodeUtils {
    private static final Map<String, Map<String, DTOProdCodeCarrier>> prodCode = new HashMap<>();

    static {
        prodCode.put("DPD", new HashMap() {
            {
                put("536870977", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DPD")
                        .nationalType("National or International").countryShortName("").build());
                put("536871745", new DTOProdCodeCarrier().builder().serviceType("COD").carrier("DPD")
                        .nationalType("National or International").countryShortName("").build());
                put("10240", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DPD")
                        .nationalType("National").countryShortName("").build());
                put("64", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DPD")
                        .nationalType("National or International").countryShortName("").build());
                put("812812812", new DTOProdCodeCarrier().builder().serviceType("COD").carrier("DPD")
                        .nationalType("International").countryShortName("AT").build());
            }
        });
        prodCode.put("DHL", new HashMap() {
            {
                put("00", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DHL")
                        .nationalType("National").countryShortName("").build());
                put("000", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DHL")
                        .nationalType("International").countryShortName("").build());
                put("032", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DHL")
                        .nationalType("International").countryShortName("").build());
                put("10", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("DHL")
                        .nationalType("National").countryShortName("").build());
            }
        });
        prodCode.put("POSTNORD", new HashMap() {
            {
                put("536870977", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("POSTNORD")
                        .nationalType("National or International").countryShortName("").build());
            }
        });
        prodCode.put("BARTOLINI", new HashMap() {
            {
                put("536870977", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("BARTOLINI")
                        .nationalType("National").countryShortName("").build());
                put("64", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("BARTOLINI")
                        .nationalType("National").countryShortName("").build());
            }
        });
        prodCode.put("SWISS", new HashMap() {
            {
                put("536870977", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("SWISS")
                        .nationalType("National or International").countryShortName("").build());
            }
        });
        prodCode.put("GLS", new HashMap() {
            {
                put("0", new DTOProdCodeCarrier().builder().serviceType("NORMAL").carrier("GLS")
                        .nationalType("National or International").countryShortName("").build());
            }
        });
    }

    public static DTOProdCodeCarrier of(String carrier, String serviceCode) {
        Map<String, DTOProdCodeCarrier> prodCodeServiceMap;
        prodCodeServiceMap = prodCode.get(carrier);
        return prodCodeServiceMap.get(serviceCode);
    }
}
```
Add the missing code and test the utility class.
