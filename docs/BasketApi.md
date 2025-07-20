# BasketApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**basketInfo**](BasketApi.md#basketInfo) | **GET** /basket.info.json | basket.info
[**basketItemAdd**](BasketApi.md#basketItemAdd) | **POST** /basket.item.add.json | basket.item.add
[**basketLiveShippingServiceCreate**](BasketApi.md#basketLiveShippingServiceCreate) | **POST** /basket.live_shipping_service.create.json | basket.live_shipping_service.create
[**basketLiveShippingServiceDelete**](BasketApi.md#basketLiveShippingServiceDelete) | **DELETE** /basket.live_shipping_service.delete.json | basket.live_shipping_service.delete
[**basketLiveShippingServiceList**](BasketApi.md#basketLiveShippingServiceList) | **GET** /basket.live_shipping_service.list.json | basket.live_shipping_service.list



## basketInfo

> BasketInfo200Response basketInfo(id, storeId, responseFields, params, exclude)

basket.info

Retrieve basket information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BasketApi;

BasketApi apiInstance = new BasketApi();
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    BasketInfo200Response result = apiInstance.basketInfo(id, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BasketApi#basketInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**BasketInfo200Response**](BasketInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## basketItemAdd

> BasketItemAdd200Response basketItemAdd(customerId, productId, variantId, quantity, storeId)

basket.item.add

Add item to basket

### Example

```java
// Import classes:
//import org.openapitools.client.api.BasketApi;

BasketApi apiInstance = new BasketApi();
String customerId = 5; // String | Retrieves orders specified by customer id
String productId = 10; // String | Defines id of the product which should be added to the basket
String variantId = 45; // String | Defines product's variants specified by variant id
BigDecimal quantity = 6; // BigDecimal | Defines new items quantity
String storeId = 1; // String | Store Id
try {
    BasketItemAdd200Response result = apiInstance.basketItemAdd(customerId, productId, variantId, quantity, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BasketApi#basketItemAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [default to null]
 **productId** | **String**| Defines id of the product which should be added to the basket | [default to null]
 **variantId** | **String**| Defines product&#39;s variants specified by variant id | [optional] [default to null]
 **quantity** | **BigDecimal**| Defines new items quantity | [optional] [default to 0]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**BasketItemAdd200Response**](BasketItemAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## basketLiveShippingServiceCreate

> BasketLiveShippingServiceCreate200Response basketLiveShippingServiceCreate(name, callback, storeId)

basket.live_shipping_service.create

Create live shipping rate service.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BasketApi;

BasketApi apiInstance = new BasketApi();
String name = BestDelivery; // String | Shipping Service Name
String callback = https://example.com/callback; // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
String storeId = 1; // String | Store Id
try {
    BasketLiveShippingServiceCreate200Response result = apiInstance.basketLiveShippingServiceCreate(name, callback, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BasketApi#basketLiveShippingServiceCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Shipping Service Name | [default to null]
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**BasketLiveShippingServiceCreate200Response**](BasketLiveShippingServiceCreate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## basketLiveShippingServiceDelete

> BasketLiveShippingServiceDelete200Response basketLiveShippingServiceDelete(id)

basket.live_shipping_service.delete

Delete live shipping rate service.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BasketApi;

BasketApi apiInstance = new BasketApi();
Integer id = 5; // Integer | Entity id
try {
    BasketLiveShippingServiceDelete200Response result = apiInstance.basketLiveShippingServiceDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BasketApi#basketLiveShippingServiceDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Entity id | [default to null]

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## basketLiveShippingServiceList

> BasketLiveShippingServiceList200Response basketLiveShippingServiceList(start, count, storeId)

basket.live_shipping_service.list

Retrieve a list of live shipping rate services.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BasketApi;

BasketApi apiInstance = new BasketApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String storeId = 1; // String | Store Id
try {
    BasketLiveShippingServiceList200Response result = apiInstance.basketLiveShippingServiceList(start, count, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BasketApi#basketLiveShippingServiceList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**BasketLiveShippingServiceList200Response**](BasketLiveShippingServiceList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

