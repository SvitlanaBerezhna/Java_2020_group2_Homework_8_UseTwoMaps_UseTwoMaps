package ua.testing;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * <h1>Use Two Maps</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-03-09
 */
public class CarrierProdCodeUtilsTest {

    @Test
    public void checkingDTOProdCodeCarrierByGivenCarrierAndServiceCodeParameters() {
        CarrierProdCodeUtils carrierProdCodeUtils = new CarrierProdCodeUtils();
        DTOProdCodeCarrier dTOProdCodeCarrier = carrierProdCodeUtils.of("DPD", "10240");
        assertEquals(true, dTOProdCodeCarrier.equals(new DTOProdCodeCarrier().builder().serviceType("NORMAL")
                .carrier("DPD").nationalType("National").countryShortName("").build()));
    }
}
