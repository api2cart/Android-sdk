# AttributeApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attributeAdd**](AttributeApi.md#attributeAdd) | **POST** /attribute.add.json | attribute.add
[**attributeAssignGroup**](AttributeApi.md#attributeAssignGroup) | **POST** /attribute.assign.group.json | attribute.assign.group
[**attributeAssignSet**](AttributeApi.md#attributeAssignSet) | **POST** /attribute.assign.set.json | attribute.assign.set
[**attributeAttributesetList**](AttributeApi.md#attributeAttributesetList) | **GET** /attribute.attributeset.list.json | attribute.attributeset.list
[**attributeCount**](AttributeApi.md#attributeCount) | **GET** /attribute.count.json | attribute.count
[**attributeDelete**](AttributeApi.md#attributeDelete) | **DELETE** /attribute.delete.json | attribute.delete
[**attributeGroupList**](AttributeApi.md#attributeGroupList) | **GET** /attribute.group.list.json | attribute.group.list
[**attributeInfo**](AttributeApi.md#attributeInfo) | **GET** /attribute.info.json | attribute.info
[**attributeList**](AttributeApi.md#attributeList) | **GET** /attribute.list.json | attribute.list
[**attributeTypeList**](AttributeApi.md#attributeTypeList) | **GET** /attribute.type.list.json | attribute.type.list
[**attributeUnassignGroup**](AttributeApi.md#attributeUnassignGroup) | **POST** /attribute.unassign.group.json | attribute.unassign.group
[**attributeUnassignSet**](AttributeApi.md#attributeUnassignSet) | **POST** /attribute.unassign.set.json | attribute.unassign.set
[**attributeUpdate**](AttributeApi.md#attributeUpdate) | **PUT** /attribute.update.json | attribute.update
[**attributeValueAdd**](AttributeApi.md#attributeValueAdd) | **POST** /attribute.value.add.json | attribute.value.add
[**attributeValueDelete**](AttributeApi.md#attributeValueDelete) | **DELETE** /attribute.value.delete.json | attribute.value.delete
[**attributeValueUpdate**](AttributeApi.md#attributeValueUpdate) | **PUT** /attribute.value.update.json | attribute.value.update



## attributeAdd

> AttributeAdd200Response attributeAdd(type, name, code, storeId, langId, visible, required, position, attributeGroupId, isGlobal, isSearchable, isFilterable, isComparable, isHtmlAllowedOnFront, isFilterableInSearch, isConfigurable, isVisibleInAdvancedSearch, isUsedForPromoRules, usedInProductListing, usedForSortBy, applyTo)

attribute.add

Add new attribute

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String type = text; // String | Defines attribute's type
String name = Specification; // String | Defines attributes's name
String code = code; // String | Entity code
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
Boolean visible = true; // Boolean | Set visibility status
Boolean required = true; // Boolean | Defines if the option is required
Integer position = 5; // Integer | Attribute`s position
String attributeGroupId = 202; // String | Filter by attribute_group_id
String isGlobal = Global; // String | Attribute saving scope
Boolean isSearchable = false; // Boolean | Use attribute in Quick Search
String isFilterable = No; // String | Use In Layered Navigation
Boolean isComparable = true; // Boolean | Comparable on Front-end
Boolean isHtmlAllowedOnFront = true; // Boolean | Allow HTML Tags on Frontend
Boolean isFilterableInSearch = true; // Boolean | Use In Search Results Layered Navigation
Boolean isConfigurable = true; // Boolean | Use To Create Configurable Product
Boolean isVisibleInAdvancedSearch = true; // Boolean | Use in Advanced Search
Boolean isUsedForPromoRules = true; // Boolean | Use for Promo Rule Conditions
Boolean usedInProductListing = true; // Boolean | Used in Product Listing
Boolean usedForSortBy = true; // Boolean | Used for Sorting in Product Listing
String applyTo = Global; // String | Types of products which can have this attribute
try {
    AttributeAdd200Response result = apiInstance.attributeAdd(type, name, code, storeId, langId, visible, required, position, attributeGroupId, isGlobal, isSearchable, isFilterable, isComparable, isHtmlAllowedOnFront, isFilterableInSearch, isConfigurable, isVisibleInAdvancedSearch, isUsedForPromoRules, usedInProductListing, usedForSortBy, applyTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Defines attribute&#39;s type | [default to null] [enum: text, select, textarea, date, price, multiselect, boolean]
 **name** | **String**| Defines attributes&#39;s name | [default to null]
 **code** | **String**| Entity code | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **visible** | **Boolean**| Set visibility status | [optional] [default to false]
 **required** | **Boolean**| Defines if the option is required | [optional] [default to false]
 **position** | **Integer**| Attribute&#x60;s position | [optional] [default to 0]
 **attributeGroupId** | **String**| Filter by attribute_group_id | [optional] [default to null]
 **isGlobal** | **String**| Attribute saving scope | [optional] [default to Store]
 **isSearchable** | **Boolean**| Use attribute in Quick Search | [optional] [default to false]
 **isFilterable** | **String**| Use In Layered Navigation | [optional] [default to No]
 **isComparable** | **Boolean**| Comparable on Front-end | [optional] [default to false]
 **isHtmlAllowedOnFront** | **Boolean**| Allow HTML Tags on Frontend | [optional] [default to false]
 **isFilterableInSearch** | **Boolean**| Use In Search Results Layered Navigation | [optional] [default to false]
 **isConfigurable** | **Boolean**| Use To Create Configurable Product | [optional] [default to false]
 **isVisibleInAdvancedSearch** | **Boolean**| Use in Advanced Search | [optional] [default to false]
 **isUsedForPromoRules** | **Boolean**| Use for Promo Rule Conditions | [optional] [default to false]
 **usedInProductListing** | **Boolean**| Used in Product Listing | [optional] [default to false]
 **usedForSortBy** | **Boolean**| Used for Sorting in Product Listing | [optional] [default to false]
 **applyTo** | **String**| Types of products which can have this attribute | [optional] [default to all_types]

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeAssignGroup

> AttributeAssignGroup200Response attributeAssignGroup(id, groupId, attributeSetId)

attribute.assign.group

Assign attribute to the group

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String groupId = 3; // String | Attribute group_id
String attributeSetId = 4; // String | Attribute set id
try {
    AttributeAssignGroup200Response result = apiInstance.attributeAssignGroup(id, groupId, attributeSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeAssignGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **groupId** | **String**| Attribute group_id | [default to null]
 **attributeSetId** | **String**| Attribute set id | [optional] [default to null]

### Return type

[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeAssignSet

> AttributeAssignGroup200Response attributeAssignSet(id, attributeSetId, groupId)

attribute.assign.set

Assign attribute to the attribute set

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String attributeSetId = 4; // String | Attribute set id
String groupId = 3; // String | Attribute group_id
try {
    AttributeAssignGroup200Response result = apiInstance.attributeAssignSet(id, attributeSetId, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeAssignSet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **attributeSetId** | **String**| Attribute set id | [default to null]
 **groupId** | **String**| Attribute group_id | [optional] [default to null]

### Return type

[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeAttributesetList

> ModelResponseAttributeAttributesetList attributeAttributesetList(start, count, responseFields, params, exclude)

attribute.attributeset.list

Get attribute_set list

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseAttributeAttributesetList result = apiInstance.attributeAttributesetList(start, count, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeAttributesetList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseAttributeAttributesetList**](ModelResponseAttributeAttributesetList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeCount

> AttributeCount200Response attributeCount(type, attributeSetId, storeId, langId, visible, required, system)

attribute.count

Get attributes count

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String type = text; // String | Defines attribute's type
String attributeSetId = 4; // String | Filter items by attribute set id
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
Boolean visible = true; // Boolean | Filter items by visibility status
Boolean required = true; // Boolean | Defines if the option is required
Boolean system = false; // Boolean | True if attribute is system
try {
    AttributeCount200Response result = apiInstance.attributeCount(type, attributeSetId, storeId, langId, visible, required, system);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Defines attribute&#39;s type | [optional] [default to null]
 **attributeSetId** | **String**| Filter items by attribute set id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **visible** | **Boolean**| Filter items by visibility status | [optional] [default to null]
 **required** | **Boolean**| Defines if the option is required | [optional] [default to null]
 **system** | **Boolean**| True if attribute is system | [optional] [default to null]

### Return type

[**AttributeCount200Response**](AttributeCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeDelete

> AttributeDelete200Response attributeDelete(id, storeId)

attribute.delete

Delete attribute from store

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.attributeDelete(id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeGroupList

> ModelResponseAttributeGroupList attributeGroupList(start, count, attributeSetId, langId, responseFields, params, exclude)

attribute.group.list

Get attribute group list

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String attributeSetId = 4; // String | Attribute set id
String langId = 3; // String | Language id
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseAttributeGroupList result = apiInstance.attributeGroupList(start, count, attributeSetId, langId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeGroupList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **attributeSetId** | **String**| Attribute set id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseAttributeGroupList**](ModelResponseAttributeGroupList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeInfo

> AttributeInfo200Response attributeInfo(id, attributeSetId, storeId, langId, responseFields, params, exclude)

attribute.info

Get information about a specific global attribute by its ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String attributeSetId = 4; // String | Attribute set id
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String responseFields = {result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = force_all; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    AttributeInfo200Response result = apiInstance.attributeInfo(id, attributeSetId, storeId, langId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **attributeSetId** | **String**| Attribute set id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**AttributeInfo200Response**](AttributeInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeList

> ModelResponseAttributeList attributeList(start, count, attributeIds, attributeSetId, storeId, langId, type, visible, required, system, responseFields, params, exclude)

attribute.list

Get a list of global attributes.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String attributeIds = 1,2,3; // String | Filter attributes by ids
String attributeSetId = 4; // String | Filter items by attribute set id
String storeId = 1; // String | Store Id
String langId = 3; // String | Retrieves attributes on specified language id
String type = text; // String | Defines attribute's type
Boolean visible = true; // Boolean | Filter items by visibility status
Boolean required = true; // Boolean | Defines if the option is required
Boolean system = false; // Boolean | True if attribute is system
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseAttributeList result = apiInstance.attributeList(start, count, attributeIds, attributeSetId, storeId, langId, type, visible, required, system, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **attributeIds** | **String**| Filter attributes by ids | [optional] [default to null]
 **attributeSetId** | **String**| Filter items by attribute set id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Retrieves attributes on specified language id | [optional] [default to null]
 **type** | **String**| Defines attribute&#39;s type | [optional] [default to null]
 **visible** | **Boolean**| Filter items by visibility status | [optional] [default to null]
 **required** | **Boolean**| Defines if the option is required | [optional] [default to null]
 **system** | **Boolean**| True if attribute is system | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,code,type]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseAttributeList**](ModelResponseAttributeList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeTypeList

> AttributeTypeList200Response attributeTypeList()

attribute.type.list

Get list of supported attributes types

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
try {
    AttributeTypeList200Response result = apiInstance.attributeTypeList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeTypeList");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**AttributeTypeList200Response**](AttributeTypeList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeUnassignGroup

> AttributeUnassignGroup200Response attributeUnassignGroup(id, groupId)

attribute.unassign.group

Unassign attribute from group

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String groupId = 3; // String | Customer group_id
try {
    AttributeUnassignGroup200Response result = apiInstance.attributeUnassignGroup(id, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeUnassignGroup");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **groupId** | **String**| Customer group_id | [default to null]

### Return type

[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeUnassignSet

> AttributeUnassignGroup200Response attributeUnassignSet(id, attributeSetId)

attribute.unassign.set

Unassign attribute from attribute set

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String attributeSetId = 4; // String | Attribute set id
try {
    AttributeUnassignGroup200Response result = apiInstance.attributeUnassignSet(id, attributeSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeUnassignSet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **attributeSetId** | **String**| Attribute set id | [default to null]

### Return type

[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeUpdate

> AttributeUpdate200Response attributeUpdate(id, name, storeId, langId)

attribute.update

Update attribute data

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String name = Test name; // String | Defines new attributes's name
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
try {
    AttributeUpdate200Response result = apiInstance.attributeUpdate(id, name, storeId, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **name** | **String**| Defines new attributes&#39;s name | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**AttributeUpdate200Response**](AttributeUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeValueAdd

> AttributeAdd200Response attributeValueAdd(attributeId, name, code, description, storeId, langId)

attribute.value.add

Add new value to attribute.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String attributeId = 156; // String | Attribute Id
String name = Test name; // String | Defines attribute value's name
String code = code; // String | Entity code
String description = Test value; // String | Defines attribute value's description
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
try {
    AttributeAdd200Response result = apiInstance.attributeValueAdd(attributeId, name, code, description, storeId, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeValueAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **String**| Attribute Id | [default to null]
 **name** | **String**| Defines attribute value&#39;s name | [default to null]
 **code** | **String**| Entity code | [optional] [default to null]
 **description** | **String**| Defines attribute value&#39;s description | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeValueDelete

> AttributeValueDelete200Response attributeValueDelete(id, attributeId, storeId)

attribute.value.delete

Delete attribute value.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Entity id
String attributeId = 156; // String | Attribute Id
String storeId = 1; // String | Store Id
try {
    AttributeValueDelete200Response result = apiInstance.attributeValueDelete(id, attributeId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeValueDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **attributeId** | **String**| Attribute Id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## attributeValueUpdate

> AttributeUpdate200Response attributeValueUpdate(id, attributeId, name, description, code, storeId, langId)

attribute.value.update

Update attribute value.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AttributeApi;

AttributeApi apiInstance = new AttributeApi();
String id = 10; // String | Defines attribute value's id
String attributeId = 156; // String | Attribute Id
String name = Test name; // String | Defines attribute value's name
String description = Test value; // String | Defines new attribute value's description
String code = code; // String | Entity code
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
try {
    AttributeUpdate200Response result = apiInstance.attributeValueUpdate(id, attributeId, name, description, code, storeId, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributeApi#attributeValueUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines attribute value&#39;s id | [default to null]
 **attributeId** | **String**| Attribute Id | [default to null]
 **name** | **String**| Defines attribute value&#39;s name | [optional] [default to null]
 **description** | **String**| Defines new attribute value&#39;s description | [optional] [default to null]
 **code** | **String**| Entity code | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**AttributeUpdate200Response**](AttributeUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

