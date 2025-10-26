# OrderApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAbandonedList**](OrderApi.md#orderAbandonedList) | **GET** /order.abandoned.list.json | order.abandoned.list
[**orderAdd**](OrderApi.md#orderAdd) | **POST** /order.add.json | order.add
[**orderCalculate**](OrderApi.md#orderCalculate) | **POST** /order.calculate.json | order.calculate
[**orderCount**](OrderApi.md#orderCount) | **GET** /order.count.json | order.count
[**orderFinancialStatusList**](OrderApi.md#orderFinancialStatusList) | **GET** /order.financial_status.list.json | order.financial_status.list
[**orderFulfillmentStatusList**](OrderApi.md#orderFulfillmentStatusList) | **GET** /order.fulfillment_status.list.json | order.fulfillment_status.list
[**orderInfo**](OrderApi.md#orderInfo) | **GET** /order.info.json | order.info
[**orderList**](OrderApi.md#orderList) | **GET** /order.list.json | order.list
[**orderPreestimateShippingList**](OrderApi.md#orderPreestimateShippingList) | **POST** /order.preestimate_shipping.list.json | order.preestimate_shipping.list
[**orderRefundAdd**](OrderApi.md#orderRefundAdd) | **POST** /order.refund.add.json | order.refund.add
[**orderReturnAdd**](OrderApi.md#orderReturnAdd) | **POST** /order.return.add.json | order.return.add
[**orderReturnDelete**](OrderApi.md#orderReturnDelete) | **DELETE** /order.return.delete.json | order.return.delete
[**orderReturnUpdate**](OrderApi.md#orderReturnUpdate) | **PUT** /order.return.update.json | order.return.update
[**orderShipmentAdd**](OrderApi.md#orderShipmentAdd) | **POST** /order.shipment.add.json | order.shipment.add
[**orderShipmentAddBatch**](OrderApi.md#orderShipmentAddBatch) | **POST** /order.shipment.add.batch.json | order.shipment.add.batch
[**orderShipmentDelete**](OrderApi.md#orderShipmentDelete) | **DELETE** /order.shipment.delete.json | order.shipment.delete
[**orderShipmentInfo**](OrderApi.md#orderShipmentInfo) | **GET** /order.shipment.info.json | order.shipment.info
[**orderShipmentList**](OrderApi.md#orderShipmentList) | **GET** /order.shipment.list.json | order.shipment.list
[**orderShipmentTrackingAdd**](OrderApi.md#orderShipmentTrackingAdd) | **POST** /order.shipment.tracking.add.json | order.shipment.tracking.add
[**orderShipmentUpdate**](OrderApi.md#orderShipmentUpdate) | **PUT** /order.shipment.update.json | order.shipment.update
[**orderStatusList**](OrderApi.md#orderStatusList) | **GET** /order.status.list.json | order.status.list
[**orderTransactionList**](OrderApi.md#orderTransactionList) | **GET** /order.transaction.list.json | order.transaction.list
[**orderUpdate**](OrderApi.md#orderUpdate) | **PUT** /order.update.json | order.update



## orderAbandonedList

> ModelResponseOrderAbandonedList orderAbandonedList(start, count, pageCursor, customerId, customerEmail, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, skipEmptyEmail, responseFields, params, exclude)

order.abandoned.list

Get list of orders that were left by customers before completing the order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String customerId = 5; // String | Retrieves orders specified by customer id
String customerEmail = jubari@hannsgroup.com; // String | Retrieves orders specified by customer email
String storeId = 1; // String | Store Id
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
Boolean skipEmptyEmail = true; // Boolean | Filter empty emails
String responseFields = {return_code,pagination,result{order{id,customer{email},created_at,totals{total},order_products}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = force_all; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = customer; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseOrderAbandonedList result = apiInstance.orderAbandonedList(start, count, pageCursor, customerId, customerEmail, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, skipEmptyEmail, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAbandonedList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **customerId** | **String**| Retrieves orders specified by customer id | [optional] [default to null]
 **customerEmail** | **String**| Retrieves orders specified by customer email | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **skipEmptyEmail** | **Boolean**| Filter empty emails | [optional] [default to false]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to customer,totals,items]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseOrderAbandonedList**](ModelResponseOrderAbandonedList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderAdd

> OrderAdd200Response orderAdd(orderAdd)

order.add

Add a new order to the cart.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderAdd orderAdd = new OrderAdd(); // OrderAdd | 
try {
    OrderAdd200Response result = apiInstance.orderAdd(orderAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderAdd** | [**OrderAdd**](OrderAdd.md)|  |

### Return type

[**OrderAdd200Response**](OrderAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderCalculate

> OrderCalculate200Response orderCalculate(orderCalculate)

order.calculate

&lt;p&gt;Calculates the total cost of an order for a given customer and a set of products, as well as the available shipping methods based on the specified address. The calculation takes into account store product prices, discounts, taxes, shipping costs, and other store settings. The result includes a detailed breakdown of the final order cost by its components.&lt;/p&gt; &lt;p&gt;Note that the final totals, taxes, and other amounts must include the corresponding values for the selected shipping method.&lt;/p&gt;&lt;p&gt;The result of this method can be used when creating an order using the &lt;strong&gt;order.add&lt;/strong&gt; method.&lt;/p&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderCalculate orderCalculate = new OrderCalculate(); // OrderCalculate | 
try {
    OrderCalculate200Response result = apiInstance.orderCalculate(orderCalculate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCalculate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderCalculate** | [**OrderCalculate**](OrderCalculate.md)|  |

### Return type

[**OrderCalculate200Response**](OrderCalculate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderCount

> OrderCount200Response orderCount(orderIds, ids, customerId, storeId, customerEmail, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentChannel, fulfillmentStatus, shippingMethod, deliveryMethod, tags, shipNodeType, createdFrom, createdTo, modifiedFrom, modifiedTo)

order.count

Count orders in store

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderIds = 24,25; // String | Counts orders specified by order ids
String ids = 24,25; // String | Counts orders specified by ids
String customerId = 5; // String | Counts orders quantity specified by customer id
String storeId = 1; // String | Counts orders quantity specified by store id
String customerEmail = jubari@hannsgroup.com; // String | Counts orders quantity specified by customer email
String orderStatus = Completed; // String | Counts orders quantity specified by order status
List<String> orderStatusIds = null; // List<String> | Retrieves orders specified by order statuses
String ebayOrderStatus = Active; // String | Counts orders quantity specified by order status
String financialStatus = paid; // String | Counts orders quantity specified by financial status
List<String> financialStatusIds = null; // List<String> | Retrieves orders count specified by financial status ids
String fulfillmentChannel = local; // String | Retrieves order with a fulfillment channel
String fulfillmentStatus = fulfilled; // String | Create order with fulfillment status
String shippingMethod = flatrate_flatrate; // String | Retrieve entities according to shipping method
String deliveryMethod = local; // String | Retrieves order with delivery method
String tags = tag1,tag2; // String | Order tags
String shipNodeType = SellerFulfilled; // String | Retrieves order with ship node type
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
try {
    OrderCount200Response result = apiInstance.orderCount(orderIds, ids, customerId, storeId, customerEmail, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentChannel, fulfillmentStatus, shippingMethod, deliveryMethod, tags, shipNodeType, createdFrom, createdTo, modifiedFrom, modifiedTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCount");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **String**| Counts orders specified by order ids | [optional] [default to null]
 **ids** | **String**| Counts orders specified by ids | [optional] [default to null]
 **customerId** | **String**| Counts orders quantity specified by customer id | [optional] [default to null]
 **storeId** | **String**| Counts orders quantity specified by store id | [optional] [default to null]
 **customerEmail** | **String**| Counts orders quantity specified by customer email | [optional] [default to null]
 **orderStatus** | **String**| Counts orders quantity specified by order status | [optional] [default to null]
 **orderStatusIds** | [**List&lt;String&gt;**](String.md)| Retrieves orders specified by order statuses | [optional] [default to null]
 **ebayOrderStatus** | **String**| Counts orders quantity specified by order status | [optional] [default to null]
 **financialStatus** | **String**| Counts orders quantity specified by financial status | [optional] [default to null]
 **financialStatusIds** | [**List&lt;String&gt;**](String.md)| Retrieves orders count specified by financial status ids | [optional] [default to null]
 **fulfillmentChannel** | **String**| Retrieves order with a fulfillment channel | [optional] [default to null]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional] [default to null]
 **shippingMethod** | **String**| Retrieve entities according to shipping method | [optional] [default to null]
 **deliveryMethod** | **String**| Retrieves order with delivery method | [optional] [default to null]
 **tags** | **String**| Order tags | [optional] [default to null]
 **shipNodeType** | **String**| Retrieves order with ship node type | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]

### Return type

[**OrderCount200Response**](OrderCount200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderFinancialStatusList

> OrderFinancialStatusList200Response orderFinancialStatusList()

order.financial_status.list

Retrieve list of financial statuses

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
try {
    OrderFinancialStatusList200Response result = apiInstance.orderFinancialStatusList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderFinancialStatusList");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**OrderFinancialStatusList200Response**](OrderFinancialStatusList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderFulfillmentStatusList

> OrderFulfillmentStatusList200Response orderFulfillmentStatusList(action)

order.fulfillment_status.list

Retrieve list of fulfillment statuses

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String action = add; // String | Available statuses for the specified action.
try {
    OrderFulfillmentStatusList200Response result = apiInstance.orderFulfillmentStatusList(action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderFulfillmentStatusList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| Available statuses for the specified action. | [optional] [default to null]

### Return type

[**OrderFulfillmentStatusList200Response**](OrderFulfillmentStatusList200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderInfo

> OrderInfo200Response orderInfo(id, orderId, storeId, params, responseFields, exclude, enableCache, useLatestApiVersion, roundingPrecision)

order.info

Info about a specific order by ID

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String id = 10; // String | Retrieves order info specified by id
String orderId = 25; // String | Retrieves order’s info specified by order id
String storeId = 1; // String | Defines store id where the order should be found
String params = order_id,totals,status; // String | Set this parameter in order to choose which entity fields you want to retrieve
String responseFields = {result{order_id,customer,totals,address,items,bundles,status}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = order_id,totals,status; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
Boolean enableCache = true; // Boolean | If the value is 'true' and order exist in our cache, we will return order.info response from cache
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
Integer roundingPrecision = 3; // Integer | <p>Specifies the rounding precision for fractional numeric values (such as prices, taxes, and weights).</p> <p>Supported values range from <b>1</b> to <b>6</b>.</p> <p>The default rounding precision may vary depending on the platform. You can retrieve the default value using the <strong>cart.info</strong> method in the <code>default_rounding_precision</code> field. </p><p>Values are rounded to the nearest number at the specified precision. Fractions of .5 or higher are rounded up, while fractions lower than .5 are rounded down.</p>
try {
    OrderInfo200Response result = apiInstance.orderInfo(id, orderId, storeId, params, responseFields, exclude, enableCache, useLatestApiVersion, roundingPrecision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Retrieves order info specified by id | [optional] [default to null]
 **orderId** | **String**| Retrieves order’s info specified by order id | [optional] [default to null]
 **storeId** | **String**| Defines store id where the order should be found | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to order_id,customer,totals,address,items,bundles,status]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **enableCache** | **Boolean**| If the value is &#39;true&#39; and order exist in our cache, we will return order.info response from cache | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]
 **roundingPrecision** | **Integer**| &lt;p&gt;Specifies the rounding precision for fractional numeric values (such as prices, taxes, and weights).&lt;/p&gt; &lt;p&gt;Supported values range from &lt;b&gt;1&lt;/b&gt; to &lt;b&gt;6&lt;/b&gt;.&lt;/p&gt; &lt;p&gt;The default rounding precision may vary depending on the platform. You can retrieve the default value using the &lt;strong&gt;cart.info&lt;/strong&gt; method in the &lt;code&gt;default_rounding_precision&lt;/code&gt; field. &lt;/p&gt;&lt;p&gt;Values are rounded to the nearest number at the specified precision. Fractions of .5 or higher are rounded up, while fractions lower than .5 are rounded down.&lt;/p&gt; | [optional] [default to null]

### Return type

[**OrderInfo200Response**](OrderInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderList

> ModelResponseOrderList orderList(start, count, pageCursor, ids, orderIds, sinceId, storeId, customerId, customerEmail, basketId, currencyId, phone, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentStatus, returnStatus, fulfillmentChannel, shippingMethod, skipOrderIds, isDeleted, shippingCountryIso3, deliveryMethod, shipNodeType, createdTo, createdFrom, modifiedTo, modifiedFrom, tags, sortBy, sortDirection, params, responseFields, exclude, enableCache, useLatestApiVersion, roundingPrecision)

order.list

Get list of orders from store.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve orders via cursor-based pagination (it can't be used with any other filtering parameter)
String ids = 24,25; // String | Retrieves orders specified by ids
String orderIds = 24,25; // String | Retrieves orders specified by order ids
String sinceId = 56; // String | Retrieve entities starting from the specified id.
String storeId = 1; // String | Store Id
String customerId = 5; // String | Retrieves orders specified by customer id
String customerEmail = jubari@hannsgroup.com; // String | Retrieves orders specified by customer email
String basketId = 1; // String | Retrieves order’s info specified by basket id.
String currencyId = usd; // String | Currency Id
String phone = 56686868654; // String | Filter orders by customer's phone number
String orderStatus = Completed; // String | Retrieves orders specified by order status
List<String> orderStatusIds = null; // List<String> | Retrieves orders specified by order statuses
String ebayOrderStatus = Active; // String | Retrieves orders specified by order status
String financialStatus = paid; // String | Retrieves orders specified by financial status
List<String> financialStatusIds = null; // List<String> | Retrieves orders specified by financial status ids
String fulfillmentStatus = fulfilled; // String | Create order with fulfillment status
String returnStatus = RETURNED; // String | Retrieves orders specified by return status
String fulfillmentChannel = local; // String | Retrieves order with a fulfillment channel
String shippingMethod = flatrate_flatrate; // String | Retrieve entities according to shipping method
String skipOrderIds = 24,25; // String | Skipped orders by ids
Boolean isDeleted = true; // Boolean | Filter deleted orders
String shippingCountryIso3 = DEU; // String | Retrieve entities according to shipping country
String deliveryMethod = local; // String | Retrieves order with delivery method
String shipNodeType = SellerFulfilled; // String | Retrieves order with ship node type
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String tags = tag1,tag2; // String | Order tags
String sortBy = modified_at; // String | Set field to sort by
String sortDirection = asc; // String | Set sorting direction
String params = order_id,totals,status; // String | Set this parameter in order to choose which entity fields you want to retrieve
String responseFields = {return_code,pagination,result{order{order_id,customer,totals,address,items,bundles,status}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = order_id,totals,status; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
Boolean enableCache = true; // Boolean | If the value is 'true', we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add)
Boolean useLatestApiVersion = true; // Boolean | Use the latest platform API version
Integer roundingPrecision = 3; // Integer | <p>Specifies the rounding precision for fractional numeric values (such as prices, taxes, and weights).</p> <p>Supported values range from <b>1</b> to <b>6</b>.</p> <p>The default rounding precision may vary depending on the platform. You can retrieve the default value using the <strong>cart.info</strong> method in the <code>default_rounding_precision</code> field. </p><p>Values are rounded to the nearest number at the specified precision. Fractions of .5 or higher are rounded up, while fractions lower than .5 are rounded down.</p>
try {
    ModelResponseOrderList result = apiInstance.orderList(start, count, pageCursor, ids, orderIds, sinceId, storeId, customerId, customerEmail, basketId, currencyId, phone, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentStatus, returnStatus, fulfillmentChannel, shippingMethod, skipOrderIds, isDeleted, shippingCountryIso3, deliveryMethod, shipNodeType, createdTo, createdFrom, modifiedTo, modifiedFrom, tags, sortBy, sortDirection, params, responseFields, exclude, enableCache, useLatestApiVersion, roundingPrecision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve orders via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **ids** | **String**| Retrieves orders specified by ids | [optional] [default to null]
 **orderIds** | **String**| Retrieves orders specified by order ids | [optional] [default to null]
 **sinceId** | **String**| Retrieve entities starting from the specified id. | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **customerId** | **String**| Retrieves orders specified by customer id | [optional] [default to null]
 **customerEmail** | **String**| Retrieves orders specified by customer email | [optional] [default to null]
 **basketId** | **String**| Retrieves order’s info specified by basket id. | [optional] [default to null]
 **currencyId** | **String**| Currency Id | [optional] [default to null]
 **phone** | **String**| Filter orders by customer&#39;s phone number | [optional] [default to null]
 **orderStatus** | **String**| Retrieves orders specified by order status | [optional] [default to null]
 **orderStatusIds** | [**List&lt;String&gt;**](String.md)| Retrieves orders specified by order statuses | [optional] [default to null]
 **ebayOrderStatus** | **String**| Retrieves orders specified by order status | [optional] [default to null]
 **financialStatus** | **String**| Retrieves orders specified by financial status | [optional] [default to null]
 **financialStatusIds** | [**List&lt;String&gt;**](String.md)| Retrieves orders specified by financial status ids | [optional] [default to null]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional] [default to null]
 **returnStatus** | **String**| Retrieves orders specified by return status | [optional] [default to null]
 **fulfillmentChannel** | **String**| Retrieves order with a fulfillment channel | [optional] [default to null]
 **shippingMethod** | **String**| Retrieve entities according to shipping method | [optional] [default to null]
 **skipOrderIds** | **String**| Skipped orders by ids | [optional] [default to null]
 **isDeleted** | **Boolean**| Filter deleted orders | [optional] [default to null]
 **shippingCountryIso3** | **String**| Retrieve entities according to shipping country | [optional] [default to null]
 **deliveryMethod** | **String**| Retrieves order with delivery method | [optional] [default to null]
 **shipNodeType** | **String**| Retrieves order with ship node type | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **tags** | **String**| Order tags | [optional] [default to null]
 **sortBy** | **String**| Set field to sort by | [optional] [default to order_id]
 **sortDirection** | **String**| Set sorting direction | [optional] [default to asc]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to order_id,customer,totals,address,items,bundles,status]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]
 **enableCache** | **Boolean**| If the value is &#39;true&#39;, we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add) | [optional] [default to false]
 **useLatestApiVersion** | **Boolean**| Use the latest platform API version | [optional] [default to false]
 **roundingPrecision** | **Integer**| &lt;p&gt;Specifies the rounding precision for fractional numeric values (such as prices, taxes, and weights).&lt;/p&gt; &lt;p&gt;Supported values range from &lt;b&gt;1&lt;/b&gt; to &lt;b&gt;6&lt;/b&gt;.&lt;/p&gt; &lt;p&gt;The default rounding precision may vary depending on the platform. You can retrieve the default value using the &lt;strong&gt;cart.info&lt;/strong&gt; method in the &lt;code&gt;default_rounding_precision&lt;/code&gt; field. &lt;/p&gt;&lt;p&gt;Values are rounded to the nearest number at the specified precision. Fractions of .5 or higher are rounded up, while fractions lower than .5 are rounded down.&lt;/p&gt; | [optional] [default to null]

### Return type

[**ModelResponseOrderList**](ModelResponseOrderList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderPreestimateShippingList

> ModelResponseOrderPreestimateShippingList orderPreestimateShippingList(orderPreestimateShippingList)

order.preestimate_shipping.list

Retrieve list of order preestimated shipping methods

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderPreestimateShippingList orderPreestimateShippingList = new OrderPreestimateShippingList(); // OrderPreestimateShippingList | 
try {
    ModelResponseOrderPreestimateShippingList result = apiInstance.orderPreestimateShippingList(orderPreestimateShippingList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderPreestimateShippingList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderPreestimateShippingList** | [**OrderPreestimateShippingList**](OrderPreestimateShippingList.md)|  |

### Return type

[**ModelResponseOrderPreestimateShippingList**](ModelResponseOrderPreestimateShippingList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderRefundAdd

> OrderRefundAdd200Response orderRefundAdd(orderRefundAdd)

order.refund.add

Add a refund to the order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderRefundAdd orderRefundAdd = new OrderRefundAdd(); // OrderRefundAdd | 
try {
    OrderRefundAdd200Response result = apiInstance.orderRefundAdd(orderRefundAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderRefundAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRefundAdd** | [**OrderRefundAdd**](OrderRefundAdd.md)|  |

### Return type

[**OrderRefundAdd200Response**](OrderRefundAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderReturnAdd

> OrderReturnAdd200Response orderReturnAdd(orderReturnAdd)

order.return.add

Create new return request.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderReturnAdd orderReturnAdd = new OrderReturnAdd(); // OrderReturnAdd | 
try {
    OrderReturnAdd200Response result = apiInstance.orderReturnAdd(orderReturnAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderReturnAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderReturnAdd** | [**OrderReturnAdd**](OrderReturnAdd.md)|  |

### Return type

[**OrderReturnAdd200Response**](OrderReturnAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderReturnDelete

> AttributeValueDelete200Response orderReturnDelete(returnId, orderId, storeId)

order.return.delete

Delete return.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String returnId = 200000002; // String | Return ID
String orderId = 25; // String | Defines the order id
String storeId = 1; // String | Store Id
try {
    AttributeValueDelete200Response result = apiInstance.orderReturnDelete(returnId, orderId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderReturnDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnId** | **String**| Return ID | [default to null]
 **orderId** | **String**| Defines the order id | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderReturnUpdate

> AccountConfigUpdate200Response orderReturnUpdate(orderReturnUpdate)

order.return.update

Update order&#39;s shipment information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderReturnUpdate orderReturnUpdate = new OrderReturnUpdate(); // OrderReturnUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.orderReturnUpdate(orderReturnUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderReturnUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderReturnUpdate** | [**OrderReturnUpdate**](OrderReturnUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderShipmentAdd

> OrderShipmentAdd200Response orderShipmentAdd(orderShipmentAdd)

order.shipment.add

Add a shipment to the order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderShipmentAdd orderShipmentAdd = new OrderShipmentAdd(); // OrderShipmentAdd | 
try {
    OrderShipmentAdd200Response result = apiInstance.orderShipmentAdd(orderShipmentAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentAdd** | [**OrderShipmentAdd**](OrderShipmentAdd.md)|  |

### Return type

[**OrderShipmentAdd200Response**](OrderShipmentAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderShipmentAddBatch

> CategoryAddBatch200Response orderShipmentAddBatch(orderShipmentAddBatch)

order.shipment.add.batch

Add a shipments to the orders.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderShipmentAddBatch orderShipmentAddBatch = new OrderShipmentAddBatch(); // OrderShipmentAddBatch | 
try {
    CategoryAddBatch200Response result = apiInstance.orderShipmentAddBatch(orderShipmentAddBatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentAddBatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentAddBatch** | [**OrderShipmentAddBatch**](OrderShipmentAddBatch.md)|  |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderShipmentDelete

> OrderShipmentDelete200Response orderShipmentDelete(shipmentId, orderId, storeId)

order.shipment.delete

Delete order&#39;s shipment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String shipmentId = 200000002; // String | Shipment id indicates the number of delivery
String orderId = 25; // String | Defines the order for which the shipment will be deleted
String storeId = 1; // String | Store Id
try {
    OrderShipmentDelete200Response result = apiInstance.orderShipmentDelete(shipmentId, orderId, storeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| Shipment id indicates the number of delivery | [default to null]
 **orderId** | **String**| Defines the order for which the shipment will be deleted | [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]

### Return type

[**OrderShipmentDelete200Response**](OrderShipmentDelete200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderShipmentInfo

> OrderShipmentInfo200Response orderShipmentInfo(id, orderId, start, storeId, responseFields, params, exclude)

order.shipment.info

Get information of shipment.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String id = 10; // String | Entity id
String orderId = 25; // String | Defines the order id
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
String storeId = 1; // String | Store Id
String responseFields = {result{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    OrderShipmentInfo200Response result = apiInstance.orderShipmentInfo(id, orderId, start, storeId, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Entity id | [default to null]
 **orderId** | **String**| Defines the order id | [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,order_id,items,tracking_numbers]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**OrderShipmentInfo200Response**](OrderShipmentInfo200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderShipmentList

> ModelResponseOrderShipmentList orderShipmentList(orderId, start, count, pageCursor, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

order.shipment.list

Get list of shipments per order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderId = 25; // String | Retrieves shipments specified by order id
Integer start = 0; // Integer | This parameter sets the number from which you want to get entities
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Store Id
String createdFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their creation date
String createdTo = 2100-08-29 13:45:52; // String | Retrieve entities to their creation date
String modifiedFrom = 2010-07-29 13:45:52; // String | Retrieve entities from their modification date
String modifiedTo = 2100-08-29 13:45:52; // String | Retrieve entities to their modification date
String responseFields = {status_code,pagination,result{shipment{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseOrderShipmentList result = apiInstance.orderShipmentList(orderId, start, count, pageCursor, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Retrieves shipments specified by order id | [default to null]
 **start** | **Integer**| This parameter sets the number from which you want to get entities | [optional] [default to 0]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **createdFrom** | **String**| Retrieve entities from their creation date | [optional] [default to null]
 **createdTo** | **String**| Retrieve entities to their creation date | [optional] [default to null]
 **modifiedFrom** | **String**| Retrieve entities from their modification date | [optional] [default to null]
 **modifiedTo** | **String**| Retrieve entities to their modification date | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,order_id,items,tracking_numbers]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseOrderShipmentList**](ModelResponseOrderShipmentList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderShipmentTrackingAdd

> OrderShipmentTrackingAdd200Response orderShipmentTrackingAdd(orderShipmentTrackingAdd)

order.shipment.tracking.add

Add order shipment&#39;s tracking info.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderShipmentTrackingAdd orderShipmentTrackingAdd = new OrderShipmentTrackingAdd(); // OrderShipmentTrackingAdd | 
try {
    OrderShipmentTrackingAdd200Response result = apiInstance.orderShipmentTrackingAdd(orderShipmentTrackingAdd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentTrackingAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentTrackingAdd** | [**OrderShipmentTrackingAdd**](OrderShipmentTrackingAdd.md)|  |

### Return type

[**OrderShipmentTrackingAdd200Response**](OrderShipmentTrackingAdd200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderShipmentUpdate

> AccountConfigUpdate200Response orderShipmentUpdate(orderShipmentUpdate)

order.shipment.update

Update order&#39;s shipment information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
OrderShipmentUpdate orderShipmentUpdate = new OrderShipmentUpdate(); // OrderShipmentUpdate | 
try {
    AccountConfigUpdate200Response result = apiInstance.orderShipmentUpdate(orderShipmentUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderShipmentUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderShipmentUpdate** | [**OrderShipmentUpdate**](OrderShipmentUpdate.md)|  |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## orderStatusList

> ModelResponseOrderStatusList orderStatusList(storeId, action, responseFields)

order.status.list

Retrieve list of statuses

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String storeId = 1; // String | Store Id
String action = add; // String | Available statuses for the specified action.
String responseFields = {return_code,return_message,result}; // String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    ModelResponseOrderStatusList result = apiInstance.orderStatusList(storeId, action, responseFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderStatusList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storeId** | **String**| Store Id | [optional] [default to null]
 **action** | **String**| Available statuses for the specified action. | [optional] [default to null]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]

### Return type

[**ModelResponseOrderStatusList**](ModelResponseOrderStatusList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderTransactionList

> ModelResponseOrderTransactionList orderTransactionList(orderIds, count, pageCursor, storeId, params, responseFields, exclude)

order.transaction.list

Retrieve list of order transaction

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderIds = 24,25; // String | Retrieves order transactions specified by order ids
Integer count = 20; // Integer | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
String pageCursor = ; // String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
String storeId = 1; // String | Store Id
String params = id,model,price,images; // String | Set this parameter in order to choose which entity fields you want to retrieve
String responseFields = {return_code,pagination,result{transactions_count,transactions{id,transaction_id,status,description,settlement_amount,gateway,card_brand,card_last_four}}}; // String | Set this parameter in order to choose which entity fields you want to retrieve
String exclude = false; // String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    ModelResponseOrderTransactionList result = apiInstance.orderTransactionList(orderIds, count, pageCursor, storeId, params, responseFields, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderTransactionList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderIds** | **String**| Retrieves order transactions specified by order ids | [default to null]
 **count** | **Integer**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10]
 **pageCursor** | **String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] [default to null]
 **storeId** | **String**| Store Id | [optional] [default to null]
 **params** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to id,order_id,amount,description]
 **responseFields** | **String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to null]
 **exclude** | **String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] [default to null]

### Return type

[**ModelResponseOrderTransactionList**](ModelResponseOrderTransactionList.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## orderUpdate

> AccountConfigUpdate200Response orderUpdate(orderId, storeId, orderStatus, financialStatus, fulfillmentStatus, cancellationReason, orderPaymentMethod, comment, adminComment, adminPrivateComment, invoiceAdminComment, dateModified, dateFinished, sendNotifications, createInvoice, origin, tags)

order.update

Update existing order.

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderId = 25; // String | Defines the orders specified by order id
String storeId = 1; // String | Defines store id where the order should be found
String orderStatus = Completed; // String | Defines new order's status
String financialStatus = paid; // String | Update order financial status to specified
String fulfillmentStatus = fulfilled; // String | Create order with fulfillment status
String cancellationReason = ORDER_UNPAID; // String | Defines the cancellation reason when the order will be canceled
String orderPaymentMethod = PayPal; // String | Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid'
String comment = This coole order; // String | Specifies order comment
String adminComment = Test admin comment; // String | Specifies admin's order comment
String adminPrivateComment = Test admin private comment; // String | Specifies private admin's order comment
String invoiceAdminComment = Test admin comment; // String | Specifies admin's order invoice comment
String dateModified = 2014-05-05 05:05:00; // String | Specifies order's  modification date
String dateFinished = 2014-06-05 05:05:00; // String | Specifies order's  finished date
Boolean sendNotifications = true; // Boolean | Send notifications to customer after order was created
Boolean createInvoice = true; // Boolean | Determines whether an invoice should be created if it has not already been created
String origin = newsletter; // String | The source of the order
String tags = tag1,tag2; // String | Order tags
try {
    AccountConfigUpdate200Response result = apiInstance.orderUpdate(orderId, storeId, orderStatus, financialStatus, fulfillmentStatus, cancellationReason, orderPaymentMethod, comment, adminComment, adminPrivateComment, invoiceAdminComment, dateModified, dateFinished, sendNotifications, createInvoice, origin, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Defines the orders specified by order id | [default to null]
 **storeId** | **String**| Defines store id where the order should be found | [optional] [default to null]
 **orderStatus** | **String**| Defines new order&#39;s status | [optional] [default to null]
 **financialStatus** | **String**| Update order financial status to specified | [optional] [default to null]
 **fulfillmentStatus** | **String**| Create order with fulfillment status | [optional] [default to null]
 **cancellationReason** | **String**| Defines the cancellation reason when the order will be canceled | [optional] [default to null]
 **orderPaymentMethod** | **String**| Defines order payment method.&lt;br/&gt;Setting order_payment_method on Shopify will also change financial_status field value to &#39;paid&#39; | [optional] [default to null]
 **comment** | **String**| Specifies order comment | [optional] [default to null]
 **adminComment** | **String**| Specifies admin&#39;s order comment | [optional] [default to null]
 **adminPrivateComment** | **String**| Specifies private admin&#39;s order comment | [optional] [default to null]
 **invoiceAdminComment** | **String**| Specifies admin&#39;s order invoice comment | [optional] [default to null]
 **dateModified** | **String**| Specifies order&#39;s  modification date | [optional] [default to null]
 **dateFinished** | **String**| Specifies order&#39;s  finished date | [optional] [default to null]
 **sendNotifications** | **Boolean**| Send notifications to customer after order was created | [optional] [default to false]
 **createInvoice** | **Boolean**| Determines whether an invoice should be created if it has not already been created | [optional] [default to null]
 **origin** | **String**| The source of the order | [optional] [default to null]
 **tags** | **String**| Order tags | [optional] [default to null]

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

### Authorization

[StoreKeyAuth](../README.md#StoreKeyAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

