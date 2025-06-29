# ProductApi

All URIs are relative to *https://api.api2cart.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productAdd**](ProductApi.md#productAdd) | **POST** /product.add.json | product.add
[**productAddBatch**](ProductApi.md#productAddBatch) | **POST** /product.add.batch.json | product.add.batch
[**productAttributeList**](ProductApi.md#productAttributeList) | **GET** /product.attribute.list.json | product.attribute.list
[**productAttributeValueSet**](ProductApi.md#productAttributeValueSet) | **POST** /product.attribute.value.set.json | product.attribute.value.set
[**productAttributeValueUnset**](ProductApi.md#productAttributeValueUnset) | **POST** /product.attribute.value.unset.json | product.attribute.value.unset
[**productBrandList**](ProductApi.md#productBrandList) | **GET** /product.brand.list.json | product.brand.list
[**productChildItemFind**](ProductApi.md#productChildItemFind) | **GET** /product.child_item.find.json | product.child_item.find
[**productChildItemInfo**](ProductApi.md#productChildItemInfo) | **GET** /product.child_item.info.json | product.child_item.info
[**productChildItemList**](ProductApi.md#productChildItemList) | **GET** /product.child_item.list.json | product.child_item.list
[**productCount**](ProductApi.md#productCount) | **GET** /product.count.json | product.count
[**productCurrencyAdd**](ProductApi.md#productCurrencyAdd) | **POST** /product.currency.add.json | product.currency.add
[**productCurrencyList**](ProductApi.md#productCurrencyList) | **GET** /product.currency.list.json | product.currency.list
[**productDelete**](ProductApi.md#productDelete) | **DELETE** /product.delete.json | product.delete
[**productDeleteBatch**](ProductApi.md#productDeleteBatch) | **POST** /product.delete.batch.json | product.delete.batch
[**productFields**](ProductApi.md#productFields) | **GET** /product.fields.json | product.fields
[**productFind**](ProductApi.md#productFind) | **GET** /product.find.json | product.find
[**productImageAdd**](ProductApi.md#productImageAdd) | **POST** /product.image.add.json | product.image.add
[**productImageDelete**](ProductApi.md#productImageDelete) | **DELETE** /product.image.delete.json | product.image.delete
[**productImageUpdate**](ProductApi.md#productImageUpdate) | **PUT** /product.image.update.json | product.image.update
[**productInfo**](ProductApi.md#productInfo) | **GET** /product.info.json | product.info
[**productList**](ProductApi.md#productList) | **GET** /product.list.json | product.list
[**productManufacturerAdd**](ProductApi.md#productManufacturerAdd) | **POST** /product.manufacturer.add.json | product.manufacturer.add
[**productOptionAdd**](ProductApi.md#productOptionAdd) | **POST** /product.option.add.json | product.option.add
[**productOptionAssign**](ProductApi.md#productOptionAssign) | **POST** /product.option.assign.json | product.option.assign
[**productOptionDelete**](ProductApi.md#productOptionDelete) | **DELETE** /product.option.delete.json | product.option.delete
[**productOptionList**](ProductApi.md#productOptionList) | **GET** /product.option.list.json | product.option.list
[**productOptionValueAdd**](ProductApi.md#productOptionValueAdd) | **POST** /product.option.value.add.json | product.option.value.add
[**productOptionValueAssign**](ProductApi.md#productOptionValueAssign) | **POST** /product.option.value.assign.json | product.option.value.assign
[**productOptionValueDelete**](ProductApi.md#productOptionValueDelete) | **DELETE** /product.option.value.delete.json | product.option.value.delete
[**productOptionValueUpdate**](ProductApi.md#productOptionValueUpdate) | **PUT** /product.option.value.update.json | product.option.value.update
[**productPriceAdd**](ProductApi.md#productPriceAdd) | **POST** /product.price.add.json | product.price.add
[**productPriceDelete**](ProductApi.md#productPriceDelete) | **DELETE** /product.price.delete.json | product.price.delete
[**productPriceUpdate**](ProductApi.md#productPriceUpdate) | **PUT** /product.price.update.json | product.price.update
[**productReviewList**](ProductApi.md#productReviewList) | **GET** /product.review.list.json | product.review.list
[**productStoreAssign**](ProductApi.md#productStoreAssign) | **POST** /product.store.assign.json | product.store.assign
[**productTaxAdd**](ProductApi.md#productTaxAdd) | **POST** /product.tax.add.json | product.tax.add
[**productUpdate**](ProductApi.md#productUpdate) | **PUT** /product.update.json | product.update
[**productUpdateBatch**](ProductApi.md#productUpdateBatch) | **POST** /product.update.batch.json | product.update.batch
[**productVariantAdd**](ProductApi.md#productVariantAdd) | **POST** /product.variant.add.json | product.variant.add
[**productVariantAddBatch**](ProductApi.md#productVariantAddBatch) | **POST** /product.variant.add.batch.json | product.variant.add.batch
[**productVariantCount**](ProductApi.md#productVariantCount) | **GET** /product.variant.count.json | product.variant.count
[**productVariantDelete**](ProductApi.md#productVariantDelete) | **DELETE** /product.variant.delete.json | product.variant.delete
[**productVariantDeleteBatch**](ProductApi.md#productVariantDeleteBatch) | **POST** /product.variant.delete.batch.json | product.variant.delete.batch
[**productVariantImageAdd**](ProductApi.md#productVariantImageAdd) | **POST** /product.variant.image.add.json | product.variant.image.add
[**productVariantImageDelete**](ProductApi.md#productVariantImageDelete) | **DELETE** /product.variant.image.delete.json | product.variant.image.delete
[**productVariantInfo**](ProductApi.md#productVariantInfo) | **GET** /product.variant.info.json | product.variant.info
[**productVariantList**](ProductApi.md#productVariantList) | **GET** /product.variant.list.json | product.variant.list
[**productVariantPriceAdd**](ProductApi.md#productVariantPriceAdd) | **POST** /product.variant.price.add.json | product.variant.price.add
[**productVariantPriceDelete**](ProductApi.md#productVariantPriceDelete) | **DELETE** /product.variant.price.delete.json | product.variant.price.delete
[**productVariantPriceUpdate**](ProductApi.md#productVariantPriceUpdate) | **PUT** /product.variant.price.update.json | product.variant.price.update
[**productVariantUpdate**](ProductApi.md#productVariantUpdate) | **PUT** /product.variant.update.json | product.variant.update
[**productVariantUpdateBatch**](ProductApi.md#productVariantUpdateBatch) | **POST** /product.variant.update.batch.json | product.variant.update.batch



## productAdd

> ProductAdd200Response productAdd(productAdd)

product.add

Add new product to store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductAdd productAdd = new ProductAdd(); // ProductAdd | 
try {
    ProductAdd200Response result = apiInstance.productAdd(productAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAdd** | [**ProductAdd**](ProductAdd.md)|  |

### Return type

[**ProductAdd200Response**](ProductAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productAddBatch

> CategoryAddBatch200Response productAddBatch(productAddBatch)

product.add.batch

Add new products to the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductAddBatch productAddBatch = new ProductAddBatch(); // ProductAddBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productAddBatch(productAddBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAddBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productAddBatch** | [**ProductAddBatch**](ProductAddBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productAttributeList

> ModelResponseProductAttributeList productAttributeList(productId, start, count, pageCursor, attributeId, variantId, attributeGroupId, langId, storeId, setName, sortBy, sortDirection, responseFields, params, exclude)

product.attribute.list

Get list of attributes and values.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Retrieves attributes specified by product id
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String attributeId = 156; // String | Retrieves info for specified attribute_id
String variantId = 45; // String | Defines product's variants specified by variant id
String attributeGroupId = 202; // String | Filter by attribute_group_id
String langId = 3; // String | Retrieves attributes specified by language id
String storeId = 1; // String | Retrieves attributes specified by store id
String setName = Shoes; // String | Retrieves attributes specified by set_name in Magento
String sortBy = value; // String | Set field to sort by
String sortDirection = asc; // String | Set sorting direction
String responseFields = {pagination,result{attribute}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = attribute_id,name; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = attribute_id,name; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseProductAttributeList result = apiInstance.productAttributeList(productId, start, count, pageCursor, attributeId, variantId, attributeGroupId, langId, storeId, setName, sortBy, sortDirection, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAttributeList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Retrieves attributes specified by product id | [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **attributeId** | **String**| Retrieves info for specified attribute_id | [optional] [default to null]
 **variantId** | **String**| Defines product&#39;s variants specified by variant id | [optional] [default to null]
 **attributeGroupId** | **String**| Filter by attribute_group_id | [optional] [default to null]
 **langId** | **String**| Retrieves attributes specified by language id | [optional] [default to null]
 **storeId** | **String**| Retrieves attributes specified by store id | [optional] [default to null]
 **setName** | **String**| Retrieves attributes specified by set_name in Magento | [optional] [default to null]
 **sortBy** | **String**| Set field to sort by | [optional] [default to attribute_id]
 **sortDirection** | **String**| Set sorting direction | [optional] [default to asc]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to attribute_id,name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseProductAttributeList**](ModelResponseProductAttributeList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productAttributeValueSet

> ProductAttributeValueSet200Response productAttributeValueSet(productId, attributeId, attributeGroupId, attributeName, value, valueId, langId, storeId)

product.attribute.value.set

Set attribute value to product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the attribute should be added
String attributeId = 156; // String | Filter by attribute_id
String attributeGroupId = 202; // String | Filter by attribute_group_id
String attributeName = Color; // String | Define attribute name
String value = Red; // String | Define attribute value
Integer valueId = 22; // Integer | Define attribute value id
String langId = 3; // String | Language id
String storeId = 1; // String | Store Id
try {
    ProductAttributeValueSet200Response result = apiInstance.productAttributeValueSet(productId, attributeId, attributeGroupId, attributeName, value, valueId, langId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAttributeValueSet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the attribute should be added | [default to null]
 **attributeId** | **String**| Filter by attribute_id | [optional] [default to null]
 **attributeGroupId** | **String**| Filter by attribute_group_id | [optional] [default to null]
 **attributeName** | **String**| Define attribute name | [optional] [default to null]
 **value** | **String**| Define attribute value | [optional] [default to null]
 **valueId** | **Integer**| Define attribute value id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**ProductAttributeValueSet200Response**](ProductAttributeValueSet200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productAttributeValueUnset

> ProductAttributeValueUnset200Response productAttributeValueUnset(productId, attributeId, storeId, includeDefault, reindex, clearCache)

product.attribute.value.unset

Removes attribute value for a product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Product id
String attributeId = 156; // String | Attribute Id
String storeId = 1; // String | Store Id
Boolean includeDefault = true; // Boolean | Boolean, whether or not to unset default value of the attribute, if applicable
Boolean reindex = false; // Boolean | Is reindex required
Boolean clearCache = false; // Boolean | Is cache clear required
try {
    ProductAttributeValueUnset200Response result = apiInstance.productAttributeValueUnset(productId, attributeId, storeId, includeDefault, reindex, clearCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAttributeValueUnset");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product id | [default to null]
 **attributeId** | **String**| Attribute Id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **includeDefault** | **Boolean**| Boolean, whether or not to unset default value of the attribute, if applicable | [optional] [default to false]
 **reindex** | **Boolean**| Is reindex required | [optional] [default to true]
 **clearCache** | **Boolean**| Is cache clear required | [optional] [default to true]

### Return type

[**ProductAttributeValueUnset200Response**](ProductAttributeValueUnset200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productBrandList

> ModelResponseProductBrandList productBrandList(start, count, pageCursor, brandIds, categoryId, parentId, storeId, langId, findWhere, findValue, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

product.brand.list

Get list of brands from your store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String brandIds = 4,5; // String | Retrieves brands specified by brand ids
String categoryId = 6; // String | Retrieves product brands specified by category id
String parentId = 6; // String | Retrieves brands specified by parent id
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String findWhere = name; // String | Entity search that is specified by the comma-separated unique fields
String findValue = Phone; // String | Entity search that is specified by some value
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseProductBrandList result = apiInstance.productBrandList(start, count, pageCursor, brandIds, categoryId, parentId, storeId, langId, findWhere, findValue, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productBrandList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **brandIds** | **String**| Retrieves brands specified by brand ids | [optional] [default to null]
 **categoryId** | **String**| Retrieves product brands specified by category id | [optional] [default to null]
 **parentId** | **String**| Retrieves brands specified by parent id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to null]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,short_description,active,url]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseProductBrandList**](ModelResponseProductBrandList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productChildItemFind

> ProductChildItemFind200Response productChildItemFind(findValue, findWhere, findParams, storeId)

product.child_item.find

Search product child item (bundled item or configurable product variant) in store catalog.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String findValue = bundled-item-123-; // String | Entity search that is specified by some value
String findWhere = sku; // String | Entity search that is specified by the comma-separated unique fields
String findParams = regex; // String | Entity search that is specified by comma-separated parameters
String storeId = 1; // String | Store Id
try {
    ProductChildItemFind200Response result = apiInstance.productChildItemFind(findValue, findWhere, findParams, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productChildItemFind");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to null]
 **findParams** | **String**| Entity search that is specified by comma-separated parameters | [optional] [default to whole_words]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**ProductChildItemFind200Response**](ProductChildItemFind200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productChildItemInfo

> ProductChildItemInfo200Response productChildItemInfo(productId, id, storeId, langId, currencyId, responseFields, params, exclude, useLatestApiVersion)

product.child_item.info

Get child for specific product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Filter by parent product id
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String currencyId = usd; // String | Currency Id
String responseFields = {result{id,parent_id,sku,upc,images,combination}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
try {
    ProductChildItemInfo200Response result = apiInstance.productChildItemInfo(productId, id, storeId, langId, currencyId, responseFields, params, exclude, useLatestApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productChildItemInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Filter by parent product id | [default to null]
 **id** | **String**| Entity id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **currencyId** | **String**| Currency Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]

### Return type

[**ProductChildItemInfo200Response**](ProductChildItemInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productChildItemList

> ModelResponseProductChildItemList productChildItemList(start, count, pageCursor, productId, productIds, sku, storeId, langId, currencyId, availSale, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, returnGlobal, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)

product.child_item.list

Get a list of a product&#39;s child items, such as variants or bundle components. The total_count field in the response indicates the total number of items in the context of the current filter.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve products child items via cursor-based pagination (it can't be used with any other filtering parameter)
String productId = 10; // String | Filter by parent product id
String productIds = 4,5; // String | Filter by parent product ids
String sku = bag_01; // String | Filter by products variant's sku
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String currencyId = usd; // String | Currency Id
Boolean availSale = false; // Boolean | Specifies the set of available/not available products for sale
String findValue = bundled-item-123-; // String | Entity search that is specified by some value
String findWhere = sku; // String | Child products search that is specified by field
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
Boolean returnGlobal = false; // Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
String responseFields = {result{children{id,parent_id,sku,upc,images,combination}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
try {
    ModelResponseProductChildItemList result = apiInstance.productChildItemList(start, count, pageCursor, productId, productIds, sku, storeId, langId, currencyId, availSale, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, returnGlobal, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productChildItemList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve products child items via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **productId** | **String**| Filter by parent product id | [optional] [default to null]
 **productIds** | **String**| Filter by parent product ids | [optional] [default to null]
 **sku** | **String**| Filter by products variant&#39;s sku | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **currencyId** | **String**| Currency Id | [optional] [default to null]
 **availSale** | **Boolean**| Specifies the set of available/not available products for sale | [optional] [default to null]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Child products search that is specified by field | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **returnGlobal** | **Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to force_all]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]

### Return type

[**ModelResponseProductChildItemList**](ModelResponseProductChildItemList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productCount

> ProductCount200Response productCount(productIds, sinceId, categoriesIds, categoryId, storeId, langId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, brandName, productAttributes, status, type, visible, findValue, findWhere, reportRequestId, returnGlobal, disableReportCache, useLatestApiVersion)

product.count

Count products in store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productIds = 4,5; // String | Counts products specified by product ids
String sinceId = 56; // String | Retrieve entities starting from the specified id.
String categoriesIds = 23,56; // String | Defines product add that is specified by comma-separated categories id
String categoryId = 6; // String | Counts products specified by category id
String storeId = 1; // String | Counts products specified by store id
String langId = 3; // String | Counts products specified by language id
Boolean availView = true; // Boolean | Specifies the set of visible/invisible products
Boolean availSale = false; // Boolean | Specifies the set of available/not available products for sale
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String brandName = Abidas; // String | Retrieves brands specified by brand name
List<String> productAttributes = product_attributes[0][attribute_id]=132&product_attributes[0][values][0]=custom value 1&product_attributes[0][values][1]=custom value 2; // List<String> | Defines product attributes
String status = disabled; // String | Defines product's status
String type = simple; // String | Defines products's type
String visible = everywhere; // String | Filter items by visibility status
String findValue = Phone; // String | Entity search that is specified by some value
String findWhere = name; // String | Counts products that are searched specified by field
String reportRequestId = 105245017661; // String | Report request id
Boolean returnGlobal = false; // Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
try {
    ProductCount200Response result = apiInstance.productCount(productIds, sinceId, categoriesIds, categoryId, storeId, langId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, brandName, productAttributes, status, type, visible, findValue, findWhere, reportRequestId, returnGlobal, disableReportCache, useLatestApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productIds** | **String**| Counts products specified by product ids | [optional] [default to null]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional] [default to null]
 **categoriesIds** | **String**| Defines product add that is specified by comma-separated categories id | [optional] [default to null]
 **categoryId** | **String**| Counts products specified by category id | [optional] [default to null]
 **storeId** | **String**| Counts products specified by store id | [optional] [default to null]
 **langId** | **String**| Counts products specified by language id | [optional] [default to null]
 **availView** | **Boolean**| Specifies the set of visible/invisible products | [optional] [default to null]
 **availSale** | **Boolean**| Specifies the set of available/not available products for sale | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **brandName** | **String**| Retrieves brands specified by brand name | [optional] [default to null]
 **productAttributes** | [**List&lt;String&gt;**](String.md)| Defines product attributes | [optional] [default to null]
 **status** | **String**| Defines product&#39;s status | [optional] [default to null]
 **type** | **String**| Defines products&#39;s type | [optional] [default to null]
 **visible** | **String**| Filter items by visibility status | [optional] [default to everywhere]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Counts products that are searched specified by field | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **returnGlobal** | **Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]

### Return type

[**ProductCount200Response**](ProductCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productCurrencyAdd

> ProductCurrencyAdd200Response productCurrencyAdd(iso3, rate, name, avail, symbolLeft, symbolRight, _default)

product.currency.add

Add currency and/or set default in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String iso3 = USD; // String | Specifies standardized currency code
BigDecimal rate = 1; // BigDecimal | Defines the numerical identifier against to the major currency
String name = US Dollar; // String | Defines currency's name
Boolean avail = false; // Boolean | Specifies whether the currency is available
String symbolLeft = $; // String | Defines the symbol that is located before the currency
String symbolRight = грн; // String | Defines the symbol that is located after the currency
Boolean _default = true; // Boolean | Specifies currency's default meaning
try {
    ProductCurrencyAdd200Response result = apiInstance.productCurrencyAdd(iso3, rate, name, avail, symbolLeft, symbolRight, _default);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCurrencyAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iso3** | **String**| Specifies standardized currency code | [default to null]
 **rate** | **BigDecimal**| Defines the numerical identifier against to the major currency | [default to null]
 **name** | **String**| Defines currency&#39;s name | [optional] [default to null]
 **avail** | **Boolean**| Specifies whether the currency is available | [optional] [default to true]
 **symbolLeft** | **String**| Defines the symbol that is located before the currency | [optional] [default to null]
 **symbolRight** | **String**| Defines the symbol that is located after the currency | [optional] [default to null]
 **_default** | **Boolean**| Specifies currency&#39;s default meaning | [optional] [default to false]

### Return type

[**ProductCurrencyAdd200Response**](ProductCurrencyAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productCurrencyList

> ModelResponseProductCurrencyList productCurrencyList(start, count, pageCursor, _default, avail, responseFields, params, exclude)

product.currency.list

Get list of currencies

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
Boolean _default = true; // Boolean | Specifies the set of default/not default currencies
Boolean avail = false; // Boolean | Specifies the set of available/not available currencies
String responseFields = {return_message,pagination,result{currency}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = name,iso3,default,avail; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = name,iso3,default,avail; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseProductCurrencyList result = apiInstance.productCurrencyList(start, count, pageCursor, _default, avail, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCurrencyList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **_default** | **Boolean**| Specifies the set of default/not default currencies | [optional] [default to null]
 **avail** | **Boolean**| Specifies the set of available/not available currencies | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to name,iso3,default,avail]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseProductCurrencyList**](ModelResponseProductCurrencyList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productDelete

> CustomerDelete200Response productDelete(id, storeId)

product.delete

Product delete

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String id = 10; // String | Product id that will be removed
String storeId = 1; // String | Store Id
try {
    CustomerDelete200Response result = apiInstance.productDelete(id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Product id that will be removed | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CustomerDelete200Response**](CustomerDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productDeleteBatch

> CategoryAddBatch200Response productDeleteBatch(productDeleteBatch)

product.delete.batch

Remove product from the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductDeleteBatch productDeleteBatch = new ProductDeleteBatch(); // ProductDeleteBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productDeleteBatch(productDeleteBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productDeleteBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productDeleteBatch** | [**ProductDeleteBatch**](ProductDeleteBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productFields

> CartConfigUpdate200Response productFields()

product.fields

Retrieve all available fields for product item in store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
try {
    CartConfigUpdate200Response result = apiInstance.productFields();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productFields");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CartConfigUpdate200Response**](CartConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productFind

> ProductFind200Response productFind(findValue, findWhere, findParams, findWhat, langId, storeId)

product.find

Search product in store catalog. \&quot;Apple\&quot; is specified here by default.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String findValue = Simple; // String | Entity search that is specified by some value
String findWhere = name; // String | Entity search that is specified by the comma-separated unique fields
String findParams = regex; // String | Entity search that is specified by comma-separated parameters
String findWhat = each; // String | Parameter's value specifies the entity that has to be found
String langId = 3; // String | Search products specified by language id
String storeId = 1; // String | Store Id
try {
    ProductFind200Response result = apiInstance.productFind(findValue, findWhere, findParams, findWhat, langId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productFind");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **findValue** | **String**| Entity search that is specified by some value | [default to null]
 **findWhere** | **String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to name]
 **findParams** | **String**| Entity search that is specified by comma-separated parameters | [optional] [default to whole_words]
 **findWhat** | **String**| Parameter&#39;s value specifies the entity that has to be found | [optional] [default to product]
 **langId** | **String**| Search products specified by language id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**ProductFind200Response**](ProductFind200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productImageAdd

> ProductImageAdd200Response productImageAdd(productImageAdd)

product.image.add

Add image to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductImageAdd productImageAdd = new ProductImageAdd(); // ProductImageAdd | 
try {
    ProductImageAdd200Response result = apiInstance.productImageAdd(productImageAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productImageAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productImageAdd** | [**ProductImageAdd**](ProductImageAdd.md)|  |

### Return type

[**ProductImageAdd200Response**](ProductImageAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productImageDelete

> AttributeDelete200Response productImageDelete(productId, id, storeId)

product.image.delete

Delete image

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the image should be deleted
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productImageDelete(productId, id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productImageDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the image should be deleted | [default to null]
 **id** | **String**| Entity id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productImageUpdate

> ProductImageUpdate200Response productImageUpdate(productId, id, variantIds, storeId, langId, imageName, type, label, position, hidden)

product.image.update

Update details of image

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the image should be updated
String id = 10; // String | Defines image update specified by image id
String variantIds = 1,2,3,4,5; // String | Defines product's variants ids
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String imageName = data/product/main/product_69_bag-gray.png; // String | Defines image's name
String type = thumbnail; // String | Defines image's types that are specified by comma-separated list
String label = This cool image; // String | Defines alternative text that has to be attached to the picture
Integer position = 5; // Integer | Defines image’s position in the list
Boolean hidden = true; // Boolean | Define is hide image
try {
    ProductImageUpdate200Response result = apiInstance.productImageUpdate(productId, id, variantIds, storeId, langId, imageName, type, label, position, hidden);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productImageUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the image should be updated | [default to null]
 **id** | **String**| Defines image update specified by image id | [default to null]
 **variantIds** | **String**| Defines product&#39;s variants ids | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **imageName** | **String**| Defines image&#39;s name | [optional] [default to null]
 **type** | **String**| Defines image&#39;s types that are specified by comma-separated list | [optional] [default to additional]
 **label** | **String**| Defines alternative text that has to be attached to the picture | [optional] [default to null]
 **position** | **Integer**| Defines image’s position in the list | [optional] [default to null]
 **hidden** | **Boolean**| Define is hide image | [optional] [default to null]

### Return type

[**ProductImageUpdate200Response**](ProductImageUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productInfo

> ProductInfo200Response productInfo(id, storeId, langId, currencyId, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)

product.info

Get information about a specific product by its ID. In the case of a multistore configuration, use the store_id filter to get a response in the context of a specific store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String id = 10; // String | Retrieves product's info specified by product id
String storeId = 1; // String | Retrieves product info specified by store id
String langId = 3; // String | Retrieves product info specified by language id
String currencyId = usd; // String | Currency Id
String responseFields = {result{id,name,price,images}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String reportRequestId = 105245017661; // String | Report request id
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
try {
    ProductInfo200Response result = apiInstance.productInfo(id, storeId, langId, currencyId, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves product&#39;s info specified by product id | [default to null]
 **storeId** | **String**| Retrieves product info specified by store id | [optional] [default to null]
 **langId** | **String**| Retrieves product info specified by language id | [optional] [default to null]
 **currencyId** | **String**| Currency Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description,price,categories_ids]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]

### Return type

[**ProductInfo200Response**](ProductInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productList

> ModelResponseProductList productList(start, count, pageCursor, productIds, sinceId, categoriesIds, categoryId, storeId, langId, currencyId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, sku, brandName, productAttributes, status, type, visible, findValue, findWhere, returnGlobal, params, responseFields, exclude, sortBy, sortDirection, reportRequestId, disableCache, disableReportCache, useLatestApiVersion)

product.list

Get list of products from your store. Returns 10 products by default.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve products via cursor-based pagination (it can't be used with any other filtering parameter)
String productIds = 4,5; // String | Retrieves products specified by product ids
String sinceId = 56; // String | Retrieve entities starting from the specified id.
String categoriesIds = 23,56; // String | Retrieves products specified by categories ids
String categoryId = 6; // String | Retrieves products specified by category id
String storeId = 1; // String | Retrieves products specified by store id
String langId = 3; // String | Retrieves products specified by language id
String currencyId = usd; // String | Currency Id
Boolean availView = true; // Boolean | Specifies the set of visible/invisible products
Boolean availSale = false; // Boolean | Specifies the set of available/not available products for sale
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String sku = bag_01; // String | Filter by product's sku
String brandName = Abidas; // String | Retrieves brands specified by brand name
List<String> productAttributes = product_attributes[0][attribute_id]=132&product_attributes[0][values][0]=custom value 1&product_attributes[0][values][1]=custom value 2; // List<String> | Defines product attributes
String status = disabled; // String | Defines product's status
String type = simple; // String | Defines products's type
String visible = everywhere; // String | Filter items by visibility status
String findValue = Phone; // String | Entity search that is specified by some value
String findWhere = name; // String | Product search that is specified by field
Boolean returnGlobal = false; // Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String responseFields = {return_code,pagination,result{product{id,name,price,images}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
String sortBy = value_id; // String | Set field to sort by
String sortDirection = asc; // String | Set sorting direction
String reportRequestId = 105245017661; // String | Report request id
Boolean disableCache = false; // Boolean | Disable cache for current request
Boolean disableReportCache = false; // Boolean | Disable report cache for current request
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
try {
    ModelResponseProductList result = apiInstance.productList(start, count, pageCursor, productIds, sinceId, categoriesIds, categoryId, storeId, langId, currencyId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, sku, brandName, productAttributes, status, type, visible, findValue, findWhere, returnGlobal, params, responseFields, exclude, sortBy, sortDirection, reportRequestId, disableCache, disableReportCache, useLatestApiVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve products via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **productIds** | **String**| Retrieves products specified by product ids | [optional] [default to null]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional] [default to null]
 **categoriesIds** | **String**| Retrieves products specified by categories ids | [optional] [default to null]
 **categoryId** | **String**| Retrieves products specified by category id | [optional] [default to null]
 **storeId** | **String**| Retrieves products specified by store id | [optional] [default to null]
 **langId** | **String**| Retrieves products specified by language id | [optional] [default to null]
 **currencyId** | **String**| Currency Id | [optional] [default to null]
 **availView** | **Boolean**| Specifies the set of visible/invisible products | [optional] [default to null]
 **availSale** | **Boolean**| Specifies the set of available/not available products for sale | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **sku** | **String**| Filter by product&#39;s sku | [optional] [default to null]
 **brandName** | **String**| Retrieves brands specified by brand name | [optional] [default to null]
 **productAttributes** | [**List&lt;String&gt;**](String.md)| Defines product attributes | [optional] [default to null]
 **status** | **String**| Defines product&#39;s status | [optional] [default to null]
 **type** | **String**| Defines products&#39;s type | [optional] [default to null]
 **visible** | **String**| Filter items by visibility status | [optional] [default to everywhere]
 **findValue** | **String**| Entity search that is specified by some value | [optional] [default to null]
 **findWhere** | **String**| Product search that is specified by field | [optional] [default to null]
 **returnGlobal** | **Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description,price,categories_ids]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **sortBy** | **String**| Set field to sort by | [optional] [default to id]
 **sortDirection** | **String**| Set sorting direction | [optional] [default to asc]
 **reportRequestId** | **String**| Report request id | [optional] [default to null]
 **disableCache** | **Boolean**| Disable cache for current request | [optional] [default to false]
 **disableReportCache** | **Boolean**| Disable report cache for current request | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]

### Return type

[**ModelResponseProductList**](ModelResponseProductList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productManufacturerAdd

> ProductManufacturerAdd200Response productManufacturerAdd(productId, manufacturer, storeId)

product.manufacturer.add

Add manufacturer to store and assign to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines products specified by product id
String manufacturer = Samsung; // String | Defines product’s manufacturer's name
String storeId = 1; // String | Store Id
try {
    ProductManufacturerAdd200Response result = apiInstance.productManufacturerAdd(productId, manufacturer, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productManufacturerAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines products specified by product id | [default to null]
 **manufacturer** | **String**| Defines product’s manufacturer&#39;s name | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**ProductManufacturerAdd200Response**](ProductManufacturerAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionAdd

> ProductOptionAdd200Response productOptionAdd(productOptionAdd)

product.option.add

Add product option from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductOptionAdd productOptionAdd = new ProductOptionAdd(); // ProductOptionAdd | 
try {
    ProductOptionAdd200Response result = apiInstance.productOptionAdd(productOptionAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productOptionAdd** | [**ProductOptionAdd**](ProductOptionAdd.md)|  |

### Return type

[**ProductOptionAdd200Response**](ProductOptionAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productOptionAssign

> ProductOptionAssign200Response productOptionAssign(productId, optionId, required, sortOrder, optionValues, clearCache)

product.option.assign

Assign option from product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the option should be assigned
String optionId = 5; // String | Defines option id which has to be assigned
Boolean required = true; // Boolean | Defines if the option is required
Integer sortOrder = 2; // Integer | Sort number in the list
String optionValues = green,black,yellow; // String | Defines option values that has to be assigned
Boolean clearCache = false; // Boolean | Is cache clear required
try {
    ProductOptionAssign200Response result = apiInstance.productOptionAssign(productId, optionId, required, sortOrder, optionValues, clearCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionAssign");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the option should be assigned | [default to null]
 **optionId** | **String**| Defines option id which has to be assigned | [default to null]
 **required** | **Boolean**| Defines if the option is required | [optional] [default to false]
 **sortOrder** | **Integer**| Sort number in the list | [optional] [default to 0]
 **optionValues** | **String**| Defines option values that has to be assigned | [optional] [default to null]
 **clearCache** | **Boolean**| Is cache clear required | [optional] [default to true]

### Return type

[**ProductOptionAssign200Response**](ProductOptionAssign200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionDelete

> AttributeDelete200Response productOptionDelete(optionId, productId, storeId)

product.option.delete

Product option delete.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String optionId = 5; // String | Defines option id that should be deleted
String productId = 10; // String | Defines product id where the option should be deleted
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productOptionDelete(optionId, productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optionId** | **String**| Defines option id that should be deleted | [default to null]
 **productId** | **String**| Defines product id where the option should be deleted | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionList

> ModelResponseProductOptionList productOptionList(start, count, productId, langId, storeId, responseFields, params, exclude)

product.option.list

Get list of options.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String productId = 10; // String | Retrieves products' options specified by product id
String langId = 3; // String | Language id
String storeId = 1; // String | Store Id
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,name,sort_order; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = id,name,sort_order; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseProductOptionList result = apiInstance.productOptionList(start, count, productId, langId, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **productId** | **String**| Retrieves products&#39; options specified by product id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseProductOptionList**](ModelResponseProductOptionList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionValueAdd

> ProductOptionValueAdd200Response productOptionValueAdd(productId, optionId, optionValue, sortOrder, displayValue, isDefault, clearCache)

product.option.value.add

Add product option item from option.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the option value should be added
String optionId = 5; // String | Defines option id where the value has to be added
String optionValue = green; // String | Defines option value that has to be added
Integer sortOrder = 2; // Integer | Sort number in the list
String displayValue = value; // String | Defines the value that will be displayed for the option value
Boolean isDefault = true; // Boolean | Defines as a default
Boolean clearCache = false; // Boolean | Is cache clear required
try {
    ProductOptionValueAdd200Response result = apiInstance.productOptionValueAdd(productId, optionId, optionValue, sortOrder, displayValue, isDefault, clearCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionValueAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the option value should be added | [default to null]
 **optionId** | **String**| Defines option id where the value has to be added | [default to null]
 **optionValue** | **String**| Defines option value that has to be added | [optional] [default to null]
 **sortOrder** | **Integer**| Sort number in the list | [optional] [default to 0]
 **displayValue** | **String**| Defines the value that will be displayed for the option value | [optional] [default to null]
 **isDefault** | **Boolean**| Defines as a default | [optional] [default to null]
 **clearCache** | **Boolean**| Is cache clear required | [optional] [default to true]

### Return type

[**ProductOptionValueAdd200Response**](ProductOptionValueAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionValueAssign

> ProductOptionValueAssign200Response productOptionValueAssign(productOptionId, optionValueId, clearCache)

product.option.value.assign

Assign product option item from product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer productOptionId = 5; // Integer | Defines product's option id where the value has to be assigned
String optionValueId = 45; // String | Defines value id that has to be assigned
Boolean clearCache = false; // Boolean | Is cache clear required
try {
    ProductOptionValueAssign200Response result = apiInstance.productOptionValueAssign(productOptionId, optionValueId, clearCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionValueAssign");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productOptionId** | **Integer**| Defines product&#39;s option id where the value has to be assigned | [default to null]
 **optionValueId** | **String**| Defines value id that has to be assigned | [default to null]
 **clearCache** | **Boolean**| Is cache clear required | [optional] [default to true]

### Return type

[**ProductOptionValueAssign200Response**](ProductOptionValueAssign200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionValueDelete

> AttributeDelete200Response productOptionValueDelete(optionId, optionValueId, productId, storeId)

product.option.value.delete

Product option value delete.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String optionId = 5; // String | Defines option id where the value should be deleted
String optionValueId = 45; // String | Defines option value id that should be deleted
String productId = 10; // String | Defines product id where the option value should be deleted
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productOptionValueDelete(optionId, optionValueId, productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionValueDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optionId** | **String**| Defines option id where the value should be deleted | [default to null]
 **optionValueId** | **String**| Defines option value id that should be deleted | [default to null]
 **productId** | **String**| Defines product id where the option value should be deleted | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productOptionValueUpdate

> AccountConfigUpdate200Response productOptionValueUpdate(productId, optionId, optionValueId, optionValue, price, quantity, displayValue, clearCache)

product.option.value.update

Update product option item from option.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the option value should be updated
String optionId = 5; // String | Defines option id where the value has to be updated
String optionValueId = 45; // String | Defines value id that has to be assigned
String optionValue = green; // String | Defines option value that has to be added
BigDecimal price = 99.9; // BigDecimal | Defines new product option price
BigDecimal quantity = 6; // BigDecimal | Defines new products' options quantity
String displayValue = value; // String | Defines the value that will be displayed for the option value
Boolean clearCache = false; // Boolean | Is cache clear required
try {
    AccountConfigUpdate200Response result = apiInstance.productOptionValueUpdate(productId, optionId, optionValueId, optionValue, price, quantity, displayValue, clearCache);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productOptionValueUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the option value should be updated | [default to null]
 **optionId** | **String**| Defines option id where the value has to be updated | [default to null]
 **optionValueId** | **String**| Defines value id that has to be assigned | [default to null]
 **optionValue** | **String**| Defines option value that has to be added | [optional] [default to null]
 **price** | **BigDecimal**| Defines new product option price | [optional] [default to null]
 **quantity** | **BigDecimal**| Defines new products&#39; options quantity | [optional] [default to null]
 **displayValue** | **String**| Defines the value that will be displayed for the option value | [optional] [default to null]
 **clearCache** | **Boolean**| Is cache clear required | [optional] [default to true]

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productPriceAdd

> CartValidate200Response productPriceAdd(productPriceAdd)

product.price.add

Add some prices to the product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductPriceAdd productPriceAdd = new ProductPriceAdd(); // ProductPriceAdd | 
try {
    CartValidate200Response result = apiInstance.productPriceAdd(productPriceAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productPriceAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productPriceAdd** | [**ProductPriceAdd**](ProductPriceAdd.md)|  |

### Return type

[**CartValidate200Response**](CartValidate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productPriceDelete

> AttributeDelete200Response productPriceDelete(productId, groupPrices, storeId)

product.price.delete

Delete some prices of the product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines the product where the price has to be deleted
String groupPrices = group_prices=5,8,9; // String | Defines product's group prices
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productPriceDelete(productId, groupPrices, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productPriceDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines the product where the price has to be deleted | [default to null]
 **groupPrices** | **String**| Defines product&#39;s group prices | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productPriceUpdate

> AccountConfigUpdate200Response productPriceUpdate(productPriceUpdate)

product.price.update

Update some prices of the product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductPriceUpdate productPriceUpdate = new ProductPriceUpdate(); // ProductPriceUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.productPriceUpdate(productPriceUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productPriceUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productPriceUpdate** | [**ProductPriceUpdate**](ProductPriceUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productReviewList

> ModelResponseProductReviewList productReviewList(productId, start, count, pageCursor, ids, storeId, status, responseFields, params, exclude)

product.review.list

Get reviews of a specific product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Product id
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String ids = 24,25; // String | Retrieves reviews specified by ids
String storeId = 1; // String | Store Id
String status = disabled; // String | Defines status
String responseFields = {return_code,return_message,pagination,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseProductReviewList result = apiInstance.productReviewList(productId, start, count, pageCursor, ids, storeId, status, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productReviewList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Product id | [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **ids** | **String**| Retrieves reviews specified by ids | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **status** | **String**| Defines status | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,customer_id,email,message,status,product_id,nick_name,summary,rating,ratings,status,created_time]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseProductReviewList**](ModelResponseProductReviewList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productStoreAssign

> AccountConfigUpdate200Response productStoreAssign(productId, storeId)

product.store.assign

Assign product to store

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines id of the product which should be assigned to a store
String storeId = 1; // String | Defines id of the store product should be assigned to
try {
    AccountConfigUpdate200Response result = apiInstance.productStoreAssign(productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productStoreAssign");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines id of the product which should be assigned to a store | [default to null]
 **storeId** | **String**| Defines id of the store product should be assigned to | [default to null]

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productTaxAdd

> ProductTaxAdd200Response productTaxAdd(productTaxAdd)

product.tax.add

Add tax class and tax rate to store and assign to product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductTaxAdd productTaxAdd = new ProductTaxAdd(); // ProductTaxAdd | 
try {
    ProductTaxAdd200Response result = apiInstance.productTaxAdd(productTaxAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productTaxAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productTaxAdd** | [**ProductTaxAdd**](ProductTaxAdd.md)|  |

### Return type

[**ProductTaxAdd200Response**](ProductTaxAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productUpdate

> AccountConfigUpdate200Response productUpdate(productUpdate)

product.update

This method can be used to update certain product data. The list of supported parameters depends on the specific platform. Please transmit only those parameters that are supported by the particular platform. Please note that to update the product quantity, it is recommended to use relative parameters (increase_quantity or reduce_quantity) to avoid unexpected overwrites on heavily loaded stores.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductUpdate productUpdate = new ProductUpdate(); // ProductUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.productUpdate(productUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productUpdate** | [**ProductUpdate**](ProductUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productUpdateBatch

> CategoryAddBatch200Response productUpdateBatch(productUpdateBatch)

product.update.batch

Update products on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductUpdateBatch productUpdateBatch = new ProductUpdateBatch(); // ProductUpdateBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productUpdateBatch(productUpdateBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productUpdateBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productUpdateBatch** | [**ProductUpdateBatch**](ProductUpdateBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantAdd

> ProductVariantAdd200Response productVariantAdd(productVariantAdd)

product.variant.add

Add variant to product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantAdd productVariantAdd = new ProductVariantAdd(); // ProductVariantAdd | 
try {
    ProductVariantAdd200Response result = apiInstance.productVariantAdd(productVariantAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantAdd** | [**ProductVariantAdd**](ProductVariantAdd.md)|  |

### Return type

[**ProductVariantAdd200Response**](ProductVariantAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantAddBatch

> CategoryAddBatch200Response productVariantAddBatch(productVariantAddBatch)

product.variant.add.batch

Add new product variants to the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantAddBatch productVariantAddBatch = new ProductVariantAddBatch(); // ProductVariantAddBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productVariantAddBatch(productVariantAddBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantAddBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantAddBatch** | [**ProductVariantAddBatch**](ProductVariantAddBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantCount

> ProductVariantCount200Response productVariantCount(productId, categoryId, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo)

product.variant.count

Get count variants.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Retrieves products' variants specified by product id
String categoryId = 6; // String | Counts products’ variants specified by category id
String storeId = 1; // String | Retrieves variants specified by store id
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
try {
    ProductVariantCount200Response result = apiInstance.productVariantCount(productId, categoryId, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Retrieves products&#39; variants specified by product id | [default to null]
 **categoryId** | **String**| Counts products’ variants specified by category id | [optional] [default to null]
 **storeId** | **String**| Retrieves variants specified by store id | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]

### Return type

[**ProductVariantCount200Response**](ProductVariantCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantDelete

> AttributeValueDelete200Response productVariantDelete(id, productId, storeId)

product.variant.delete

Delete variant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String id = 10; // String | Defines variant removal, specified by variant id
String productId = 10; // String | Defines product's id where the variant has to be deleted
String storeId = 1; // String | Store Id
try {
    AttributeValueDelete200Response result = apiInstance.productVariantDelete(id, productId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines variant removal, specified by variant id | [default to null]
 **productId** | **String**| Defines product&#39;s id where the variant has to be deleted | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantDeleteBatch

> CategoryAddBatch200Response productVariantDeleteBatch(productVariantDeleteBatch)

product.variant.delete.batch

Remove product variants from the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantDeleteBatch productVariantDeleteBatch = new ProductVariantDeleteBatch(); // ProductVariantDeleteBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productVariantDeleteBatch(productVariantDeleteBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantDeleteBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantDeleteBatch** | [**ProductVariantDeleteBatch**](ProductVariantDeleteBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantImageAdd

> ProductVariantImageAdd200Response productVariantImageAdd(productVariantImageAdd)

product.variant.image.add

Add image to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantImageAdd productVariantImageAdd = new ProductVariantImageAdd(); // ProductVariantImageAdd | 
try {
    ProductVariantImageAdd200Response result = apiInstance.productVariantImageAdd(productVariantImageAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantImageAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantImageAdd** | [**ProductVariantImageAdd**](ProductVariantImageAdd.md)|  |

### Return type

[**ProductVariantImageAdd200Response**](ProductVariantImageAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantImageDelete

> AttributeDelete200Response productVariantImageDelete(productId, productVariantId, id, storeId)

product.variant.image.delete

Delete  image to product

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String productId = 10; // String | Defines product id where the variant image should be deleted
String productVariantId = 45; // String | Defines product's variants specified by variant id
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productVariantImageDelete(productId, productVariantId, id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantImageDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **String**| Defines product id where the variant image should be deleted | [default to null]
 **productVariantId** | **String**| Defines product&#39;s variants specified by variant id | [default to null]
 **id** | **String**| Entity id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantInfo

> ProductInfo200Response productVariantInfo(id, storeId, params, exclude)

product.variant.info

Get variant info. This method is deprecated, and its development is stopped. Please use \&quot;product.child_item.info\&quot; instead.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String id = 10; // String | Retrieves variant's info specified by variant id
String storeId = 1; // String | Retrieves variant info specified by store id
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ProductInfo200Response result = apiInstance.productVariantInfo(id, storeId, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves variant&#39;s info specified by variant id | [default to null]
 **storeId** | **String**| Retrieves variant info specified by store id | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description,price]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ProductInfo200Response**](ProductInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantList

> ProductVariantList200Response productVariantList(start, count, productId, categoryId, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, params, exclude)

product.variant.list

Get a list of variants. This method is deprecated, and its development is stopped. Please use \&quot;product.child_item.list\&quot; instead.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String productId = 10; // String | Retrieves products' variants specified by product id
String categoryId = 6; // String | Retrieves products’ variants specified by category id
String storeId = 1; // String | Retrieves variants specified by store id
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ProductVariantList200Response result = apiInstance.productVariantList(start, count, productId, categoryId, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **productId** | **String**| Retrieves products&#39; variants specified by product id | [optional] [default to null]
 **categoryId** | **String**| Retrieves products’ variants specified by category id | [optional] [default to null]
 **storeId** | **String**| Retrieves variants specified by store id | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description,price]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ProductVariantList200Response**](ProductVariantList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantPriceAdd

> CartValidate200Response productVariantPriceAdd(productVariantPriceAdd)

product.variant.price.add

Add some prices to the product variant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantPriceAdd productVariantPriceAdd = new ProductVariantPriceAdd(); // ProductVariantPriceAdd | 
try {
    CartValidate200Response result = apiInstance.productVariantPriceAdd(productVariantPriceAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantPriceAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantPriceAdd** | [**ProductVariantPriceAdd**](ProductVariantPriceAdd.md)|  |

### Return type

[**CartValidate200Response**](CartValidate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantPriceDelete

> AttributeDelete200Response productVariantPriceDelete(id, productId, groupPrices, storeId)

product.variant.price.delete

Delete some prices of the product variant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
String id = 10; // String | Defines the variant where the price has to be deleted
String productId = 10; // String | Product id
String groupPrices = group_prices=6,8,9; // String | Defines variants's group prices
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.productVariantPriceDelete(id, productId, groupPrices, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantPriceDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Defines the variant where the price has to be deleted | [default to null]
 **productId** | **String**| Product id | [default to null]
 **groupPrices** | **String**| Defines variants&#39;s group prices | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVariantPriceUpdate

> AccountConfigUpdate200Response productVariantPriceUpdate(productVariantPriceUpdate)

product.variant.price.update

Update some prices of the product variant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantPriceUpdate productVariantPriceUpdate = new ProductVariantPriceUpdate(); // ProductVariantPriceUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.productVariantPriceUpdate(productVariantPriceUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantPriceUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantPriceUpdate** | [**ProductVariantPriceUpdate**](ProductVariantPriceUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantUpdate

> AccountConfigUpdate200Response productVariantUpdate(productVariantUpdate)

product.variant.update

Update variant.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantUpdate productVariantUpdate = new ProductVariantUpdate(); // ProductVariantUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.productVariantUpdate(productVariantUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantUpdate** | [**ProductVariantUpdate**](ProductVariantUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productVariantUpdateBatch

> CategoryAddBatch200Response productVariantUpdateBatch(productVariantUpdateBatch)

product.variant.update.batch

Update products variants on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductApi;

ProductApi apiInstance = new ProductApi();
ProductVariantUpdateBatch productVariantUpdateBatch = new ProductVariantUpdateBatch(); // ProductVariantUpdateBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.productVariantUpdateBatch(productVariantUpdateBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productVariantUpdateBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productVariantUpdateBatch** | [**ProductVariantUpdateBatch**](ProductVariantUpdateBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

