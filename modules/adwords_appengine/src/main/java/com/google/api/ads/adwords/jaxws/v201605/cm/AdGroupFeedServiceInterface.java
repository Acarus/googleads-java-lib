// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201605.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage adgroup feed links, and matching functions.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupFeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupFeedServiceInterface {


    /**
     * 
     *         Returns a list of AdGroupFeeds that meet the selector criteria.
     *         
     *         @param selector Determines which AdGroupFeeds to return. If empty all
     *         adgroup feeds are returned.
     *         @return The list of AdgroupFeeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfacegetResponse")
    public AdGroupFeedPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates or removes AdGroupFeeds.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfacemutateResponse")
    public AdGroupFeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        List<AdGroupFeedOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of AdGroupFeeds that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @returns A list of AdGroupFeed.
     *         @throws ApiException if problems occur while parsing the query or fetching AdGroupFeed.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605", className = "com.google.api.ads.adwords.jaxws.v201605.cm.AdGroupFeedServiceInterfacequeryResponse")
    public AdGroupFeedPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201605")
        String query)
        throws ApiException_Exception
    ;

}
