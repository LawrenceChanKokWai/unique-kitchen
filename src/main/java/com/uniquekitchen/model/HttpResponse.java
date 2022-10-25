package com.uniquekitchen.model;

import org.springframework.http.HttpStatus;

/**
 * This Class Holds the Http Response object.
 */
public class HttpResponse {

    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String reason;
    private String message;

    /**
     * Default Constructor
     */
    public HttpResponse() {}

    /**
     * User-Defined Constructor that constructs the HttpResponse.
     * @param httpStatusCode holds the http status code.
     * @param httpStatus holds the http status from the HttpStatus class.
     * @param reason holds the reason of the http status.
     * @param message holds the default message of from the http status response.
     */
    public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
        this.httpStatusCode = httpStatusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
    }

    /**
     * Getters: That gets the http status code.
     * @return the http status code
     */
    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Setters: That sets the http status code
     * @param httpStatusCode an int type of http status code.
     */
    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * Getters: In getting the http status.
     * @return the http status
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * Setters: That sets the http status
     * @param httpStatus the http status
     */
    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    /**
     * Getters: In getting the reason of the status code.
     * @return the status reason of the status code.
     */
    public String getReason() {
        return reason;
    }

    /**
     * Setters: This is to set the reason from the http status.
     * @param reason the reason of the http status.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getters: This is to get the custom message for the status.
     * @return the message of the status
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setters: This is to set the message for the status.
     * @param message the message of the status.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
