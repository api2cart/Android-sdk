# ReturnApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**returnActionList**](ReturnApi.md#returnActionList) | **GET** /return.action.list.json | return.action.list
[**returnCount**](ReturnApi.md#returnCount) | **GET** /return.count.json | return.count
[**returnInfo**](ReturnApi.md#returnInfo) | **GET** /return.info.json | return.info
[**returnList**](ReturnApi.md#returnList) | **GET** /return.list.json | return.list
[**returnReasonList**](ReturnApi.md#returnReasonList) | **GET** /return.reason.list.json | return.reason.list
[**returnStatusList**](ReturnApi.md#returnStatusList) | **GET** /return.status.list.json | return.status.list



## returnActionList

> ReturnActionList200Response returnActionList()

return.action.list

Retrieve list of return actions

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
try {
    ReturnActionList200Response result = apiInstance.returnActionList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnActionList");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ReturnActionList200Response**](ReturnActionList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## returnCount

> ReturnCount200Response returnCount(orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache)

return.count

Count returns in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
String orderIds = 24,25; // String | Counts return requests specified by order ids
String customerId = 5; // String | Counts return requests quantity specified by customer id
String storeId = 1; // String | Store Id
String status = disabled; // String | Defines status
String returnType = FBA; // String | Retrieves returns specified by return type
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
try {
    ReturnCount200Response result = apiInstance.returnCount(orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **String**| Counts return requests specified by order ids | [optional] [default to null]
 **customerId** | **String**| Counts return requests quantity specified by customer id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **status** | **String**| Defines status | [optional] [default to null]
 **returnType** | **String**| Retrieves returns specified by return type | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]

### Return type

[**ReturnCount200Response**](ReturnCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## returnInfo

> ReturnInfo200Response returnInfo(id, orderId, storeId, params, exclude, responseFields)

return.info

Retrieve return information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
String id = 10; // String | Entity id
String orderId = 25; // String | Defines the order id
String storeId = 1; // String | Store Id
String params = id,order_products; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,order_id; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String responseFields = {return_code,return_message,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ReturnInfo200Response result = apiInstance.returnInfo(id, orderId, storeId, params, exclude, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **orderId** | **String**| Defines the order id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,order_products]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]

### Return type

[**ReturnInfo200Response**](ReturnInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## returnList

> ModelResponseReturnList returnList(start, count, pageCursor, params, exclude, responseFields, orderId, orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache)

return.list

Get list of return requests from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String params = id,order_products; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,order_id; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String orderId = 25; // String | Defines the order id
String orderIds = 24,25; // String | Retrieves return requests specified by order ids
String customerId = 5; // String | Retrieves return requests specified by customer id
String storeId = 1; // String | Store Id
String status = disabled; // String | Defines status
String returnType = FBA; // String | Retrieves returns specified by return type
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
try {
    ModelResponseReturnList result = apiInstance.returnList(start, count, pageCursor, params, exclude, responseFields, orderId, orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,order_products]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **orderId** | **String**| Defines the order id | [optional] [default to null]
 **orderIds** | **String**| Retrieves return requests specified by order ids | [optional] [default to null]
 **customerId** | **String**| Retrieves return requests specified by customer id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **status** | **String**| Defines status | [optional] [default to null]
 **returnType** | **String**| Retrieves returns specified by return type | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]

### Return type

[**ModelResponseReturnList**](ModelResponseReturnList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## returnReasonList

> ReturnReasonList200Response returnReasonList(storeId)

return.reason.list

Retrieve list of return reasons

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
String storeId = 1; // String | Store Id
try {
    ReturnReasonList200Response result = apiInstance.returnReasonList(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnReasonList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**ReturnReasonList200Response**](ReturnReasonList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## returnStatusList

> ReturnStatusList200Response returnStatusList()

return.status.list

Retrieve list of statuses

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReturnApi;

ReturnApi apiInstance = new ReturnApi();
try {
    ReturnStatusList200Response result = apiInstance.returnStatusList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnStatusList");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ReturnStatusList200Response**](ReturnStatusList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

