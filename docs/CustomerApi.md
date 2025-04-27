# CustomerApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerAdd**](CustomerApi.md#customerAdd) | **POST** /customer.add.json | customer.add
[**customerAddressAdd**](CustomerApi.md#customerAddressAdd) | **POST** /customer.address.add.json | customer.address.add
[**customerAttributeList**](CustomerApi.md#customerAttributeList) | **GET** /customer.attribute.list.json | customer.attribute.list
[**customerCount**](CustomerApi.md#customerCount) | **GET** /customer.count.json | customer.count
[**customerDelete**](CustomerApi.md#customerDelete) | **DELETE** /customer.delete.json | customer.delete
[**customerFind**](CustomerApi.md#customerFind) | **GET** /customer.find.json | customer.find
[**customerGroupAdd**](CustomerApi.md#customerGroupAdd) | **POST** /customer.group.add.json | customer.group.add
[**customerGroupList**](CustomerApi.md#customerGroupList) | **GET** /customer.group.list.json | customer.group.list
[**customerInfo**](CustomerApi.md#customerInfo) | **GET** /customer.info.json | customer.info
[**customerList**](CustomerApi.md#customerList) | **GET** /customer.list.json | customer.list
[**customerUpdate**](CustomerApi.md#customerUpdate) | **PUT** /customer.update.json | customer.update
[**customerWishlistList**](CustomerApi.md#customerWishlistList) | **GET** /customer.wishlist.list.json | customer.wishlist.list



## customerAdd

> CustomerAdd200Response customerAdd(customerAdd)

customer.add

Add customer into store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
CustomerAdd customerAdd = new CustomerAdd(); // CustomerAdd | 
try {
    CustomerAdd200Response result = apiInstance.customerAdd(customerAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAdd** | [**CustomerAdd**](CustomerAdd.md)|  |

### Return type

[**CustomerAdd200Response**](CustomerAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerAddressAdd

> AttributeAdd200Response customerAddressAdd(customerAddressAdd)

customer.address.add

Add customer address.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
CustomerAddressAdd customerAddressAdd = new CustomerAddressAdd(); // CustomerAddressAdd | 
try {
    AttributeAdd200Response result = apiInstance.customerAddressAdd(customerAddressAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerAddressAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAddressAdd** | [**CustomerAddressAdd**](CustomerAddressAdd.md)|  |

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerAttributeList

> ModelResponseCustomerAttributeList customerAttributeList(customerId, count, pageCursor, storeId, langId, responseFields, params, exclude)

customer.attribute.list

Get attributes for specific customer

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String customerId = 5; // String | Retrieves orders specified by customer id
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCustomerAttributeList result = apiInstance.customerAttributeList(customerId, count, pageCursor, storeId, langId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerAttributeList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [default to null]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCustomerAttributeList**](ModelResponseCustomerAttributeList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerCount

> CustomerCount200Response customerCount(ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo)

customer.count

Get number of customers from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String ids = 24,25; // String | Counts customers specified by ids
String sinceId = 56; // String | Retrieve entities starting from the specified id.
String customerListId = exampleListId; // String | The numeric ID of the customer list in Demandware.
String groupId = 3; // String | Customer group_id
String storeId = 1; // String | Counts customer specified by store id
Boolean avail = false; // Boolean | Defines category's visibility status
String findValue = mail@gmail.com; // String | Entity search that is specified by some value
String findWhere = email; // String | Counts customers that are searched specified by field
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
try {
    CustomerCount200Response result = apiInstance.customerCount(ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| Counts customers specified by ids | [optional] [default to null]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional] [default to null]
 **customerListId** | **String**| The numeric ID of the customer list in Demandware. | [optional] [default to null]
 **groupId** | **String**| Customer group_id | [optional] [default to null]
 **storeId** | **String**| Counts customer specified by store id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Counts customers that are searched specified by field | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]

### Return type

[**CustomerCount200Response**](CustomerCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerDelete

> CustomerDelete200Response customerDelete(id)

customer.delete

Delete customer from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = 10; // String | Identifies customer specified by the id
try {
    CustomerDelete200Response result = apiInstance.customerDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies customer specified by the id | [default to null]

### Return type

[**CustomerDelete200Response**](CustomerDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerFind

> CustomerFind200Response customerFind(findValue, findWhere, findParams, storeId)

customer.find

Find customers in store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String findValue = mail@gmail.com; // String | Entity search that is specified by some value
String findWhere = email; // String | Entity search that is specified by the comma-separated unique fields
String findParams = regex; // String | Entity search that is specified by comma-separated parameters
String storeId = 1; // String | Store Id
try {
    CustomerFind200Response result = apiInstance.customerFind(findValue, findWhere, findParams, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerFind");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findValue** | **String**| Entity search that is specified by some value | [default to null]
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to email]
 **findParams** | **String**| Entity search that is specified by comma-separated parameters | [optional] [default to whole_words]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CustomerFind200Response**](CustomerFind200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerGroupAdd

> CustomerGroupAdd200Response customerGroupAdd(name, storeId, storesIds)

customer.group.add

Create customer group.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String name = new_group; // String | Customer group name
String storeId = 1; // String | Store Id
String storesIds = 1,2; // String | Assign customer group to the stores that is specified by comma-separated stores' id
try {
    CustomerGroupAdd200Response result = apiInstance.customerGroupAdd(name, storeId, storesIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGroupAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Customer group name | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **storesIds** | **String**| Assign customer group to the stores that is specified by comma-separated stores&#39; id | [optional] [default to null]

### Return type

[**CustomerGroupAdd200Response**](CustomerGroupAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerGroupList

> ModelResponseCustomerGroupList customerGroupList(start, count, pageCursor, groupIds, storeId, langId, responseFields, params, exclude, disableCache)

customer.group.list

Get list of customers groups.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String groupIds = 1,2,3; // String | Groups that will be assigned to a customer
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
Boolean disableCache = false; // Boolean | Disable cache for current request
try {
    ModelResponseCustomerGroupList result = apiInstance.customerGroupList(start, count, pageCursor, groupIds, storeId, langId, responseFields, params, exclude, disableCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerGroupList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **groupIds** | **String**| Groups that will be assigned to a customer | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,additional_fields]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **disableCache** | **Boolean**| Disable cache for current request | [optional] [default to false]

### Return type

[**ModelResponseCustomerGroupList**](ModelResponseCustomerGroupList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerInfo

> CustomerInfo200Response customerInfo(id, storeId, responseFields, params, exclude)

customer.info

Get customers&#39; details from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String id = 10; // String | Retrieves customer's info specified by customer id
String storeId = 1; // String | Retrieves customer info specified by store id
String responseFields = {result{id,parent_id,sku,upc,images,combination}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,email; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,email; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    CustomerInfo200Response result = apiInstance.customerInfo(id, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves customer&#39;s info specified by customer id | [default to null]
 **storeId** | **String**| Retrieves customer info specified by store id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,email,first_name,last_name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**CustomerInfo200Response**](CustomerInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerList

> ModelResponseCustomerList customerList(start, count, pageCursor, ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, sortBy, sortDirection, responseFields, params, exclude)

customer.list

Get list of customers from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String ids = 24,25; // String | Retrieves customers specified by ids
String sinceId = 56; // String | Retrieve entities starting from the specified id.
String customerListId = exampleListId; // String | The numeric ID of the customer list in Demandware.
String groupId = 3; // String | Customer group_id
String storeId = 1; // String | Retrieves customers specified by store id
Boolean avail = false; // Boolean | Defines category's visibility status
String findValue = mail@gmail.com; // String | Entity search that is specified by some value
String findWhere = email; // String | Customer search that is specified by field
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String sortBy = value_id; // String | Set field to sort by
String sortDirection = asc; // String | Set sorting direction
String responseFields = {result{customer}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,email; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,email; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCustomerList result = apiInstance.customerList(start, count, pageCursor, ids, sinceId, customerListId, groupId, storeId, avail, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, sortBy, sortDirection, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **ids** | **String**| Retrieves customers specified by ids | [optional] [default to null]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional] [default to null]
 **customerListId** | **String**| The numeric ID of the customer list in Demandware. | [optional] [default to null]
 **groupId** | **String**| Customer group_id | [optional] [default to null]
 **storeId** | **String**| Retrieves customers specified by store id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Customer search that is specified by field | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **sortBy** | **String**| Set field to sort by | [optional] [default to created_time]
 **sortDirection** | **String**| Set sorting direction | [optional] [default to asc]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,email,first_name,last_name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCustomerList**](ModelResponseCustomerList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customerUpdate

> AccountConfigUpdate200Response customerUpdate(customerUpdate)

customer.update

Update information of customer in store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
CustomerUpdate customerUpdate = new CustomerUpdate(); // CustomerUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.customerUpdate(customerUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerUpdate** | [**CustomerUpdate**](CustomerUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customerWishlistList

> ModelResponseCustomerWishlistList customerWishlistList(customerId, start, count, pageCursor, id, storeId, responseFields)

customer.wishlist.list

Get a Wish List of customer from the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CustomerApi;

CustomerApi apiInstance = new CustomerApi();
String customerId = 5; // String | Retrieves orders specified by customer id
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ModelResponseCustomerWishlistList result = apiInstance.customerWishlistList(customerId, start, count, pageCursor, id, storeId, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#customerWishlistList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| Retrieves orders specified by customer id | [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **id** | **String**| Entity id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to {return_code,return_message,pagination,result}]

### Return type

[**ModelResponseCustomerWishlistList**](ModelResponseCustomerWishlistList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

