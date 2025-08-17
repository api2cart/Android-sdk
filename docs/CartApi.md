# CartApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cartCatalogPriceRulesCount**](CartApi.md#cartCatalogPriceRulesCount) | **GET** /cart.catalog_price_rules.count.json | cart.catalog_price_rules.count
[**cartCatalogPriceRulesList**](CartApi.md#cartCatalogPriceRulesList) | **GET** /cart.catalog_price_rules.list.json | cart.catalog_price_rules.list
[**cartCouponAdd**](CartApi.md#cartCouponAdd) | **POST** /cart.coupon.add.json | cart.coupon.add
[**cartCouponConditionAdd**](CartApi.md#cartCouponConditionAdd) | **POST** /cart.coupon.condition.add.json | cart.coupon.condition.add
[**cartCouponCount**](CartApi.md#cartCouponCount) | **GET** /cart.coupon.count.json | cart.coupon.count
[**cartCouponDelete**](CartApi.md#cartCouponDelete) | **DELETE** /cart.coupon.delete.json | cart.coupon.delete
[**cartCouponList**](CartApi.md#cartCouponList) | **GET** /cart.coupon.list.json | cart.coupon.list
[**cartDelete**](CartApi.md#cartDelete) | **DELETE** /cart.delete.json | cart.delete
[**cartGiftcardAdd**](CartApi.md#cartGiftcardAdd) | **POST** /cart.giftcard.add.json | cart.giftcard.add
[**cartGiftcardCount**](CartApi.md#cartGiftcardCount) | **GET** /cart.giftcard.count.json | cart.giftcard.count
[**cartGiftcardDelete**](CartApi.md#cartGiftcardDelete) | **DELETE** /cart.giftcard.delete.json | cart.giftcard.delete
[**cartGiftcardList**](CartApi.md#cartGiftcardList) | **GET** /cart.giftcard.list.json | cart.giftcard.list
[**cartInfo**](CartApi.md#cartInfo) | **GET** /cart.info.json | cart.info
[**cartMetaDataList**](CartApi.md#cartMetaDataList) | **GET** /cart.meta_data.list.json | cart.meta_data.list
[**cartMetaDataSet**](CartApi.md#cartMetaDataSet) | **POST** /cart.meta_data.set.json | cart.meta_data.set
[**cartMetaDataUnset**](CartApi.md#cartMetaDataUnset) | **DELETE** /cart.meta_data.unset.json | cart.meta_data.unset
[**cartMethods**](CartApi.md#cartMethods) | **GET** /cart.methods.json | cart.methods
[**cartPluginList**](CartApi.md#cartPluginList) | **GET** /cart.plugin.list.json | cart.plugin.list
[**cartScriptAdd**](CartApi.md#cartScriptAdd) | **POST** /cart.script.add.json | cart.script.add
[**cartScriptDelete**](CartApi.md#cartScriptDelete) | **DELETE** /cart.script.delete.json | cart.script.delete
[**cartScriptList**](CartApi.md#cartScriptList) | **GET** /cart.script.list.json | cart.script.list
[**cartShippingZonesList**](CartApi.md#cartShippingZonesList) | **GET** /cart.shipping_zones.list.json | cart.shipping_zones.list
[**cartValidate**](CartApi.md#cartValidate) | **GET** /cart.validate.json | cart.validate



## cartCatalogPriceRulesCount

> CartCatalogPriceRulesCount200Response cartCatalogPriceRulesCount()

cart.catalog_price_rules.count

Get count of cart catalog price rules discounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
try {
    CartCatalogPriceRulesCount200Response result = apiInstance.cartCatalogPriceRulesCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCatalogPriceRulesCount");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CartCatalogPriceRulesCount200Response**](CartCatalogPriceRulesCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartCatalogPriceRulesList

> ModelResponseCartCatalogPriceRulesList cartCatalogPriceRulesList(start, count, pageCursor, ids, responseFields, params, exclude)

cart.catalog_price_rules.list

Get cart catalog price rules discounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String ids = 24,25; // String | Retrieves  catalog_price_rules by ids
String responseFields = {result{catalog_price_rules_count,catalog_price_rules{id,type,name,avail,usage_count,actions,conditions}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartCatalogPriceRulesList result = apiInstance.cartCatalogPriceRulesList(start, count, pageCursor, ids, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCatalogPriceRulesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **ids** | **String**| Retrieves  catalog_price_rules by ids | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartCatalogPriceRulesList**](ModelResponseCartCatalogPriceRulesList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartCouponAdd

> CartCouponAdd200Response cartCouponAdd(cartCouponAdd)

cart.coupon.add

Use this method to create a coupon with specified conditions.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
CartCouponAdd cartCouponAdd = new CartCouponAdd(); // CartCouponAdd | 
try {
    CartCouponAdd200Response result = apiInstance.cartCouponAdd(cartCouponAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCouponAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartCouponAdd** | [**CartCouponAdd**](CartCouponAdd.md)|  |

### Return type

[**CartCouponAdd200Response**](CartCouponAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## cartCouponConditionAdd

> BasketLiveShippingServiceDelete200Response cartCouponConditionAdd(couponId, entity, key, operator, value, target, includeTax, includeShipping, storeId)

cart.coupon.condition.add

Use this method to add additional conditions for coupon application.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String couponId = 45845; // String | Coupon Id
String entity = order; // String | Defines condition entity type
String key = subtotal; // String | Defines condition entity attribute key
String operator = ==; // String | Defines condition operator
String value = 2; // String | Defines condition value, can be comma separated according to the operator.
String target = coupon_action; // String | Defines condition operator
Boolean includeTax = true; // Boolean | Indicates whether to apply a discount for taxes.
Boolean includeShipping = true; // Boolean | Indicates whether to apply a discount for shipping.
String storeId = 1; // String | Store Id
try {
    BasketLiveShippingServiceDelete200Response result = apiInstance.cartCouponConditionAdd(couponId, entity, key, operator, value, target, includeTax, includeShipping, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCouponConditionAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **String**| Coupon Id | [default to null]
 **entity** | **String**| Defines condition entity type | [default to null] [enum: order, order_shipping_address, product, customer]
 **key** | **String**| Defines condition entity attribute key | [default to null] [enum: total, subtotal, shipping_total, total_quantity, total_weight, country, product_id, variant_id, category_id, customer_id, item_price, item_total_price, item_quantity, carrier_id]
 **operator** | **String**| Defines condition operator | [default to null]
 **value** | **String**| Defines condition value, can be comma separated according to the operator. | [default to null]
 **target** | **String**| Defines condition operator | [optional] [default to coupon_prerequisite]
 **includeTax** | **Boolean**| Indicates whether to apply a discount for taxes. | [optional] [default to false]
 **includeShipping** | **Boolean**| Indicates whether to apply a discount for shipping. | [optional] [default to false]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartCouponCount

> CartCouponCount200Response cartCouponCount(storeId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo)

cart.coupon.count

This method allows you to get the number of coupons. On some platforms, you can filter the coupons by the date they were active.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String storeId = 1; // String | Store Id
Boolean avail = false; // Boolean | Defines category's visibility status
String dateStartFrom = 2016-12-29 16:44:30; // String | Filter entity by date_start (greater or equal)
String dateStartTo = 2016-12-29 16:44:30; // String | Filter entity by date_start (less or equal)
String dateEndFrom = 2016-12-29 16:44:30; // String | Filter entity by date_end (greater or equal)
String dateEndTo = 2016-12-29 16:44:30; // String | Filter entity by date_end (less or equal)
try {
    CartCouponCount200Response result = apiInstance.cartCouponCount(storeId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCouponCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]
 **avail** | **Boolean**| Defines category&#39;s visibility status | [optional] [default to true]
 **dateStartFrom** | **String**| Filter entity by date_start (greater or equal) | [optional] [default to null]
 **dateStartTo** | **String**| Filter entity by date_start (less or equal) | [optional] [default to null]
 **dateEndFrom** | **String**| Filter entity by date_end (greater or equal) | [optional] [default to null]
 **dateEndTo** | **String**| Filter entity by date_end (less or equal) | [optional] [default to null]

### Return type

[**CartCouponCount200Response**](CartCouponCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartCouponDelete

> AttributeDelete200Response cartCouponDelete(id, storeId)

cart.coupon.delete

Delete coupon

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.cartCouponDelete(id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCouponDelete");
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


## cartCouponList

> ModelResponseCartCouponList cartCouponList(start, count, pageCursor, couponsIds, storeId, langId, avail, status, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo, responseFields, params, exclude)

cart.coupon.list

Get cart coupon discounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String couponsIds = 1,2,3; // String | Filter coupons by ids
String storeId = 1; // String | Filter coupons by store id
String langId = 3; // String | Language id
Boolean avail = false; // Boolean | Filter coupons by avail status
String status = disabled; // String | Defines coupon's status
String dateStartFrom = 2016-12-29 16:44:30; // String | Filter entity by date_start (greater or equal)
String dateStartTo = 2016-12-29 16:44:30; // String | Filter entity by date_start (less or equal)
String dateEndFrom = 2016-12-29 16:44:30; // String | Filter entity by date_end (greater or equal)
String dateEndTo = 2016-12-29 16:44:30; // String | Filter entity by date_end (less or equal)
String responseFields = {pagination,result{coupon_count,coupon{id,code,name,conditions,actions{scope,amount,conditions{id,value,sub-conditions}},date_start,avail}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,code,type,amount; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = usage_history,type; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartCouponList result = apiInstance.cartCouponList(start, count, pageCursor, couponsIds, storeId, langId, avail, status, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartCouponList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **couponsIds** | **String**| Filter coupons by ids | [optional] [default to null]
 **storeId** | **String**| Filter coupons by store id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **avail** | **Boolean**| Filter coupons by avail status | [optional] [default to null]
 **status** | **String**| Defines coupon&#39;s status | [optional] [default to null]
 **dateStartFrom** | **String**| Filter entity by date_start (greater or equal) | [optional] [default to null]
 **dateStartTo** | **String**| Filter entity by date_start (less or equal) | [optional] [default to null]
 **dateEndFrom** | **String**| Filter entity by date_end (greater or equal) | [optional] [default to null]
 **dateEndTo** | **String**| Filter entity by date_end (less or equal) | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,code,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartCouponList**](ModelResponseCartCouponList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartDelete

> CartDelete200Response cartDelete(deleteBridge)

cart.delete

Remove store from API2Cart

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Boolean deleteBridge = true; // Boolean | Identifies if there is a necessity to delete bridge
try {
    CartDelete200Response result = apiInstance.cartDelete(deleteBridge);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteBridge** | **Boolean**| Identifies if there is a necessity to delete bridge | [optional] [default to true]

### Return type

[**CartDelete200Response**](CartDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartGiftcardAdd

> CartGiftcardAdd200Response cartGiftcardAdd(amount, code, ownerEmail, recipientEmail, recipientName, ownerName)

cart.giftcard.add

Use this method to create a gift card for a specified amount.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
BigDecimal amount = 15.5; // BigDecimal | Defines the gift card amount value.
String code = GFT1 A4S5 AA11 RD61; // String | Gift card code
String ownerEmail = jubari@hannsgroup.com; // String | Gift card owner email
String recipientEmail = jubari@hannsgroup.com; // String | Gift card recipient email
String recipientName = John Doe; // String | Gift card recipient name
String ownerName = John Doe; // String | Gift card owner name
try {
    CartGiftcardAdd200Response result = apiInstance.cartGiftcardAdd(amount, code, ownerEmail, recipientEmail, recipientName, ownerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartGiftcardAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amount** | **BigDecimal**| Defines the gift card amount value. | [default to null]
 **code** | **String**| Gift card code | [optional] [default to null]
 **ownerEmail** | **String**| Gift card owner email | [optional] [default to null]
 **recipientEmail** | **String**| Gift card recipient email | [optional] [default to null]
 **recipientName** | **String**| Gift card recipient name | [optional] [default to null]
 **ownerName** | **String**| Gift card owner name | [optional] [default to null]

### Return type

[**CartGiftcardAdd200Response**](CartGiftcardAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartGiftcardCount

> CartGiftcardCount200Response cartGiftcardCount(storeId)

cart.giftcard.count

Get gift cards count.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String storeId = 1; // String | Store Id
try {
    CartGiftcardCount200Response result = apiInstance.cartGiftcardCount(storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartGiftcardCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CartGiftcardCount200Response**](CartGiftcardCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartGiftcardDelete

> AttributeDelete200Response cartGiftcardDelete(id)

cart.giftcard.delete

Delete giftcard

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String id = 10; // String | Entity id
try {
    AttributeDelete200Response result = apiInstance.cartGiftcardDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartGiftcardDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartGiftcardList

> ModelResponseCartGiftCardList cartGiftcardList(start, count, pageCursor, storeId, responseFields, params, exclude)

cart.giftcard.list

Get gift cards list.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Store Id
String responseFields = {pagination,result{gift_card{id,code,amount,status}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartGiftCardList result = apiInstance.cartGiftcardList(start, count, pageCursor, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartGiftcardList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,code,name]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartGiftCardList**](ModelResponseCartGiftCardList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartInfo

> CartInfo200Response cartInfo(storeId, responseFields, params, exclude)

cart.info

This method allows you to get various information about the store, including a list of stores (in the case of a multistore configuration), a list of supported languages, currencies, carriers, warehouses, and many other information. This information contains data that is relatively stable and rarely changes, so API2Cart can cache certain data to reduce the load on the store and speed up the execution of the request. We also recommend that you cache the response of this method on your side to save requests. If you need to clear the cache for a specific store, then use the cart.validate method.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String storeId = 1; // String | Store Id
String responseFields = {result{name,url,stores_info{store_id,name,currency{id,iso3},store_owner_info}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = name,url; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = name,url; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    CartInfo200Response result = apiInstance.cartInfo(storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to store_name,store_url,db_prefix]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**CartInfo200Response**](CartInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartMetaDataList

> ModelResponseCartMetaDataList cartMetaDataList(entityId, count, pageCursor, entity, storeId, langId, key, responseFields, params, exclude)

cart.meta_data.list

Using this method, you can get a list of metadata for various entities (products, options, customers, orders). Usually this is data created by third-party plugins.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String entityId = 1; // String | Entity Id
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String entity = order; // String | Entity
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
String key = subtotal; // String | Key
String responseFields = {result{items{key,value}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartMetaDataList result = apiInstance.cartMetaDataList(entityId, count, pageCursor, entity, storeId, langId, key, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartMetaDataList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| Entity Id | [default to null]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **entity** | **String**| Entity | [optional] [default to product]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]
 **key** | **String**| Key | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to key,value]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartMetaDataList**](ModelResponseCartMetaDataList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartMetaDataSet

> AttributeAdd200Response cartMetaDataSet(entityId, key, value, namespace, entity, storeId, langId)

cart.meta_data.set

Set meta data for a specific entity

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String entityId = 1; // String | Entity Id
String key = subtotal; // String | Key
String value = 2; // String | Value
String namespace = order; // String | Metafield namespace
String entity = order; // String | Entity
String storeId = 1; // String | Store Id
String langId = 3; // String | Language id
try {
    AttributeAdd200Response result = apiInstance.cartMetaDataSet(entityId, key, value, namespace, entity, storeId, langId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartMetaDataSet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| Entity Id | [default to null]
 **key** | **String**| Key | [default to null]
 **value** | **String**| Value | [default to null]
 **namespace** | **String**| Metafield namespace | [default to null]
 **entity** | **String**| Entity | [optional] [default to product]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **langId** | **String**| Language id | [optional] [default to null]

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartMetaDataUnset

> BasketLiveShippingServiceDelete200Response cartMetaDataUnset(entityId, key, id, entity, storeId)

cart.meta_data.unset

Unset meta data for a specific entity

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String entityId = 1; // String | Entity Id
String key = subtotal; // String | Key
String id = 10; // String | Entity id
String entity = order; // String | Entity
String storeId = 1; // String | Store Id
try {
    BasketLiveShippingServiceDelete200Response result = apiInstance.cartMetaDataUnset(entityId, key, id, entity, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartMetaDataUnset");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| Entity Id | [default to null]
 **key** | **String**| Key | [default to null]
 **id** | **String**| Entity id | [default to null]
 **entity** | **String**| Entity | [optional] [default to product]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartMethods

> CartMethods200Response cartMethods()

cart.methods

Returns a list of supported API methods.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
try {
    CartMethods200Response result = apiInstance.cartMethods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartMethods");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CartMethods200Response**](CartMethods200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartPluginList

> CartPluginList200Response cartPluginList(start, count, storeId)

cart.plugin.list

Get a list of third-party plugins installed on the store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String storeId = 1; // String | Store Id
try {
    CartPluginList200Response result = apiInstance.cartPluginList(start, count, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartPluginList");
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

[**CartPluginList200Response**](CartPluginList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartScriptAdd

> CartScriptAdd200Response cartScriptAdd(name, description, html, src, loadMethod, scope, events, storeId)

cart.script.add

Add new script to the storefront

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String name = jQuery Minimized; // String | The user-friendly script name
String description = The Write Less, Do More, JavaScript Library; // String | The user-friendly description
String html = &#x3C;script&#x3E;alert(&#x27;foo&#x27;)&#x3C;/script&#x3E;; // String | An html string containing exactly one `script` tag.
String src = https://js-aplenty.com/foo.js; // String | The URL of the remote script
String loadMethod = async; // String | The load method to use for the script
String scope = all; // String | The page or pages on the online store where the script should be included
String events = purchase_event; // String | Event for run scripts
String storeId = 1; // String | Store Id
try {
    CartScriptAdd200Response result = apiInstance.cartScriptAdd(name, description, html, src, loadMethod, scope, events, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartScriptAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The user-friendly script name | [optional] [default to null]
 **description** | **String**| The user-friendly description | [optional] [default to null]
 **html** | **String**| An html string containing exactly one &#x60;script&#x60; tag. | [optional] [default to null]
 **src** | **String**| The URL of the remote script | [optional] [default to null]
 **loadMethod** | **String**| The load method to use for the script | [optional] [default to null]
 **scope** | **String**| The page or pages on the online store where the script should be included | [optional] [default to storefront]
 **events** | **String**| Event for run scripts | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**CartScriptAdd200Response**](CartScriptAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartScriptDelete

> AttributeDelete200Response cartScriptDelete(id, storeId)

cart.script.delete

Remove script from the storefront

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
String id = 10; // String | Entity id
String storeId = 1; // String | Store Id
try {
    AttributeDelete200Response result = apiInstance.cartScriptDelete(id, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartScriptDelete");
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


## cartScriptList

> ModelResponseCartScriptList cartScriptList(start, count, pageCursor, scriptIds, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

cart.script.list

Get scripts installed to the storefront

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String scriptIds = 34023324,34024032; // String | Retrieves only scripts with specific ids
String storeId = 1; // String | Store Id
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String responseFields = {pagination,result{total_count,scripts{id,name,src,created_time{value}}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartScriptList result = apiInstance.cartScriptList(start, count, pageCursor, scriptIds, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartScriptList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **scriptIds** | **String**| Retrieves only scripts with specific ids | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,description]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartScriptList**](ModelResponseCartScriptList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartShippingZonesList

> ModelResponseCartShippingZonesList cartShippingZonesList(start, count, storeId, responseFields, params, exclude)

cart.shipping_zones.list

Get list of shipping zones

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String storeId = 1; // String | Store Id
String responseFields = {result{id,name,enabled,countries,shipping_methods{name,rates}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseCartShippingZonesList result = apiInstance.cartShippingZonesList(start, count, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartShippingZonesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,name,enabled]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseCartShippingZonesList**](ModelResponseCartShippingZonesList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## cartValidate

> CartValidate200Response cartValidate(validateVersion)

cart.validate

This method clears the cache in API2Cart for a particular store and checks whether the connection to the store is available. Use this method if there have been any changes in the settings on the storе, for example, if a new plugin has been installed or removed.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CartApi;

CartApi apiInstance = new CartApi();
Boolean validateVersion = true; // Boolean | Specify if api2cart should validate cart version
try {
    CartValidate200Response result = apiInstance.cartValidate(validateVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartApi#cartValidate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validateVersion** | **Boolean**| Specify if api2cart should validate cart version | [optional] [default to false]

### Return type

[**CartValidate200Response**](CartValidate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

