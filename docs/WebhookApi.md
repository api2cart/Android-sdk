# WebhookApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookCount**](WebhookApi.md#webhookCount) | **GET** /webhook.count.json | webhook.count
[**webhookCreate**](WebhookApi.md#webhookCreate) | **POST** /webhook.create.json | webhook.create
[**webhookDelete**](WebhookApi.md#webhookDelete) | **DELETE** /webhook.delete.json | webhook.delete
[**webhookEvents**](WebhookApi.md#webhookEvents) | **GET** /webhook.events.json | webhook.events
[**webhookList**](WebhookApi.md#webhookList) | **GET** /webhook.list.json | webhook.list
[**webhookUpdate**](WebhookApi.md#webhookUpdate) | **PUT** /webhook.update.json | webhook.update



## webhookCount

> WebhookCount200Response webhookCount(entity, action, active)

webhook.count

Count registered webhooks on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String entity = product; // String | The entity you want to filter webhooks by (e.g. order or product)
String action = add; // String | The action you want to filter webhooks by (e.g. order or product)
Boolean active = true; // Boolean | The webhook status you want to filter webhooks by
try {
    WebhookCount200Response result = apiInstance.webhookCount(entity, action, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| The entity you want to filter webhooks by (e.g. order or product) | [optional] [default to null]
 **action** | **String**| The action you want to filter webhooks by (e.g. order or product) | [optional] [default to null]
 **active** | **Boolean**| The webhook status you want to filter webhooks by | [optional] [default to null]

### Return type

[**WebhookCount200Response**](WebhookCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookCreate

> BasketLiveShippingServiceCreate200Response webhookCreate(entity, action, callback, label, fields, active, langId, storeId)

webhook.create

Create webhook on the store and subscribe to it.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String entity = product; // String | Specify the entity that you want to enable webhooks for (e.g product, order, customer, category)
String action = add; // String | Specify what action (event) will trigger the webhook (e.g add, delete, or update)
String callback = https://example.com/callback; // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
String label = Super webhook; // String | The name you give to the webhook
String fields = id, name, description; // String | Fields the webhook should send
Boolean active = true; // Boolean | Webhook status
String langId = 3; // String | Language id
String storeId = 1; // String | Defines store id where the webhook should be assigned
try {
    BasketLiveShippingServiceCreate200Response result = apiInstance.webhookCreate(entity, action, callback, label, fields, active, langId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| Specify the entity that you want to enable webhooks for (e.g product, order, customer, category) | [default to null]
 **action** | **String**| Specify what action (event) will trigger the webhook (e.g add, delete, or update) | [default to null]
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional] [default to null]
 **label** | **String**| The name you give to the webhook | [optional] [default to null]
 **fields** | **String**| Fields the webhook should send | [optional] [default to force_all]
 **active** | **Boolean**| Webhook status | [optional] [default to true]
 **langId** | **String**| Language id | [optional] [default to null]
 **storeId** | **String**| Defines store id where the webhook should be assigned | [optional] [default to null]

### Return type

[**BasketLiveShippingServiceCreate200Response**](BasketLiveShippingServiceCreate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookDelete

> AttributeDelete200Response webhookDelete(id)

webhook.delete

Delete registered webhook on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String id = 25; // String | Webhook id
try {
    AttributeDelete200Response result = apiInstance.webhookDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Webhook id | [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookEvents

> WebhookEvents200Response webhookEvents()

webhook.events

List all Webhooks that are available on this store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
try {
    WebhookEvents200Response result = apiInstance.webhookEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookEvents");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**WebhookEvents200Response**](WebhookEvents200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookList

> WebhookList200Response webhookList(start, count, entity, action, active, ids, params)

webhook.list

List registered webhook on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String entity = product; // String | The entity you want to filter webhooks by (e.g. order or product)
String action = add; // String | The action you want to filter webhooks by (e.g. add, update, or delete)
Boolean active = true; // Boolean | The webhook status you want to filter webhooks by
String ids = 3,14,25; // String | List of сomma-separated webhook ids
String params = id,entity,callback,fields; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    WebhookList200Response result = apiInstance.webhookList(start, count, entity, action, active, ids, params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **entity** | **String**| The entity you want to filter webhooks by (e.g. order or product) | [optional] [default to null]
 **action** | **String**| The action you want to filter webhooks by (e.g. add, update, or delete) | [optional] [default to null]
 **active** | **Boolean**| The webhook status you want to filter webhooks by | [optional] [default to null]
 **ids** | **String**| List of сomma-separated webhook ids | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,entity,action,callback]

### Return type

[**WebhookList200Response**](WebhookList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## webhookUpdate

> ProductImageUpdate200Response webhookUpdate(id, callback, label, fields, active, langId)

webhook.update

Update Webhooks parameters.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String id = 25; // String | Webhook id
String callback = https://example.com/callback; // String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
String label = Super webhook; // String | The name you give to the webhook
String fields = id, name, description; // String | Fields the webhook should send
Boolean active = true; // Boolean | Webhook status
String langId = 3; // String | Language id
try {
    ProductImageUpdate200Response result = apiInstance.webhookUpdate(id, callback, label, fields, active, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Webhook id | [default to null]
 **callback** | **String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional] [default to null]
 **label** | **String**| The name you give to the webhook | [optional] [default to null]
 **fields** | **String**| Fields the webhook should send | [optional] [default to null]
 **active** | **Boolean**| Webhook status | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**ProductImageUpdate200Response**](ProductImageUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

