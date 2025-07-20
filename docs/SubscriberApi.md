# SubscriberApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscriberList**](SubscriberApi.md#subscriberList) | **GET** /subscriber.list.json | subscriber.list



## subscriberList

> ModelResponseSubscriberList subscriberList(ids, start, count, pageCursor, subscribed, storeId, email, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

subscriber.list

Get subscribers list

### Example

```java
// Import classes:
//import org.openapitools.client.api.SubscriberApi;

SubscriberApi apiInstance = new SubscriberApi();
String ids = 24,25; // String | Retrieves subscribers specified by ids
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
Boolean subscribed = false; // Boolean | Filter by subscription status
String storeId = 1; // String | Store Id
String email = mail@example.com; // String | Filter subscribers by email
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseSubscriberList result = apiInstance.subscriberList(ids, start, count, pageCursor, subscribed, storeId, email, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberApi#subscriberList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| Retrieves subscribers specified by ids | [optional] [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **subscribed** | **Boolean**| Filter by subscription status | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **email** | **String**| Filter subscribers by email | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseSubscriberList**](ModelResponseSubscriberList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

