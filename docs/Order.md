

# Order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**orderId** | **String** |  |  [optional]
**basketId** | **String** |  |  [optional]
**channelId** | **String** |  |  [optional]
**customer** | [**BaseCustomer**](BaseCustomer.md) |  |  [optional]
**createAt** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**shippingAddress** | [**CustomerAddress**](CustomerAddress.md) |  |  [optional]
**billingAddress** | [**CustomerAddress**](CustomerAddress.md) |  |  [optional]
**paymentMethod** | [**OrderPaymentMethod**](OrderPaymentMethod.md) |  |  [optional]
**shippingMethod** | [**OrderShippingMethod**](OrderShippingMethod.md) |  |  [optional]
**shippingMethods** | [**List&lt;OrderShippingMethod&gt;**](OrderShippingMethod.md) |  |  [optional]
**status** | [**OrderStatus**](OrderStatus.md) |  |  [optional]
**totals** | [**OrderTotals**](OrderTotals.md) |  |  [optional]
**total** | [**OrderTotal**](OrderTotal.md) |  |  [optional]
**discounts** | [**List&lt;OrderTotalsNewDiscount&gt;**](OrderTotalsNewDiscount.md) |  |  [optional]
**orderProducts** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional]
**bundles** | [**List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional]
**modifiedAt** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional]
**finishedTime** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional]
**comment** | **String** |  |  [optional]
**storeId** | **String** |  |  [optional]
**warehousesIds** | **List&lt;String&gt;** |  |  [optional]
**refunds** | [**List&lt;OrderRefund&gt;**](OrderRefund.md) |  |  [optional]
**giftMessage** | **String** |  |  [optional]
**orderDetailsUrl** | **String** |  |  [optional]
**additionalFields** | **Object** |  |  [optional]
**customFields** | **Object** |  |  [optional]




