# CategoryApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoryAdd**](CategoryApi.md#categoryAdd) | **POST** /category.add.json | category.add
[**categoryAddBatch**](CategoryApi.md#categoryAddBatch) | **POST** /category.add.batch.json | category.add.batch
[**categoryAssign**](CategoryApi.md#categoryAssign) | **POST** /category.assign.json | category.assign
[**categoryCount**](CategoryApi.md#categoryCount) | **GET** /category.count.json | category.count
[**categoryDelete**](CategoryApi.md#categoryDelete) | **DELETE** /category.delete.json | category.delete
[**categoryFind**](CategoryApi.md#categoryFind) | **GET** /category.find.json | category.find
[**categoryImageAdd**](CategoryApi.md#categoryImageAdd) | **POST** /category.image.add.json | category.image.add
[**categoryImageDelete**](CategoryApi.md#categoryImageDelete) | **DELETE** /category.image.delete.json | category.image.delete
[**categoryInfo**](CategoryApi.md#categoryInfo) | **GET** /category.info.json | category.info
[**categoryList**](CategoryApi.md#categoryList) | **GET** /category.list.json | category.list
[**categoryUnassign**](CategoryApi.md#categoryUnassign) | **POST** /category.unassign.json | category.unassign
[**categoryUpdate**](CategoryApi.md#categoryUpdate) | **PUT** /category.update.json | category.update



## categoryAdd

> CategoryAdd200Response categoryAdd(name, description, shortDescription, parentId, avail, createdTime, modifiedTime, sortOrder, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)

category.add

Add new category in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String name = Shoes; // String | Defines category's name that has to be added
String description = Test category; // String | Defines category's description
String shortDescription = Short description. This is very short description; // String | Defines short description
String parentId = 6; // String | Adds categories specified by parent id
Boolean avail = false; // Boolean | Defines category's visibility status
String createdTime = 2014-01-30 15:58:41; // String | Entity's date creation
String modifiedTime = 2014-07-30 15:58:41; // String | Entity's date modification
Integer sortOrder = 2; // Integer | Sort number in the list
String metaTitle = category,test; // String | Defines unique meta title for each entity
String metaDescription = category,test; // String | Defines unique meta description of a entity
String metaKeywords = category,test; // String | Defines unique meta keywords for each entity
String seoUrl = category,test; // String | Defines unique category's URL for SEO
String storeId = 1; // String | Store Id
String storesIds = 1,2; // String | Create category in the stores that is specified by comma-separated stores' id
String langId = 3; // String | Language id
try {
    CategoryAdd200Response result = apiInstance.categoryAdd(name, description, shortDescription, parentId, avail, createdTime, modifiedTime, sortOrder, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Defines category&#39;s name that has to be added | [default to null]
 **description** | **String**| Defines category&#39;s description | [optional] [default to null]
 **shortDescription** | **String**| Defines short description | [optional] [default to null]
 **parentId** | **String**| Adds categories specified by parent id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **createdTime** | **String**| Entity&#39;s date creation | [optional] [default to null]
 **modifiedTime** | **String**| Entity&#39;s date modification | [optional] [default to null]
 **sortOrder** | **Integer**| Sort number in the list | [optional] [default to 0]
 **metaTitle** | **String**| Defines unique meta title for each entity | [optional] [default to null]
 **metaDescription** | **String**| Defines unique meta description of a entity | [optional] [default to null]
 **metaKeywords** | **String**| Defines unique meta keywords for each entity | [optional] [default to null]
 **seoUrl** | **String**| Defines unique category&#39;s URL for SEO | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **storesIds** | **String**| Create category in the stores that is specified by comma-separated stores&#39; id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**CategoryAdd200Response**](CategoryAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryAddBatch

> CategoryAddBatch200Response categoryAddBatch(categoryAddBatch)

category.add.batch

Add new categories to the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
CategoryAddBatch categoryAddBatch = new CategoryAddBatch(); // CategoryAddBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.categoryAddBatch(categoryAddBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryAddBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryAddBatch** | [**CategoryAddBatch**](CategoryAddBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## categoryAssign

> CategoryAssign200Response categoryAssign(categoryId, productId, storeId)

category.assign

Assign category to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String categoryId = 6; // String | Defines category assign, specified by category id
String productId = 10; // String | Defines category assign to the product, specified by product id
String storeId = 1; // String | Store Id
try {
    CategoryAssign200Response result = apiInstance.categoryAssign(categoryId, productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryAssign");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category assign, specified by category id | [default to null]
 **productId** | **String**| Defines category assign to the product, specified by product id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CategoryAssign200Response**](CategoryAssign200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryCount

> CategoryCount200Response categoryCount(parentId, storeId, langId, avail, createdFrom, createdTo, modifiedFrom, modifiedTo, productType, findValue, findWhere, reportRequestId, disableReportCache)

category.count

Count categories in store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String parentId = 6; // String | Counts categories specified by parent id
String storeId = 1; // String | Counts category specified by store id
String langId = 3; // String | Counts category specified by language id
Boolean avail = false; // Boolean | Defines category's visibility status
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String productType = BICYCLE; // String | A categorization for the product
String findValue = Demo category 1; // String | Entity search that is specified by some value
String findWhere = email; // String | Counts categories that are searched specified by field
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
try {
    CategoryCount200Response result = apiInstance.categoryCount(parentId, storeId, langId, avail, createdFrom, createdTo, modifiedFrom, modifiedTo, productType, findValue, findWhere, reportRequestId, disableReportCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| Counts categories specified by parent id | [optional] [default to null]
 **storeId** | **String**| Counts category specified by store id | [optional] [default to null]
 **langId** | **String**| Counts category specified by language id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **productType** | **String**| A categorization for the product | [optional] [default to null]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Counts categories that are searched specified by field | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]

### Return type

[**CategoryCount200Response**](CategoryCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryDelete

> CategoryDelete200Response categoryDelete(id, storeId)

category.delete

Delete category in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String id = 10; // String | Defines category removal, specified by category id
String storeId = 1; // String | Store Id
try {
    CategoryDelete200Response result = apiInstance.categoryDelete(id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines category removal, specified by category id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CategoryDelete200Response**](CategoryDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryFind

> CategoryFind200Response categoryFind(findValue, findWhere, findParams, storeId, langId)

category.find

Search category in store. \&quot;Laptop\&quot; is specified here by default.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String findValue = Demo category 1; // String | Entity search that is specified by some value
String findWhere = name; // String | Entity search that is specified by the comma-separated unique fields
String findParams = regex; // String | Entity search that is specified by comma-separated parameters
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
try {
    CategoryFind200Response result = apiInstance.categoryFind(findValue, findWhere, findParams, storeId, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryFind");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findValue** | **String**| Entity search that is specified by some value | [default to null]
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to name]
 **findParams** | **String**| Entity search that is specified by comma-separated parameters | [optional] [default to whole_words]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**CategoryFind200Response**](CategoryFind200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryImageAdd

> CategoryImageAdd200Response categoryImageAdd(categoryId, imageName, url, type, storeId, label, mime, position)

category.image.add

Add image to category

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String categoryId = 6; // String | Defines category id where the image should be added
String imageName = bag-gray.png; // String | Defines image's name
String url = http://docs.api2cart.com/img/logo.png; // String | Defines URL of the image that has to be added
String type = base; // String | Defines image's types that are specified by comma-separated list
String storeId = 1; // String | Store Id
String label = This cool image; // String | Defines alternative text that has to be attached to the picture
String mime = image/jpeg; // String | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.
Integer position = 5; // Integer | Defines image’s position in the list
try {
    CategoryImageAdd200Response result = apiInstance.categoryImageAdd(categoryId, imageName, url, type, storeId, label, mime, position);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryImageAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category id where the image should be added | [default to null]
 **imageName** | **String**| Defines image&#39;s name | [default to null]
 **url** | **String**| Defines URL of the image that has to be added | [default to null]
 **type** | **String**| Defines image&#39;s types that are specified by comma-separated list | [default to null] [enum: base, thumbnail]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **label** | **String**| Defines alternative text that has to be attached to the picture | [optional] [default to null]
 **mime** | **String**| Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. | [optional] [default to null]
 **position** | **Integer**| Defines image’s position in the list | [optional] [default to 0]

### Return type

[**CategoryImageAdd200Response**](CategoryImageAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryImageDelete

> AttributeDelete200Response categoryImageDelete(categoryId, imageId, storeId)

category.image.delete

Delete image

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String categoryId = 6; // String | Defines category id where the image should be deleted
String imageId = 82950b84f468edff480680f99cedbe0d; // String | Define image id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.categoryImageDelete(categoryId, imageId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryImageDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category id where the image should be deleted | [default to null]
 **imageId** | **String**| Define image id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryInfo

> CategoryInfo200Response categoryInfo(id, storeId, langId, schemaType, responseFields, params, exclude, reportRequestId, disableReportCache)

category.info

Get category info about category ID*** or specify other category ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String id = 10; // String | Retrieves category's info specified by category id
String storeId = 1; // String | Retrieves category info  specified by store id
String langId = 3; // String | Retrieves category info  specified by language id
String schemaType = LISTING; // String | The name of the requirements set for the provided schema.
String responseFields = {result{id,name,parent_id,modified_at{value},images}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,parent_id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,parent_id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
try {
    CategoryInfo200Response result = apiInstance.categoryInfo(id, storeId, langId, schemaType, responseFields, params, exclude, reportRequestId, disableReportCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves category&#39;s info specified by category id | [default to null]
 **storeId** | **String**| Retrieves category info  specified by store id | [optional] [default to null]
 **langId** | **String**| Retrieves category info  specified by language id | [optional] [default to null]
 **schemaType** | **String**| The name of the requirements set for the provided schema. | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,parent_id,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]

### Return type

[**CategoryInfo200Response**](CategoryInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryList

> ModelResponseCategoryList categoryList(start, count, pageCursor, storeId, langId, parentId, avail, productType, createdFrom, createdTo, modifiedFrom, modifiedTo, findValue, findWhere, responseFields, params, exclude, reportRequestId, disableReportCache, disableCache)

category.list

Get list of categories from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Retrieves categories specified by store id
String langId = 3; // String | Retrieves categorys specified by language id
String parentId = 6; // String | Retrieves categories specified by parent id
Boolean avail = false; // Boolean | Defines category's visibility status
String productType = BICYCLE; // String | A categorization for the product
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String findValue = Demo category 1; // String | Entity search that is specified by some value
String findWhere = name; // String | Category search that is specified by field
String responseFields = {result{categories_count,category{id,parent_id,modified_at{value},images}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,parent_id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,parent_id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
Boolean disableCache = false; // Boolean | Disable cache for current request
try {
    ModelResponseCategoryList result = apiInstance.categoryList(start, count, pageCursor, storeId, langId, parentId, avail, productType, createdFrom, createdTo, modifiedFrom, modifiedTo, findValue, findWhere, responseFields, params, exclude, reportRequestId, disableReportCache, disableCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Retrieves categories specified by store id | [optional] [default to null]
 **langId** | **String**| Retrieves categorys specified by language id | [optional] [default to null]
 **parentId** | **String**| Retrieves categories specified by parent id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **productType** | **String**| A categorization for the product | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Category search that is specified by field | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,parent_id,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]
 **disableCache** | **Boolean**| Disable cache for current request | [optional] [default to false]

### Return type

[**ModelResponseCategoryList**](ModelResponseCategoryList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryUnassign

> CategoryAssign200Response categoryUnassign(categoryId, productId, storeId)

category.unassign

Unassign category to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String categoryId = 6; // String | Defines category unassign, specified by category id
String productId = 10; // String | Defines category unassign to the product, specified by product id
String storeId = 1; // String | Store Id
try {
    CategoryAssign200Response result = apiInstance.categoryUnassign(categoryId, productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryUnassign");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| Defines category unassign, specified by category id | [default to null]
 **productId** | **String**| Defines category unassign to the product, specified by product id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CategoryAssign200Response**](CategoryAssign200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## categoryUpdate

> AccountConfigUpdate200Response categoryUpdate(id, name, description, shortDescription, parentId, avail, sortOrder, modifiedTime, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)

category.update

Update category in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoryApi;

CategoryApi apiInstance = new CategoryApi();
String id = 10; // String | Defines category update specified by category id
String name = NEW Shoes; // String | Defines new category’s name
String description = New test category; // String | Defines new category's description
String shortDescription = Short description. This is very short description; // String | Defines short description
String parentId = 6; // String | Defines new parent category id
Boolean avail = false; // Boolean | Defines category's visibility status
Integer sortOrder = 2; // Integer | Sort number in the list
String modifiedTime = 2014-07-30 15:58:41; // String | Entity's date modification
String metaTitle = category,test; // String | Defines unique meta title for each entity
String metaDescription = category,test; // String | Defines unique meta description of a entity
String metaKeywords = category,test; // String | Defines unique meta keywords for each entity
String seoUrl = category,test; // String | Defines unique category's URL for SEO
String storeId = 1; // String | Store Id
String storesIds = 1,2; // String | Update category in the stores that is specified by comma-separated stores' id
String langId = 3; // String | Language id
try {
    AccountConfigUpdate200Response result = apiInstance.categoryUpdate(id, name, description, shortDescription, parentId, avail, sortOrder, modifiedTime, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoryApi#categoryUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines category update specified by category id | [default to null]
 **name** | **String**| Defines new category’s name | [optional] [default to null]
 **description** | **String**| Defines new category&#39;s description | [optional] [default to null]
 **shortDescription** | **String**| Defines short description | [optional] [default to null]
 **parentId** | **String**| Defines new parent category id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to null]
 **sortOrder** | **Integer**| Sort number in the list | [optional] [default to null]
 **modifiedTime** | **String**| Entity&#39;s date modification | [optional] [default to null]
 **metaTitle** | **String**| Defines unique meta title for each entity | [optional] [default to null]
 **metaDescription** | **String**| Defines unique meta description of a entity | [optional] [default to null]
 **metaKeywords** | **String**| Defines unique meta keywords for each entity | [optional] [default to null]
 **seoUrl** | **String**| Defines unique category&#39;s URL for SEO | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **storesIds** | **String**| Update category in the stores that is specified by comma-separated stores&#39; id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

