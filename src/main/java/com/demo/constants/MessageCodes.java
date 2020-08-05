package com.demo.constants;

public interface MessageCodes {

    public String SUCCESS = "200";
    public String SUCCESS_MSG = "SUCCESS";

    public String INVALID_REQUEST_CODE="FRAM_A0004";
    public String REQUEST_ERROR= "Invalid Request";
    public String ERROR = "ERROR";
    public String NOT_FOUND = "404";
    public String UNPROCESSABLE="422";
    public String UNPROCESSABLE_desc="Unprocessable Entity";

    public String NON_AUTHORATIVE_INFORMATION = "203";
    public String NON_AUTHORATIVE_INFORMATION_MSG = "Non Authorative Response";
    public String NON_AUTHORATIVE_INFORMATION_DESC = "Non Authorative Response Error. Please try again later";

    public String INTERNAL_SERVER_ERROR = "500";
    public String INTERNAL_SERVER_ERROR_MSG = "Internal Server Error";
    public String INTERNAL_SERVER_ERROR_DESC = "Internal Server Error. Please try again later.";

    public String INVALID_RESPONSE = "502";
    public String INVALID_RESPONSE_MSG = "INVALID_RESPONSE";
    public String INVALID_RESPONSE_DESC = "Internal Response. Please try again later";

    public String BAD_REQUEST = "400";
    public String BAD_REQUEST_MSG = "BAD_REQUEST";
    public String BAD_REQUEST_DESC = "Invalid Request. Please provide valid request.";

    public String REQUEST_TIMEOUT = "408";
    public String REQUEST_TIMEOUT_MSG = "REQUEST_TIMEOUT";
    public String REQUEST_TIMEOUT_DESC = "Request Time Out. Please try again later.";

    public String GATEWAY_TIMEOUT = "504";
    public String GATEWAY_TIMEOUT_MSG = "GATEWAY_TIMEOUT";
    public String GATEWAY_TIMEOUT_DESC = "Gateway Time Out. Please try again later.";

    public String UN_AUTHORISATION = "401";
    public String UN_AUTHORISATION_MSG = "UN_AUTHORISATION";
    public String UN_AUTHORISATION_DESC = "Unauthrised data. Please provide valid authorization request.";

    public String UNSUPPORTED_MEDIA_TYPE = "415";
    public String UNSUPPORTED_MEDIA_TYPE_MSG = "INVALID_JSON_FORMAT";
    public String UNSUPPORTED_MEDIA_TYPE_DESC = "Unsupported Media Type. Please provide valid JSON format.";

    public String HEALTH_CHECK_RES_DESC = "Health check successful";

}
