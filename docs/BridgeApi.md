# BridgeApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bridgeDelete**](BridgeApi.md#bridgeDelete) | **POST** /bridge.delete.json | bridge.delete
[**bridgeDownload**](BridgeApi.md#bridgeDownload) | **GET** /bridge.download.file | bridge.download
[**bridgeUpdate**](BridgeApi.md#bridgeUpdate) | **POST** /bridge.update.json | bridge.update



## bridgeDelete

> AttributeValueDelete200Response bridgeDelete()

bridge.delete

Delete bridge from the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BridgeApi;

BridgeApi apiInstance = new BridgeApi();
try {
    AttributeValueDelete200Response result = apiInstance.bridgeDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#bridgeDelete");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## bridgeDownload

> File bridgeDownload(whitelabel)

bridge.download

Download bridge for store.&lt;/br&gt;Please note that the method would not work if you call it from Swagger UI.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BridgeApi;

BridgeApi apiInstance = new BridgeApi();
Boolean whitelabel = true; // Boolean | Identifies if there is a necessity to download whitelabel bridge.
try {
    File result = apiInstance.bridgeDownload(whitelabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#bridgeDownload");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **whitelabel** | **Boolean**| Identifies if there is a necessity to download whitelabel bridge. | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/zip


## bridgeUpdate

> AttributeUpdate200Response bridgeUpdate()

bridge.update

Update bridge in the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BridgeApi;

BridgeApi apiInstance = new BridgeApi();
try {
    AttributeUpdate200Response result = apiInstance.bridgeUpdate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BridgeApi#bridgeUpdate");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AttributeUpdate200Response**](AttributeUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

