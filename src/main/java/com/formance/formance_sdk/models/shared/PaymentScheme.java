/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public enum PaymentScheme {
    UNKNOWN("unknown"),
    OTHER("other"),
    VISA("visa"),
    MASTERCARD("mastercard"),
    AMEX("amex"),
    DINERS("diners"),
    DISCOVER("discover"),
    JCB("jcb"),
    UNIONPAY("unionpay"),
    ALIPAY("alipay"),
    CUP("cup"),
    SEPA_DEBIT("sepa debit"),
    SEPA_CREDIT("sepa credit"),
    SEPA("sepa"),
    APPLE_PAY("apple pay"),
    GOOGLE_PAY("google pay"),
    DOKU("doku"),
    DRAGONPAY("dragonpay"),
    MAESTRO("maestro"),
    MOLPAY("molpay"),
    A2A("a2a"),
    ACH_DEBIT("ach debit"),
    ACH("ach"),
    RTP("rtp");

    @JsonValue
    private final String value;

    private PaymentScheme(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
