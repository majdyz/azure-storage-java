/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * A user delegation key.
 */
@JacksonXmlRootElement(localName = "UserDelegationKey")
public final class UserDelegationKey {
    /**
     * The Azure Active Directory object ID in GUID format.
     */
    @JsonProperty(value = "SignedOid", required = true)
    private String signedOid;

    /**
     * The Azure Active Directory tenant ID in GUID format.
     */
    @JsonProperty(value = "SignedTid", required = true)
    private String signedTid;

    /**
     * The date-time the key is active.
     */
    @JsonProperty(value = "SignedStart", required = true)
    private OffsetDateTime signedStart;

    /**
     * The date-time the key expires.
     */
    @JsonProperty(value = "SignedExpiry", required = true)
    private OffsetDateTime signedExpiry;

    /**
     * Abbreviation of the Azure Storage service that accepts the key.
     */
    @JsonProperty(value = "SignedService", required = true)
    private String signedService;

    /**
     * The service version that created the key.
     */
    @JsonProperty(value = "SignedVersion", required = true)
    private String signedVersion;

    /**
     * The key as a base64 string.
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /**
     * Get the signedOid value.
     *
     * @return the signedOid value.
     */
    public String signedOid() {
        return this.signedOid;
    }

    /**
     * Set the signedOid value.
     *
     * @param signedOid the signedOid value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedOid(String signedOid) {
        this.signedOid = signedOid;
        return this;
    }

    /**
     * Get the signedTid value.
     *
     * @return the signedTid value.
     */
    public String signedTid() {
        return this.signedTid;
    }

    /**
     * Set the signedTid value.
     *
     * @param signedTid the signedTid value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedTid(String signedTid) {
        this.signedTid = signedTid;
        return this;
    }

    /**
     * Get the signedStart value.
     *
     * @return the signedStart value.
     */
    public OffsetDateTime signedStart() {
        return this.signedStart;
    }

    /**
     * Set the signedStart value.
     *
     * @param signedStart the signedStart value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedStart(OffsetDateTime signedStart) {
        this.signedStart = signedStart;
        return this;
    }

    /**
     * Get the signedExpiry value.
     *
     * @return the signedExpiry value.
     */
    public OffsetDateTime signedExpiry() {
        return this.signedExpiry;
    }

    /**
     * Set the signedExpiry value.
     *
     * @param signedExpiry the signedExpiry value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedExpiry(OffsetDateTime signedExpiry) {
        this.signedExpiry = signedExpiry;
        return this;
    }

    /**
     * Get the signedService value.
     *
     * @return the signedService value.
     */
    public String signedService() {
        return this.signedService;
    }

    /**
     * Set the signedService value.
     *
     * @param signedService the signedService value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedService(String signedService) {
        this.signedService = signedService;
        return this;
    }

    /**
     * Get the signedVersion value.
     *
     * @return the signedVersion value.
     */
    public String signedVersion() {
        return this.signedVersion;
    }

    /**
     * Set the signedVersion value.
     *
     * @param signedVersion the signedVersion value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withSignedVersion(String signedVersion) {
        this.signedVersion = signedVersion;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the UserDelegationKey object itself.
     */
    public UserDelegationKey withValue(String value) {
        this.value = value;
        return this;
    }
}
