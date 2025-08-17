

# CartCouponAdd

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Coupon code | 
**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Coupon discount type | 
**actionApplyTo** | [**ActionApplyToEnum**](#ActionApplyToEnum) | Defines where discount should be applied | 
**actionScope** | [**ActionScopeEnum**](#ActionScopeEnum) | Specify how discount should be applied. If scope&#x3D;matching_items, then discount will be applied to each of the items that match action conditions. Scope order means that discount will be applied once. | 
**actionAmount** | [**BigDecimal**](BigDecimal.md) | Defines the discount amount value. | 
**codes** | **List&lt;String&gt;** | Entity codes |  [optional]
**name** | **String** | Coupon name |  [optional]
**dateStart** | **String** | Date start |  [optional]
**dateEnd** | **String** | Defines when discount code will be expired. |  [optional]
**usageLimit** | **Integer** | Usage limit for coupon. |  [optional]
**usageLimitPerCustomer** | **Integer** | Usage limit per customer. |  [optional]
**actionConditionEntity** | **String** | Defines entity for action condition. |  [optional]
**actionConditionKey** | **String** | Defines entity attribute code for action condition. |  [optional]
**actionConditionOperator** | **String** | Defines condition operator. |  [optional]
**actionConditionValue** | **String** | Defines condition attribute value/s. Can be comma separated string. |  [optional]
**includeTax** | **Boolean** | Indicates whether to apply a discount for taxes. |  [optional]
**storeId** | **String** | Store Id |  [optional]
**freeCashOnDelivery** | **Boolean** | Defines whether the coupon provides free cash on delivery |  [optional]
**customerId** | **String** | Retrieves orders specified by customer id |  [optional]


## Enum: ActionTypeEnum

Name | Value
---- | -----


## Enum: ActionApplyToEnum

Name | Value
---- | -----


## Enum: ActionScopeEnum

Name | Value
---- | -----




