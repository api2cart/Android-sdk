# BatchApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchJobList**](BatchApi.md#batchJobList) | **GET** /batch.job.list.json | batch.job.list
[**batchJobResult**](BatchApi.md#batchJobResult) | **GET** /batch.job.result.json | batch.job.result



## batchJobList

> ModelResponseBatchJobList batchJobList(count, pageCursor, ids, createdFrom, createdTo, processedFrom, processedTo, responseFields)

batch.job.list

Get list of recent jobs

### Example

```java
// Import classes:
//import org.openapitools.client.api.BatchApi;

BatchApi apiInstance = new BatchApi();
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String ids = 24,25; // String | Filter batch jobs by ids
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String processedFrom = 2100-08-29 13:45:52; // String | Retrieve entities according to their processing datetime
String processedTo = 2100-08-29 13:45:52; // String | Retrieve entities according to their processing datetime
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ModelResponseBatchJobList result = apiInstance.batchJobList(count, pageCursor, ids, createdFrom, createdTo, processedFrom, processedTo, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#batchJobList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **ids** | **String**| Filter batch jobs by ids | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **processedFrom** | **String**| Retrieve entities according to their processing datetime | [optional] [default to null]
 **processedTo** | **String**| Retrieve entities according to their processing datetime | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to {return_code,return_message,pagination,result}]

### Return type

[**ModelResponseBatchJobList**](ModelResponseBatchJobList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batchJobResult

> ResponseBatchJobResult batchJobResult(id)

batch.job.result

Get job result data

### Example

```java
// Import classes:
//import org.openapitools.client.api.BatchApi;

BatchApi apiInstance = new BatchApi();
String id = 10; // String | Entity id
try {
    ResponseBatchJobResult result = apiInstance.batchJobResult(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#batchJobResult");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]

### Return type

[**ResponseBatchJobResult**](ResponseBatchJobResult.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

