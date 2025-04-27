# TaxApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxClassInfo**](TaxApi.md#taxClassInfo) | **GET** /tax.class.info.json | tax.class.info
[**taxClassList**](TaxApi.md#taxClassList) | **GET** /tax.class.list.json | tax.class.list



## taxClassInfo

> ModelResponseTaxClassInfo taxClassInfo(taxClassId, storeId, langId, responseFields, params, exclude)

tax.class.info

Use this method to get information about a tax class and its rates. It allows you to calculate the tax percentage for a specific customer&#39;s address. This information contains relatively static data that rarely changes, so API2Cart may cache certain data to reduce the load on the store and speed up request execution. We also recommend that you cache the response of this method on your side to save requests. If you need to clear the cache for a specific store, use the cart.validate method.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TaxApi;

TaxApi apiInstance = new TaxApi();
String taxClassId = 9; // String | Retrieves taxes specified by class id
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String responseFields = {result{id,name,tax,tax_rates{id,countries{id,name,states},cities,address,zip_codes{is_range,range,fields}}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = tax_class_id,tax; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = tax_class_id,tax; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseTaxClassInfo result = apiInstance.taxClassInfo(taxClassId, storeId, langId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#taxClassInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxClassId** | **String**| Retrieves taxes specified by class id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to tax_class_id,name,avail]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseTaxClassInfo**](ModelResponseTaxClassInfo.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## taxClassList

> ModelResponseTaxClassList taxClassList(count, pageCursor, storeId, findValue, findWhere, createdTo, createdFrom, modifiedTo, modifiedFrom, responseFields)

tax.class.list

Get list of tax classes from your store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TaxApi;

TaxApi apiInstance = new TaxApi();
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Store Id
String findValue = tax; // String | Entity search that is specified by some value
String findWhere = name; // String | Tax class search that is specified by field
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ModelResponseTaxClassList result = apiInstance.taxClassList(count, pageCursor, storeId, findValue, findWhere, createdTo, createdFrom, modifiedTo, modifiedFrom, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#taxClassList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Tax class search that is specified by field | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to {return_code,return_message,pagination,result}]

### Return type

[**ModelResponseTaxClassList**](ModelResponseTaxClassList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

