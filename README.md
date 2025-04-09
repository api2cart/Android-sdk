# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        AccountApi apiInstance = new AccountApi();
        AccountCartAdd accountCartAdd = new AccountCartAdd(); // AccountCartAdd | 
        try {
            AccountCartAdd200Response result = apiInstance.accountCartAdd(accountCartAdd);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCartAdd");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.api2cart.com/v1.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountCartAdd**](docs/AccountApi.md#accountCartAdd) | **POST** /account.cart.add.json | account.cart.add
*AccountApi* | [**accountCartList**](docs/AccountApi.md#accountCartList) | **GET** /account.cart.list.json | account.cart.list
*AccountApi* | [**accountConfigUpdate**](docs/AccountApi.md#accountConfigUpdate) | **PUT** /account.config.update.json | account.config.update
*AccountApi* | [**accountFailedWebhooks**](docs/AccountApi.md#accountFailedWebhooks) | **GET** /account.failed_webhooks.json | account.failed_webhooks
*AccountApi* | [**accountSupportedPlatforms**](docs/AccountApi.md#accountSupportedPlatforms) | **GET** /account.supported_platforms.json | account.supported_platforms
*AttributeApi* | [**attributeAdd**](docs/AttributeApi.md#attributeAdd) | **POST** /attribute.add.json | attribute.add
*AttributeApi* | [**attributeAssignGroup**](docs/AttributeApi.md#attributeAssignGroup) | **POST** /attribute.assign.group.json | attribute.assign.group
*AttributeApi* | [**attributeAssignSet**](docs/AttributeApi.md#attributeAssignSet) | **POST** /attribute.assign.set.json | attribute.assign.set
*AttributeApi* | [**attributeAttributesetList**](docs/AttributeApi.md#attributeAttributesetList) | **GET** /attribute.attributeset.list.json | attribute.attributeset.list
*AttributeApi* | [**attributeCount**](docs/AttributeApi.md#attributeCount) | **GET** /attribute.count.json | attribute.count
*AttributeApi* | [**attributeDelete**](docs/AttributeApi.md#attributeDelete) | **DELETE** /attribute.delete.json | attribute.delete
*AttributeApi* | [**attributeGroupList**](docs/AttributeApi.md#attributeGroupList) | **GET** /attribute.group.list.json | attribute.group.list
*AttributeApi* | [**attributeInfo**](docs/AttributeApi.md#attributeInfo) | **GET** /attribute.info.json | attribute.info
*AttributeApi* | [**attributeList**](docs/AttributeApi.md#attributeList) | **GET** /attribute.list.json | attribute.list
*AttributeApi* | [**attributeTypeList**](docs/AttributeApi.md#attributeTypeList) | **GET** /attribute.type.list.json | attribute.type.list
*AttributeApi* | [**attributeUnassignGroup**](docs/AttributeApi.md#attributeUnassignGroup) | **POST** /attribute.unassign.group.json | attribute.unassign.group
*AttributeApi* | [**attributeUnassignSet**](docs/AttributeApi.md#attributeUnassignSet) | **POST** /attribute.unassign.set.json | attribute.unassign.set
*AttributeApi* | [**attributeUpdate**](docs/AttributeApi.md#attributeUpdate) | **PUT** /attribute.update.json | attribute.update
*AttributeApi* | [**attributeValueAdd**](docs/AttributeApi.md#attributeValueAdd) | **POST** /attribute.value.add.json | attribute.value.add
*AttributeApi* | [**attributeValueDelete**](docs/AttributeApi.md#attributeValueDelete) | **DELETE** /attribute.value.delete.json | attribute.value.delete
*AttributeApi* | [**attributeValueUpdate**](docs/AttributeApi.md#attributeValueUpdate) | **PUT** /attribute.value.update.json | attribute.value.update
*BasketApi* | [**basketInfo**](docs/BasketApi.md#basketInfo) | **GET** /basket.info.json | basket.info
*BasketApi* | [**basketItemAdd**](docs/BasketApi.md#basketItemAdd) | **POST** /basket.item.add.json | basket.item.add
*BasketApi* | [**basketLiveShippingServiceCreate**](docs/BasketApi.md#basketLiveShippingServiceCreate) | **POST** /basket.live_shipping_service.create.json | basket.live_shipping_service.create
*BasketApi* | [**basketLiveShippingServiceDelete**](docs/BasketApi.md#basketLiveShippingServiceDelete) | **DELETE** /basket.live_shipping_service.delete.json | basket.live_shipping_service.delete
*BasketApi* | [**basketLiveShippingServiceList**](docs/BasketApi.md#basketLiveShippingServiceList) | **GET** /basket.live_shipping_service.list.json | basket.live_shipping_service.list
*BatchApi* | [**batchJobList**](docs/BatchApi.md#batchJobList) | **GET** /batch.job.list.json | batch.job.list
*BatchApi* | [**batchJobResult**](docs/BatchApi.md#batchJobResult) | **GET** /batch.job.result.json | batch.job.result
*BridgeApi* | [**bridgeDelete**](docs/BridgeApi.md#bridgeDelete) | **POST** /bridge.delete.json | bridge.delete
*BridgeApi* | [**bridgeDownload**](docs/BridgeApi.md#bridgeDownload) | **GET** /bridge.download.file | bridge.download
*BridgeApi* | [**bridgeUpdate**](docs/BridgeApi.md#bridgeUpdate) | **POST** /bridge.update.json | bridge.update
*CartApi* | [**cartBridge**](docs/CartApi.md#cartBridge) | **GET** /cart.bridge.json | cart.bridge
*CartApi* | [**cartCatalogPriceRulesCount**](docs/CartApi.md#cartCatalogPriceRulesCount) | **GET** /cart.catalog_price_rules.count.json | cart.catalog_price_rules.count
*CartApi* | [**cartCatalogPriceRulesList**](docs/CartApi.md#cartCatalogPriceRulesList) | **GET** /cart.catalog_price_rules.list.json | cart.catalog_price_rules.list
*CartApi* | [**cartClearCache**](docs/CartApi.md#cartClearCache) | **POST** /cart.clear_cache.json | cart.clear_cache
*CartApi* | [**cartConfig**](docs/CartApi.md#cartConfig) | **GET** /cart.config.json | cart.config
*CartApi* | [**cartConfigUpdate**](docs/CartApi.md#cartConfigUpdate) | **PUT** /cart.config.update.json | cart.config.update
*CartApi* | [**cartCouponAdd**](docs/CartApi.md#cartCouponAdd) | **POST** /cart.coupon.add.json | cart.coupon.add
*CartApi* | [**cartCouponConditionAdd**](docs/CartApi.md#cartCouponConditionAdd) | **POST** /cart.coupon.condition.add.json | cart.coupon.condition.add
*CartApi* | [**cartCouponCount**](docs/CartApi.md#cartCouponCount) | **GET** /cart.coupon.count.json | cart.coupon.count
*CartApi* | [**cartCouponDelete**](docs/CartApi.md#cartCouponDelete) | **DELETE** /cart.coupon.delete.json | cart.coupon.delete
*CartApi* | [**cartCouponList**](docs/CartApi.md#cartCouponList) | **GET** /cart.coupon.list.json | cart.coupon.list
*CartApi* | [**cartCreate**](docs/CartApi.md#cartCreate) | **POST** /cart.create.json | cart.create
*CartApi* | [**cartDelete**](docs/CartApi.md#cartDelete) | **DELETE** /cart.delete.json | cart.delete
*CartApi* | [**cartDisconnect**](docs/CartApi.md#cartDisconnect) | **GET** /cart.disconnect.json | cart.disconnect
*CartApi* | [**cartGiftcardAdd**](docs/CartApi.md#cartGiftcardAdd) | **POST** /cart.giftcard.add.json | cart.giftcard.add
*CartApi* | [**cartGiftcardCount**](docs/CartApi.md#cartGiftcardCount) | **GET** /cart.giftcard.count.json | cart.giftcard.count
*CartApi* | [**cartGiftcardDelete**](docs/CartApi.md#cartGiftcardDelete) | **DELETE** /cart.giftcard.delete.json | cart.giftcard.delete
*CartApi* | [**cartGiftcardList**](docs/CartApi.md#cartGiftcardList) | **GET** /cart.giftcard.list.json | cart.giftcard.list
*CartApi* | [**cartInfo**](docs/CartApi.md#cartInfo) | **GET** /cart.info.json | cart.info
*CartApi* | [**cartList**](docs/CartApi.md#cartList) | **GET** /cart.list.json | cart.list
*CartApi* | [**cartMetaDataList**](docs/CartApi.md#cartMetaDataList) | **GET** /cart.meta_data.list.json | cart.meta_data.list
*CartApi* | [**cartMetaDataSet**](docs/CartApi.md#cartMetaDataSet) | **POST** /cart.meta_data.set.json | cart.meta_data.set
*CartApi* | [**cartMetaDataUnset**](docs/CartApi.md#cartMetaDataUnset) | **DELETE** /cart.meta_data.unset.json | cart.meta_data.unset
*CartApi* | [**cartMethods**](docs/CartApi.md#cartMethods) | **GET** /cart.methods.json | cart.methods
*CartApi* | [**cartPluginList**](docs/CartApi.md#cartPluginList) | **GET** /cart.plugin.list.json | cart.plugin.list
*CartApi* | [**cartScriptAdd**](docs/CartApi.md#cartScriptAdd) | **POST** /cart.script.add.json | cart.script.add
*CartApi* | [**cartScriptDelete**](docs/CartApi.md#cartScriptDelete) | **DELETE** /cart.script.delete.json | cart.script.delete
*CartApi* | [**cartScriptList**](docs/CartApi.md#cartScriptList) | **GET** /cart.script.list.json | cart.script.list
*CartApi* | [**cartShippingZonesList**](docs/CartApi.md#cartShippingZonesList) | **GET** /cart.shipping_zones.list.json | cart.shipping_zones.list
*CartApi* | [**cartValidate**](docs/CartApi.md#cartValidate) | **GET** /cart.validate.json | cart.validate
*CategoryApi* | [**categoryAdd**](docs/CategoryApi.md#categoryAdd) | **POST** /category.add.json | category.add
*CategoryApi* | [**categoryAddBatch**](docs/CategoryApi.md#categoryAddBatch) | **POST** /category.add.batch.json | category.add.batch
*CategoryApi* | [**categoryAssign**](docs/CategoryApi.md#categoryAssign) | **POST** /category.assign.json | category.assign
*CategoryApi* | [**categoryCount**](docs/CategoryApi.md#categoryCount) | **GET** /category.count.json | category.count
*CategoryApi* | [**categoryDelete**](docs/CategoryApi.md#categoryDelete) | **DELETE** /category.delete.json | category.delete
*CategoryApi* | [**categoryFind**](docs/CategoryApi.md#categoryFind) | **GET** /category.find.json | category.find
*CategoryApi* | [**categoryImageAdd**](docs/CategoryApi.md#categoryImageAdd) | **POST** /category.image.add.json | category.image.add
*CategoryApi* | [**categoryImageDelete**](docs/CategoryApi.md#categoryImageDelete) | **DELETE** /category.image.delete.json | category.image.delete
*CategoryApi* | [**categoryInfo**](docs/CategoryApi.md#categoryInfo) | **GET** /category.info.json | category.info
*CategoryApi* | [**categoryList**](docs/CategoryApi.md#categoryList) | **GET** /category.list.json | category.list
*CategoryApi* | [**categoryUnassign**](docs/CategoryApi.md#categoryUnassign) | **POST** /category.unassign.json | category.unassign
*CategoryApi* | [**categoryUpdate**](docs/CategoryApi.md#categoryUpdate) | **PUT** /category.update.json | category.update
*CustomerApi* | [**customerAdd**](docs/CustomerApi.md#customerAdd) | **POST** /customer.add.json | customer.add
*CustomerApi* | [**customerAddressAdd**](docs/CustomerApi.md#customerAddressAdd) | **POST** /customer.address.add.json | customer.address.add
*CustomerApi* | [**customerAttributeList**](docs/CustomerApi.md#customerAttributeList) | **GET** /customer.attribute.list.json | customer.attribute.list
*CustomerApi* | [**customerCount**](docs/CustomerApi.md#customerCount) | **GET** /customer.count.json | customer.count
*CustomerApi* | [**customerDelete**](docs/CustomerApi.md#customerDelete) | **DELETE** /customer.delete.json | customer.delete
*CustomerApi* | [**customerFind**](docs/CustomerApi.md#customerFind) | **GET** /customer.find.json | customer.find
*CustomerApi* | [**customerGroupAdd**](docs/CustomerApi.md#customerGroupAdd) | **POST** /customer.group.add.json | customer.group.add
*CustomerApi* | [**customerGroupList**](docs/CustomerApi.md#customerGroupList) | **GET** /customer.group.list.json | customer.group.list
*CustomerApi* | [**customerInfo**](docs/CustomerApi.md#customerInfo) | **GET** /customer.info.json | customer.info
*CustomerApi* | [**customerList**](docs/CustomerApi.md#customerList) | **GET** /customer.list.json | customer.list
*CustomerApi* | [**customerUpdate**](docs/CustomerApi.md#customerUpdate) | **PUT** /customer.update.json | customer.update
*CustomerApi* | [**customerWishlistList**](docs/CustomerApi.md#customerWishlistList) | **GET** /customer.wishlist.list.json | customer.wishlist.list
*MarketplaceApi* | [**marketplaceProductFind**](docs/MarketplaceApi.md#marketplaceProductFind) | **GET** /marketplace.product.find.json | marketplace.product.find
*OrderApi* | [**orderAbandonedList**](docs/OrderApi.md#orderAbandonedList) | **GET** /order.abandoned.list.json | order.abandoned.list
*OrderApi* | [**orderAdd**](docs/OrderApi.md#orderAdd) | **POST** /order.add.json | order.add
*OrderApi* | [**orderCount**](docs/OrderApi.md#orderCount) | **GET** /order.count.json | order.count
*OrderApi* | [**orderFinancialStatusList**](docs/OrderApi.md#orderFinancialStatusList) | **GET** /order.financial_status.list.json | order.financial_status.list
*OrderApi* | [**orderFind**](docs/OrderApi.md#orderFind) | **GET** /order.find.json | order.find
*OrderApi* | [**orderFulfillmentStatusList**](docs/OrderApi.md#orderFulfillmentStatusList) | **GET** /order.fulfillment_status.list.json | order.fulfillment_status.list
*OrderApi* | [**orderInfo**](docs/OrderApi.md#orderInfo) | **GET** /order.info.json | order.info
*OrderApi* | [**orderList**](docs/OrderApi.md#orderList) | **GET** /order.list.json | order.list
*OrderApi* | [**orderPreestimateShippingList**](docs/OrderApi.md#orderPreestimateShippingList) | **POST** /order.preestimate_shipping.list.json | order.preestimate_shipping.list
*OrderApi* | [**orderRefundAdd**](docs/OrderApi.md#orderRefundAdd) | **POST** /order.refund.add.json | order.refund.add
*OrderApi* | [**orderReturnAdd**](docs/OrderApi.md#orderReturnAdd) | **POST** /order.return.add.json | order.return.add
*OrderApi* | [**orderReturnDelete**](docs/OrderApi.md#orderReturnDelete) | **DELETE** /order.return.delete.json | order.return.delete
*OrderApi* | [**orderReturnUpdate**](docs/OrderApi.md#orderReturnUpdate) | **PUT** /order.return.update.json | order.return.update
*OrderApi* | [**orderShipmentAdd**](docs/OrderApi.md#orderShipmentAdd) | **POST** /order.shipment.add.json | order.shipment.add
*OrderApi* | [**orderShipmentAddBatch**](docs/OrderApi.md#orderShipmentAddBatch) | **POST** /order.shipment.add.batch.json | order.shipment.add.batch
*OrderApi* | [**orderShipmentDelete**](docs/OrderApi.md#orderShipmentDelete) | **DELETE** /order.shipment.delete.json | order.shipment.delete
*OrderApi* | [**orderShipmentInfo**](docs/OrderApi.md#orderShipmentInfo) | **GET** /order.shipment.info.json | order.shipment.info
*OrderApi* | [**orderShipmentList**](docs/OrderApi.md#orderShipmentList) | **GET** /order.shipment.list.json | order.shipment.list
*OrderApi* | [**orderShipmentTrackingAdd**](docs/OrderApi.md#orderShipmentTrackingAdd) | **POST** /order.shipment.tracking.add.json | order.shipment.tracking.add
*OrderApi* | [**orderShipmentUpdate**](docs/OrderApi.md#orderShipmentUpdate) | **PUT** /order.shipment.update.json | order.shipment.update
*OrderApi* | [**orderStatusList**](docs/OrderApi.md#orderStatusList) | **GET** /order.status.list.json | order.status.list
*OrderApi* | [**orderTransactionList**](docs/OrderApi.md#orderTransactionList) | **GET** /order.transaction.list.json | order.transaction.list
*OrderApi* | [**orderUpdate**](docs/OrderApi.md#orderUpdate) | **PUT** /order.update.json | order.update
*ProductApi* | [**productAdd**](docs/ProductApi.md#productAdd) | **POST** /product.add.json | product.add
*ProductApi* | [**productAddBatch**](docs/ProductApi.md#productAddBatch) | **POST** /product.add.batch.json | product.add.batch
*ProductApi* | [**productAttributeList**](docs/ProductApi.md#productAttributeList) | **GET** /product.attribute.list.json | product.attribute.list
*ProductApi* | [**productAttributeValueSet**](docs/ProductApi.md#productAttributeValueSet) | **POST** /product.attribute.value.set.json | product.attribute.value.set
*ProductApi* | [**productAttributeValueUnset**](docs/ProductApi.md#productAttributeValueUnset) | **POST** /product.attribute.value.unset.json | product.attribute.value.unset
*ProductApi* | [**productBrandList**](docs/ProductApi.md#productBrandList) | **GET** /product.brand.list.json | product.brand.list
*ProductApi* | [**productChildItemFind**](docs/ProductApi.md#productChildItemFind) | **GET** /product.child_item.find.json | product.child_item.find
*ProductApi* | [**productChildItemInfo**](docs/ProductApi.md#productChildItemInfo) | **GET** /product.child_item.info.json | product.child_item.info
*ProductApi* | [**productChildItemList**](docs/ProductApi.md#productChildItemList) | **GET** /product.child_item.list.json | product.child_item.list
*ProductApi* | [**productCount**](docs/ProductApi.md#productCount) | **GET** /product.count.json | product.count
*ProductApi* | [**productCurrencyAdd**](docs/ProductApi.md#productCurrencyAdd) | **POST** /product.currency.add.json | product.currency.add
*ProductApi* | [**productCurrencyList**](docs/ProductApi.md#productCurrencyList) | **GET** /product.currency.list.json | product.currency.list
*ProductApi* | [**productDelete**](docs/ProductApi.md#productDelete) | **DELETE** /product.delete.json | product.delete
*ProductApi* | [**productDeleteBatch**](docs/ProductApi.md#productDeleteBatch) | **POST** /product.delete.batch.json | product.delete.batch
*ProductApi* | [**productFields**](docs/ProductApi.md#productFields) | **GET** /product.fields.json | product.fields
*ProductApi* | [**productFind**](docs/ProductApi.md#productFind) | **GET** /product.find.json | product.find
*ProductApi* | [**productImageAdd**](docs/ProductApi.md#productImageAdd) | **POST** /product.image.add.json | product.image.add
*ProductApi* | [**productImageDelete**](docs/ProductApi.md#productImageDelete) | **DELETE** /product.image.delete.json | product.image.delete
*ProductApi* | [**productImageUpdate**](docs/ProductApi.md#productImageUpdate) | **PUT** /product.image.update.json | product.image.update
*ProductApi* | [**productInfo**](docs/ProductApi.md#productInfo) | **GET** /product.info.json | product.info
*ProductApi* | [**productList**](docs/ProductApi.md#productList) | **GET** /product.list.json | product.list
*ProductApi* | [**productManufacturerAdd**](docs/ProductApi.md#productManufacturerAdd) | **POST** /product.manufacturer.add.json | product.manufacturer.add
*ProductApi* | [**productOptionAdd**](docs/ProductApi.md#productOptionAdd) | **POST** /product.option.add.json | product.option.add
*ProductApi* | [**productOptionAssign**](docs/ProductApi.md#productOptionAssign) | **POST** /product.option.assign.json | product.option.assign
*ProductApi* | [**productOptionDelete**](docs/ProductApi.md#productOptionDelete) | **DELETE** /product.option.delete.json | product.option.delete
*ProductApi* | [**productOptionList**](docs/ProductApi.md#productOptionList) | **GET** /product.option.list.json | product.option.list
*ProductApi* | [**productOptionValueAdd**](docs/ProductApi.md#productOptionValueAdd) | **POST** /product.option.value.add.json | product.option.value.add
*ProductApi* | [**productOptionValueAssign**](docs/ProductApi.md#productOptionValueAssign) | **POST** /product.option.value.assign.json | product.option.value.assign
*ProductApi* | [**productOptionValueDelete**](docs/ProductApi.md#productOptionValueDelete) | **DELETE** /product.option.value.delete.json | product.option.value.delete
*ProductApi* | [**productOptionValueUpdate**](docs/ProductApi.md#productOptionValueUpdate) | **PUT** /product.option.value.update.json | product.option.value.update
*ProductApi* | [**productPriceAdd**](docs/ProductApi.md#productPriceAdd) | **POST** /product.price.add.json | product.price.add
*ProductApi* | [**productPriceDelete**](docs/ProductApi.md#productPriceDelete) | **DELETE** /product.price.delete.json | product.price.delete
*ProductApi* | [**productPriceUpdate**](docs/ProductApi.md#productPriceUpdate) | **PUT** /product.price.update.json | product.price.update
*ProductApi* | [**productReviewList**](docs/ProductApi.md#productReviewList) | **GET** /product.review.list.json | product.review.list
*ProductApi* | [**productStoreAssign**](docs/ProductApi.md#productStoreAssign) | **POST** /product.store.assign.json | product.store.assign
*ProductApi* | [**productTaxAdd**](docs/ProductApi.md#productTaxAdd) | **POST** /product.tax.add.json | product.tax.add
*ProductApi* | [**productUpdate**](docs/ProductApi.md#productUpdate) | **PUT** /product.update.json | product.update
*ProductApi* | [**productUpdateBatch**](docs/ProductApi.md#productUpdateBatch) | **POST** /product.update.batch.json | product.update.batch
*ProductApi* | [**productVariantAdd**](docs/ProductApi.md#productVariantAdd) | **POST** /product.variant.add.json | product.variant.add
*ProductApi* | [**productVariantAddBatch**](docs/ProductApi.md#productVariantAddBatch) | **POST** /product.variant.add.batch.json | product.variant.add.batch
*ProductApi* | [**productVariantCount**](docs/ProductApi.md#productVariantCount) | **GET** /product.variant.count.json | product.variant.count
*ProductApi* | [**productVariantDelete**](docs/ProductApi.md#productVariantDelete) | **DELETE** /product.variant.delete.json | product.variant.delete
*ProductApi* | [**productVariantDeleteBatch**](docs/ProductApi.md#productVariantDeleteBatch) | **POST** /product.variant.delete.batch.json | product.variant.delete.batch
*ProductApi* | [**productVariantImageAdd**](docs/ProductApi.md#productVariantImageAdd) | **POST** /product.variant.image.add.json | product.variant.image.add
*ProductApi* | [**productVariantImageDelete**](docs/ProductApi.md#productVariantImageDelete) | **DELETE** /product.variant.image.delete.json | product.variant.image.delete
*ProductApi* | [**productVariantInfo**](docs/ProductApi.md#productVariantInfo) | **GET** /product.variant.info.json | product.variant.info
*ProductApi* | [**productVariantList**](docs/ProductApi.md#productVariantList) | **GET** /product.variant.list.json | product.variant.list
*ProductApi* | [**productVariantPriceAdd**](docs/ProductApi.md#productVariantPriceAdd) | **POST** /product.variant.price.add.json | product.variant.price.add
*ProductApi* | [**productVariantPriceDelete**](docs/ProductApi.md#productVariantPriceDelete) | **DELETE** /product.variant.price.delete.json | product.variant.price.delete
*ProductApi* | [**productVariantPriceUpdate**](docs/ProductApi.md#productVariantPriceUpdate) | **PUT** /product.variant.price.update.json | product.variant.price.update
*ProductApi* | [**productVariantUpdate**](docs/ProductApi.md#productVariantUpdate) | **PUT** /product.variant.update.json | product.variant.update
*ProductApi* | [**productVariantUpdateBatch**](docs/ProductApi.md#productVariantUpdateBatch) | **POST** /product.variant.update.batch.json | product.variant.update.batch
*ReturnApi* | [**returnActionList**](docs/ReturnApi.md#returnActionList) | **GET** /return.action.list.json | return.action.list
*ReturnApi* | [**returnCount**](docs/ReturnApi.md#returnCount) | **GET** /return.count.json | return.count
*ReturnApi* | [**returnInfo**](docs/ReturnApi.md#returnInfo) | **GET** /return.info.json | return.info
*ReturnApi* | [**returnList**](docs/ReturnApi.md#returnList) | **GET** /return.list.json | return.list
*ReturnApi* | [**returnReasonList**](docs/ReturnApi.md#returnReasonList) | **GET** /return.reason.list.json | return.reason.list
*ReturnApi* | [**returnStatusList**](docs/ReturnApi.md#returnStatusList) | **GET** /return.status.list.json | return.status.list
*SubscriberApi* | [**subscriberList**](docs/SubscriberApi.md#subscriberList) | **GET** /subscriber.list.json | subscriber.list
*TaxApi* | [**taxClassInfo**](docs/TaxApi.md#taxClassInfo) | **GET** /tax.class.info.json | tax.class.info
*TaxApi* | [**taxClassList**](docs/TaxApi.md#taxClassList) | **GET** /tax.class.list.json | tax.class.list
*WebhookApi* | [**webhookCount**](docs/WebhookApi.md#webhookCount) | **GET** /webhook.count.json | webhook.count
*WebhookApi* | [**webhookCreate**](docs/WebhookApi.md#webhookCreate) | **POST** /webhook.create.json | webhook.create
*WebhookApi* | [**webhookDelete**](docs/WebhookApi.md#webhookDelete) | **DELETE** /webhook.delete.json | webhook.delete
*WebhookApi* | [**webhookEvents**](docs/WebhookApi.md#webhookEvents) | **GET** /webhook.events.json | webhook.events
*WebhookApi* | [**webhookList**](docs/WebhookApi.md#webhookList) | **GET** /webhook.list.json | webhook.list
*WebhookApi* | [**webhookUpdate**](docs/WebhookApi.md#webhookUpdate) | **PUT** /webhook.update.json | webhook.update


## Documentation for Models

 - [A2CDateTime](docs/A2CDateTime.md)
 - [AccountCartAdd](docs/AccountCartAdd.md)
 - [AccountCartAdd200Response](docs/AccountCartAdd200Response.md)
 - [AccountCartAdd200ResponseResult](docs/AccountCartAdd200ResponseResult.md)
 - [AccountCartAddHybrisWebsitesInner](docs/AccountCartAddHybrisWebsitesInner.md)
 - [AccountCartList200Response](docs/AccountCartList200Response.md)
 - [AccountCartList200ResponseResult](docs/AccountCartList200ResponseResult.md)
 - [AccountCartList200ResponseResultCartsInner](docs/AccountCartList200ResponseResultCartsInner.md)
 - [AccountConfigUpdate200Response](docs/AccountConfigUpdate200Response.md)
 - [AccountConfigUpdate200ResponseResult](docs/AccountConfigUpdate200ResponseResult.md)
 - [AccountFailedWebhooks200Response](docs/AccountFailedWebhooks200Response.md)
 - [AccountFailedWebhooks200ResponseResult](docs/AccountFailedWebhooks200ResponseResult.md)
 - [AccountFailedWebhooks200ResponseResultWebhookInner](docs/AccountFailedWebhooks200ResponseResultWebhookInner.md)
 - [AccountSupportedPlatforms200Response](docs/AccountSupportedPlatforms200Response.md)
 - [AccountSupportedPlatforms200ResponseResult](docs/AccountSupportedPlatforms200ResponseResult.md)
 - [AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner](docs/AccountSupportedPlatforms200ResponseResultSupportedPlatformsInner.md)
 - [AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParams](docs/AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParams.md)
 - [AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner](docs/AccountSupportedPlatforms200ResponseResultSupportedPlatformsInnerParamsRequiredInnerInner.md)
 - [AttributeAdd200Response](docs/AttributeAdd200Response.md)
 - [AttributeAdd200ResponseResult](docs/AttributeAdd200ResponseResult.md)
 - [AttributeAssignGroup200Response](docs/AttributeAssignGroup200Response.md)
 - [AttributeAssignGroup200ResponseResult](docs/AttributeAssignGroup200ResponseResult.md)
 - [AttributeCount200Response](docs/AttributeCount200Response.md)
 - [AttributeCount200ResponseResult](docs/AttributeCount200ResponseResult.md)
 - [AttributeDelete200Response](docs/AttributeDelete200Response.md)
 - [AttributeDelete200ResponseResult](docs/AttributeDelete200ResponseResult.md)
 - [AttributeInfo200Response](docs/AttributeInfo200Response.md)
 - [AttributeTypeList200Response](docs/AttributeTypeList200Response.md)
 - [AttributeTypeList200ResponseResult](docs/AttributeTypeList200ResponseResult.md)
 - [AttributeUnassignGroup200Response](docs/AttributeUnassignGroup200Response.md)
 - [AttributeUnassignGroup200ResponseResult](docs/AttributeUnassignGroup200ResponseResult.md)
 - [AttributeUpdate200Response](docs/AttributeUpdate200Response.md)
 - [AttributeUpdate200ResponseResult](docs/AttributeUpdate200ResponseResult.md)
 - [AttributeValueDelete200Response](docs/AttributeValueDelete200Response.md)
 - [AttributeValueDelete200ResponseResult](docs/AttributeValueDelete200ResponseResult.md)
 - [BaseCustomer](docs/BaseCustomer.md)
 - [Basket](docs/Basket.md)
 - [BasketInfo200Response](docs/BasketInfo200Response.md)
 - [BasketItem](docs/BasketItem.md)
 - [BasketItemAdd200Response](docs/BasketItemAdd200Response.md)
 - [BasketItemAdd200ResponseResult](docs/BasketItemAdd200ResponseResult.md)
 - [BasketItemOption](docs/BasketItemOption.md)
 - [BasketLiveShippingService](docs/BasketLiveShippingService.md)
 - [BasketLiveShippingServiceCreate200Response](docs/BasketLiveShippingServiceCreate200Response.md)
 - [BasketLiveShippingServiceCreate200ResponseResult](docs/BasketLiveShippingServiceCreate200ResponseResult.md)
 - [BasketLiveShippingServiceDelete200Response](docs/BasketLiveShippingServiceDelete200Response.md)
 - [BasketLiveShippingServiceDelete200ResponseResult](docs/BasketLiveShippingServiceDelete200ResponseResult.md)
 - [BasketLiveShippingServiceList200Response](docs/BasketLiveShippingServiceList200Response.md)
 - [BasketLiveShippingServiceList200ResponseResult](docs/BasketLiveShippingServiceList200ResponseResult.md)
 - [BatchJob](docs/BatchJob.md)
 - [BatchJobResult](docs/BatchJobResult.md)
 - [BatchJobResultItem](docs/BatchJobResultItem.md)
 - [Brand](docs/Brand.md)
 - [Carrier](docs/Carrier.md)
 - [Cart](docs/Cart.md)
 - [CartBridge200Response](docs/CartBridge200Response.md)
 - [CartBridge200ResponseResult](docs/CartBridge200ResponseResult.md)
 - [CartCatalogPriceRulesCount200Response](docs/CartCatalogPriceRulesCount200Response.md)
 - [CartCatalogPriceRulesCount200ResponseResult](docs/CartCatalogPriceRulesCount200ResponseResult.md)
 - [CartChannel](docs/CartChannel.md)
 - [CartClearCache200Response](docs/CartClearCache200Response.md)
 - [CartClearCache200ResponseResult](docs/CartClearCache200ResponseResult.md)
 - [CartConfig200Response](docs/CartConfig200Response.md)
 - [CartConfig200ResponseResult](docs/CartConfig200ResponseResult.md)
 - [CartConfigUpdate](docs/CartConfigUpdate.md)
 - [CartConfigUpdate200Response](docs/CartConfigUpdate200Response.md)
 - [CartCouponAdd](docs/CartCouponAdd.md)
 - [CartCouponAdd200Response](docs/CartCouponAdd200Response.md)
 - [CartCouponAdd200ResponseResult](docs/CartCouponAdd200ResponseResult.md)
 - [CartCouponCount200Response](docs/CartCouponCount200Response.md)
 - [CartCouponCount200ResponseResult](docs/CartCouponCount200ResponseResult.md)
 - [CartCreate](docs/CartCreate.md)
 - [CartDelete200Response](docs/CartDelete200Response.md)
 - [CartDelete200ResponseResult](docs/CartDelete200ResponseResult.md)
 - [CartDisconnect200Response](docs/CartDisconnect200Response.md)
 - [CartDisconnect200ResponseResult](docs/CartDisconnect200ResponseResult.md)
 - [CartGiftcardAdd200Response](docs/CartGiftcardAdd200Response.md)
 - [CartGiftcardAdd200ResponseResult](docs/CartGiftcardAdd200ResponseResult.md)
 - [CartGiftcardCount200Response](docs/CartGiftcardCount200Response.md)
 - [CartGiftcardCount200ResponseResult](docs/CartGiftcardCount200ResponseResult.md)
 - [CartInfo200Response](docs/CartInfo200Response.md)
 - [CartList200Response](docs/CartList200Response.md)
 - [CartList200ResponseResult](docs/CartList200ResponseResult.md)
 - [CartList200ResponseResultSupportedCartsInner](docs/CartList200ResponseResultSupportedCartsInner.md)
 - [CartMetaData](docs/CartMetaData.md)
 - [CartMethods200Response](docs/CartMethods200Response.md)
 - [CartMethods200ResponseResult](docs/CartMethods200ResponseResult.md)
 - [CartPluginList200Response](docs/CartPluginList200Response.md)
 - [CartPluginList200ResponseResult](docs/CartPluginList200ResponseResult.md)
 - [CartScriptAdd200Response](docs/CartScriptAdd200Response.md)
 - [CartScriptAdd200ResponseResult](docs/CartScriptAdd200ResponseResult.md)
 - [CartShippingMethod](docs/CartShippingMethod.md)
 - [CartShippingMethodRate](docs/CartShippingMethodRate.md)
 - [CartShippingZone](docs/CartShippingZone.md)
 - [CartShippingZone2](docs/CartShippingZone2.md)
 - [CartStoreInfo](docs/CartStoreInfo.md)
 - [CartValidate200Response](docs/CartValidate200Response.md)
 - [CartValidate200ResponseResult](docs/CartValidate200ResponseResult.md)
 - [CartWarehouse](docs/CartWarehouse.md)
 - [CatalogPriceRule](docs/CatalogPriceRule.md)
 - [CatalogPriceRuleAction](docs/CatalogPriceRuleAction.md)
 - [Category](docs/Category.md)
 - [CategoryAdd200Response](docs/CategoryAdd200Response.md)
 - [CategoryAdd200ResponseResult](docs/CategoryAdd200ResponseResult.md)
 - [CategoryAddBatch](docs/CategoryAddBatch.md)
 - [CategoryAddBatch200Response](docs/CategoryAddBatch200Response.md)
 - [CategoryAddBatch200ResponseResult](docs/CategoryAddBatch200ResponseResult.md)
 - [CategoryAddBatchPayloadInner](docs/CategoryAddBatchPayloadInner.md)
 - [CategoryAddBatchPayloadInnerImagesInner](docs/CategoryAddBatchPayloadInnerImagesInner.md)
 - [CategoryCount200Response](docs/CategoryCount200Response.md)
 - [CategoryCount200ResponseResult](docs/CategoryCount200ResponseResult.md)
 - [CategoryDelete200Response](docs/CategoryDelete200Response.md)
 - [CategoryDelete200ResponseResult](docs/CategoryDelete200ResponseResult.md)
 - [CategoryFind200Response](docs/CategoryFind200Response.md)
 - [CategoryFind200ResponseResult](docs/CategoryFind200ResponseResult.md)
 - [CategoryFind200ResponseResultCategoryInner](docs/CategoryFind200ResponseResultCategoryInner.md)
 - [CategoryImageAdd200Response](docs/CategoryImageAdd200Response.md)
 - [CategoryImageAdd200ResponseResult](docs/CategoryImageAdd200ResponseResult.md)
 - [CategoryInfo200Response](docs/CategoryInfo200Response.md)
 - [Child](docs/Child.md)
 - [Country](docs/Country.md)
 - [Coupon](docs/Coupon.md)
 - [CouponAction](docs/CouponAction.md)
 - [CouponCode](docs/CouponCode.md)
 - [CouponCondition](docs/CouponCondition.md)
 - [CouponHistory](docs/CouponHistory.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerAdd](docs/CustomerAdd.md)
 - [CustomerAdd200Response](docs/CustomerAdd200Response.md)
 - [CustomerAdd200ResponseResult](docs/CustomerAdd200ResponseResult.md)
 - [CustomerAddAddressInner](docs/CustomerAddAddressInner.md)
 - [CustomerAddConsentsInner](docs/CustomerAddConsentsInner.md)
 - [CustomerAddress](docs/CustomerAddress.md)
 - [CustomerAddressAdd](docs/CustomerAddressAdd.md)
 - [CustomerAttribute](docs/CustomerAttribute.md)
 - [CustomerAttributeValue](docs/CustomerAttributeValue.md)
 - [CustomerConsent](docs/CustomerConsent.md)
 - [CustomerCount200Response](docs/CustomerCount200Response.md)
 - [CustomerCount200ResponseResult](docs/CustomerCount200ResponseResult.md)
 - [CustomerDelete200Response](docs/CustomerDelete200Response.md)
 - [CustomerDelete200ResponseResult](docs/CustomerDelete200ResponseResult.md)
 - [CustomerFind200Response](docs/CustomerFind200Response.md)
 - [CustomerFind200ResponseResult](docs/CustomerFind200ResponseResult.md)
 - [CustomerGroup](docs/CustomerGroup.md)
 - [CustomerGroupAdd200Response](docs/CustomerGroupAdd200Response.md)
 - [CustomerGroupAdd200ResponseResult](docs/CustomerGroupAdd200ResponseResult.md)
 - [CustomerInfo200Response](docs/CustomerInfo200Response.md)
 - [CustomerUpdate](docs/CustomerUpdate.md)
 - [CustomerUpdateAddressInner](docs/CustomerUpdateAddressInner.md)
 - [CustomerWishList](docs/CustomerWishList.md)
 - [CustomerWishListItem](docs/CustomerWishListItem.md)
 - [Discount](docs/Discount.md)
 - [GiftCard](docs/GiftCard.md)
 - [Image](docs/Image.md)
 - [Info](docs/Info.md)
 - [Language](docs/Language.md)
 - [MarketplaceProduct](docs/MarketplaceProduct.md)
 - [Media](docs/Media.md)
 - [ModelResponseAttributeAttributesetList](docs/ModelResponseAttributeAttributesetList.md)
 - [ModelResponseAttributeGroupList](docs/ModelResponseAttributeGroupList.md)
 - [ModelResponseAttributeList](docs/ModelResponseAttributeList.md)
 - [ModelResponseBatchJobList](docs/ModelResponseBatchJobList.md)
 - [ModelResponseCartCatalogPriceRulesList](docs/ModelResponseCartCatalogPriceRulesList.md)
 - [ModelResponseCartCouponList](docs/ModelResponseCartCouponList.md)
 - [ModelResponseCartGiftCardList](docs/ModelResponseCartGiftCardList.md)
 - [ModelResponseCartMetaDataList](docs/ModelResponseCartMetaDataList.md)
 - [ModelResponseCartScriptList](docs/ModelResponseCartScriptList.md)
 - [ModelResponseCartShippingZonesList](docs/ModelResponseCartShippingZonesList.md)
 - [ModelResponseCategoryList](docs/ModelResponseCategoryList.md)
 - [ModelResponseCustomerAttributeList](docs/ModelResponseCustomerAttributeList.md)
 - [ModelResponseCustomerGroupList](docs/ModelResponseCustomerGroupList.md)
 - [ModelResponseCustomerList](docs/ModelResponseCustomerList.md)
 - [ModelResponseCustomerWishlistList](docs/ModelResponseCustomerWishlistList.md)
 - [ModelResponseMarketplaceProductFind](docs/ModelResponseMarketplaceProductFind.md)
 - [ModelResponseOrderAbandonedList](docs/ModelResponseOrderAbandonedList.md)
 - [ModelResponseOrderList](docs/ModelResponseOrderList.md)
 - [ModelResponseOrderPreestimateShippingList](docs/ModelResponseOrderPreestimateShippingList.md)
 - [ModelResponseOrderShipmentList](docs/ModelResponseOrderShipmentList.md)
 - [ModelResponseOrderStatusList](docs/ModelResponseOrderStatusList.md)
 - [ModelResponseOrderTransactionList](docs/ModelResponseOrderTransactionList.md)
 - [ModelResponseProductAttributeList](docs/ModelResponseProductAttributeList.md)
 - [ModelResponseProductBrandList](docs/ModelResponseProductBrandList.md)
 - [ModelResponseProductChildItemList](docs/ModelResponseProductChildItemList.md)
 - [ModelResponseProductCurrencyList](docs/ModelResponseProductCurrencyList.md)
 - [ModelResponseProductList](docs/ModelResponseProductList.md)
 - [ModelResponseProductOptionList](docs/ModelResponseProductOptionList.md)
 - [ModelResponseProductReviewList](docs/ModelResponseProductReviewList.md)
 - [ModelResponseReturnList](docs/ModelResponseReturnList.md)
 - [ModelResponseSubscriberList](docs/ModelResponseSubscriberList.md)
 - [ModelResponseTaxClassInfo](docs/ModelResponseTaxClassInfo.md)
 - [ModelResponseTaxClassList](docs/ModelResponseTaxClassList.md)
 - [ModelReturn](docs/ModelReturn.md)
 - [Order](docs/Order.md)
 - [OrderAbandoned](docs/OrderAbandoned.md)
 - [OrderAdd](docs/OrderAdd.md)
 - [OrderAdd200Response](docs/OrderAdd200Response.md)
 - [OrderAdd200ResponseResult](docs/OrderAdd200ResponseResult.md)
 - [OrderAddNoteAttributesInner](docs/OrderAddNoteAttributesInner.md)
 - [OrderAddOrderItemInner](docs/OrderAddOrderItemInner.md)
 - [OrderAddOrderItemInnerOrderItemOptionInner](docs/OrderAddOrderItemInnerOrderItemOptionInner.md)
 - [OrderAddOrderItemInnerOrderItemPropertyInner](docs/OrderAddOrderItemInnerOrderItemPropertyInner.md)
 - [OrderCount200Response](docs/OrderCount200Response.md)
 - [OrderCount200ResponseResult](docs/OrderCount200ResponseResult.md)
 - [OrderFinancialStatusList200Response](docs/OrderFinancialStatusList200Response.md)
 - [OrderFinancialStatusList200ResponseResult](docs/OrderFinancialStatusList200ResponseResult.md)
 - [OrderFinancialStatusList200ResponseResultOrderFinancialStatusesInner](docs/OrderFinancialStatusList200ResponseResultOrderFinancialStatusesInner.md)
 - [OrderFind200Response](docs/OrderFind200Response.md)
 - [OrderFind200ResponseResult](docs/OrderFind200ResponseResult.md)
 - [OrderFulfillmentStatusList200Response](docs/OrderFulfillmentStatusList200Response.md)
 - [OrderFulfillmentStatusList200ResponseResult](docs/OrderFulfillmentStatusList200ResponseResult.md)
 - [OrderInfo200Response](docs/OrderInfo200Response.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderItemOption](docs/OrderItemOption.md)
 - [OrderPaymentMethod](docs/OrderPaymentMethod.md)
 - [OrderPreestimateShipping](docs/OrderPreestimateShipping.md)
 - [OrderPreestimateShippingList](docs/OrderPreestimateShippingList.md)
 - [OrderPreestimateShippingListOrderItemInner](docs/OrderPreestimateShippingListOrderItemInner.md)
 - [OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner](docs/OrderPreestimateShippingListOrderItemInnerOrderItemOptionInner.md)
 - [OrderRefund](docs/OrderRefund.md)
 - [OrderRefundAdd](docs/OrderRefundAdd.md)
 - [OrderRefundAdd200Response](docs/OrderRefundAdd200Response.md)
 - [OrderRefundAdd200ResponseResult](docs/OrderRefundAdd200ResponseResult.md)
 - [OrderRefundAddItemsInner](docs/OrderRefundAddItemsInner.md)
 - [OrderReturnAdd](docs/OrderReturnAdd.md)
 - [OrderReturnAdd200Response](docs/OrderReturnAdd200Response.md)
 - [OrderReturnAdd200ResponseResult](docs/OrderReturnAdd200ResponseResult.md)
 - [OrderReturnAddOrderProductsInner](docs/OrderReturnAddOrderProductsInner.md)
 - [OrderReturnUpdate](docs/OrderReturnUpdate.md)
 - [OrderReturnUpdateOrderProductsInner](docs/OrderReturnUpdateOrderProductsInner.md)
 - [OrderShipmentAdd](docs/OrderShipmentAdd.md)
 - [OrderShipmentAdd200Response](docs/OrderShipmentAdd200Response.md)
 - [OrderShipmentAdd200ResponseResult](docs/OrderShipmentAdd200ResponseResult.md)
 - [OrderShipmentAddBatch](docs/OrderShipmentAddBatch.md)
 - [OrderShipmentAddBatchPayloadInner](docs/OrderShipmentAddBatchPayloadInner.md)
 - [OrderShipmentAddBatchPayloadInnerItemsInner](docs/OrderShipmentAddBatchPayloadInnerItemsInner.md)
 - [OrderShipmentAddItemsInner](docs/OrderShipmentAddItemsInner.md)
 - [OrderShipmentAddTrackingNumbersInner](docs/OrderShipmentAddTrackingNumbersInner.md)
 - [OrderShipmentDelete200Response](docs/OrderShipmentDelete200Response.md)
 - [OrderShipmentDelete200ResponseResult](docs/OrderShipmentDelete200ResponseResult.md)
 - [OrderShipmentInfo200Response](docs/OrderShipmentInfo200Response.md)
 - [OrderShipmentTrackingAdd](docs/OrderShipmentTrackingAdd.md)
 - [OrderShipmentTrackingAdd200Response](docs/OrderShipmentTrackingAdd200Response.md)
 - [OrderShipmentTrackingAdd200ResponseResult](docs/OrderShipmentTrackingAdd200ResponseResult.md)
 - [OrderShipmentUpdate](docs/OrderShipmentUpdate.md)
 - [OrderShippingMethod](docs/OrderShippingMethod.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [OrderStatusHistoryItem](docs/OrderStatusHistoryItem.md)
 - [OrderStatusRefund](docs/OrderStatusRefund.md)
 - [OrderStatusRefundItem](docs/OrderStatusRefundItem.md)
 - [OrderTotal](docs/OrderTotal.md)
 - [OrderTotals](docs/OrderTotals.md)
 - [OrderTotalsNewDiscount](docs/OrderTotalsNewDiscount.md)
 - [OrderTransaction](docs/OrderTransaction.md)
 - [Pagination](docs/Pagination.md)
 - [Plugin](docs/Plugin.md)
 - [PluginList](docs/PluginList.md)
 - [Product](docs/Product.md)
 - [ProductAdd](docs/ProductAdd.md)
 - [ProductAdd200Response](docs/ProductAdd200Response.md)
 - [ProductAdd200ResponseResult](docs/ProductAdd200ResponseResult.md)
 - [ProductAddBatch](docs/ProductAddBatch.md)
 - [ProductAddBatchPayloadInner](docs/ProductAddBatchPayloadInner.md)
 - [ProductAddBatchPayloadInnerAdvancedPricesInner](docs/ProductAddBatchPayloadInnerAdvancedPricesInner.md)
 - [ProductAddBatchPayloadInnerImagesInner](docs/ProductAddBatchPayloadInnerImagesInner.md)
 - [ProductAddBestOffer](docs/ProductAddBestOffer.md)
 - [ProductAddCertificationsInner](docs/ProductAddCertificationsInner.md)
 - [ProductAddCertificationsInnerFilesInner](docs/ProductAddCertificationsInnerFilesInner.md)
 - [ProductAddCertificationsInnerImagesInner](docs/ProductAddCertificationsInnerImagesInner.md)
 - [ProductAddFilesInner](docs/ProductAddFilesInner.md)
 - [ProductAddGroupPricesInner](docs/ProductAddGroupPricesInner.md)
 - [ProductAddManufacturerInfo](docs/ProductAddManufacturerInfo.md)
 - [ProductAddPackageDetails](docs/ProductAddPackageDetails.md)
 - [ProductAddSalesTax](docs/ProductAddSalesTax.md)
 - [ProductAddSellerProfiles](docs/ProductAddSellerProfiles.md)
 - [ProductAddShippingDetailsInner](docs/ProductAddShippingDetailsInner.md)
 - [ProductAddSizeChart](docs/ProductAddSizeChart.md)
 - [ProductAddSpecificsInner](docs/ProductAddSpecificsInner.md)
 - [ProductAddSpecificsInnerBookingDetails](docs/ProductAddSpecificsInnerBookingDetails.md)
 - [ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner](docs/ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner.md)
 - [ProductAddSpecificsInnerBookingDetailsAvailabilitiesInnerTimesInner](docs/ProductAddSpecificsInnerBookingDetailsAvailabilitiesInnerTimesInner.md)
 - [ProductAddSpecificsInnerBookingDetailsOverridesInner](docs/ProductAddSpecificsInnerBookingDetailsOverridesInner.md)
 - [ProductAddSpecificsInnerFoodDetails](docs/ProductAddSpecificsInnerFoodDetails.md)
 - [ProductAddSpecificsInnerGroupProductsDetailsInner](docs/ProductAddSpecificsInnerGroupProductsDetailsInner.md)
 - [ProductAddTierPricesInner](docs/ProductAddTierPricesInner.md)
 - [ProductAdvancedPrice](docs/ProductAdvancedPrice.md)
 - [ProductAttribute](docs/ProductAttribute.md)
 - [ProductAttributeValueSet200Response](docs/ProductAttributeValueSet200Response.md)
 - [ProductAttributeValueSet200ResponseResult](docs/ProductAttributeValueSet200ResponseResult.md)
 - [ProductAttributeValueUnset200Response](docs/ProductAttributeValueUnset200Response.md)
 - [ProductAttributeValueUnset200ResponseResult](docs/ProductAttributeValueUnset200ResponseResult.md)
 - [ProductChildItemCombination](docs/ProductChildItemCombination.md)
 - [ProductChildItemFind200Response](docs/ProductChildItemFind200Response.md)
 - [ProductChildItemFind200ResponseResult](docs/ProductChildItemFind200ResponseResult.md)
 - [ProductChildItemInfo200Response](docs/ProductChildItemInfo200Response.md)
 - [ProductCount200Response](docs/ProductCount200Response.md)
 - [ProductCount200ResponseResult](docs/ProductCount200ResponseResult.md)
 - [ProductCurrencyAdd200Response](docs/ProductCurrencyAdd200Response.md)
 - [ProductCurrencyAdd200ResponseResult](docs/ProductCurrencyAdd200ResponseResult.md)
 - [ProductDeleteBatch](docs/ProductDeleteBatch.md)
 - [ProductDeleteBatchPayloadInner](docs/ProductDeleteBatchPayloadInner.md)
 - [ProductFind200Response](docs/ProductFind200Response.md)
 - [ProductFind200ResponseResult](docs/ProductFind200ResponseResult.md)
 - [ProductFind200ResponseResultProductInner](docs/ProductFind200ResponseResultProductInner.md)
 - [ProductGroupItem](docs/ProductGroupItem.md)
 - [ProductGroupPrice](docs/ProductGroupPrice.md)
 - [ProductImageAdd](docs/ProductImageAdd.md)
 - [ProductImageAdd200Response](docs/ProductImageAdd200Response.md)
 - [ProductImageAdd200ResponseResult](docs/ProductImageAdd200ResponseResult.md)
 - [ProductImageUpdate200Response](docs/ProductImageUpdate200Response.md)
 - [ProductImageUpdate200ResponseResult](docs/ProductImageUpdate200ResponseResult.md)
 - [ProductInfo200Response](docs/ProductInfo200Response.md)
 - [ProductInventory](docs/ProductInventory.md)
 - [ProductManufacturerAdd200Response](docs/ProductManufacturerAdd200Response.md)
 - [ProductManufacturerAdd200ResponseResult](docs/ProductManufacturerAdd200ResponseResult.md)
 - [ProductOption](docs/ProductOption.md)
 - [ProductOptionAdd](docs/ProductOptionAdd.md)
 - [ProductOptionAdd200Response](docs/ProductOptionAdd200Response.md)
 - [ProductOptionAdd200ResponseResult](docs/ProductOptionAdd200ResponseResult.md)
 - [ProductOptionAddValuesInner](docs/ProductOptionAddValuesInner.md)
 - [ProductOptionAssign200Response](docs/ProductOptionAssign200Response.md)
 - [ProductOptionAssign200ResponseResult](docs/ProductOptionAssign200ResponseResult.md)
 - [ProductOptionItem](docs/ProductOptionItem.md)
 - [ProductOptionValueAdd200Response](docs/ProductOptionValueAdd200Response.md)
 - [ProductOptionValueAdd200ResponseResult](docs/ProductOptionValueAdd200ResponseResult.md)
 - [ProductOptionValueAssign200Response](docs/ProductOptionValueAssign200Response.md)
 - [ProductOptionValueAssign200ResponseResult](docs/ProductOptionValueAssign200ResponseResult.md)
 - [ProductPriceAdd](docs/ProductPriceAdd.md)
 - [ProductPriceUpdate](docs/ProductPriceUpdate.md)
 - [ProductPriceUpdateGroupPricesInner](docs/ProductPriceUpdateGroupPricesInner.md)
 - [ProductReview](docs/ProductReview.md)
 - [ProductReviewRating](docs/ProductReviewRating.md)
 - [ProductTaxAdd](docs/ProductTaxAdd.md)
 - [ProductTaxAdd200Response](docs/ProductTaxAdd200Response.md)
 - [ProductTaxAdd200ResponseResult](docs/ProductTaxAdd200ResponseResult.md)
 - [ProductTaxAddTaxRatesInner](docs/ProductTaxAddTaxRatesInner.md)
 - [ProductTierPrice](docs/ProductTierPrice.md)
 - [ProductUpdate](docs/ProductUpdate.md)
 - [ProductUpdateBatch](docs/ProductUpdateBatch.md)
 - [ProductUpdateBatchPayloadInner](docs/ProductUpdateBatchPayloadInner.md)
 - [ProductUpdateBatchPayloadInnerAdvancedPricesInner](docs/ProductUpdateBatchPayloadInnerAdvancedPricesInner.md)
 - [ProductUpdateBatchPayloadInnerImagesInner](docs/ProductUpdateBatchPayloadInnerImagesInner.md)
 - [ProductVariantAdd](docs/ProductVariantAdd.md)
 - [ProductVariantAdd200Response](docs/ProductVariantAdd200Response.md)
 - [ProductVariantAdd200ResponseResult](docs/ProductVariantAdd200ResponseResult.md)
 - [ProductVariantAddAttributesInner](docs/ProductVariantAddAttributesInner.md)
 - [ProductVariantAddBatch](docs/ProductVariantAddBatch.md)
 - [ProductVariantAddBatchPayloadInner](docs/ProductVariantAddBatchPayloadInner.md)
 - [ProductVariantAddBatchPayloadInnerCombinationInner](docs/ProductVariantAddBatchPayloadInnerCombinationInner.md)
 - [ProductVariantCount200Response](docs/ProductVariantCount200Response.md)
 - [ProductVariantCount200ResponseResult](docs/ProductVariantCount200ResponseResult.md)
 - [ProductVariantDeleteBatch](docs/ProductVariantDeleteBatch.md)
 - [ProductVariantDeleteBatchPayloadInner](docs/ProductVariantDeleteBatchPayloadInner.md)
 - [ProductVariantImageAdd](docs/ProductVariantImageAdd.md)
 - [ProductVariantImageAdd200Response](docs/ProductVariantImageAdd200Response.md)
 - [ProductVariantImageAdd200ResponseResult](docs/ProductVariantImageAdd200ResponseResult.md)
 - [ProductVariantList200Response](docs/ProductVariantList200Response.md)
 - [ProductVariantList200ResponseResult](docs/ProductVariantList200ResponseResult.md)
 - [ProductVariantPriceAdd](docs/ProductVariantPriceAdd.md)
 - [ProductVariantPriceUpdate](docs/ProductVariantPriceUpdate.md)
 - [ProductVariantUpdate](docs/ProductVariantUpdate.md)
 - [ProductVariantUpdateBatch](docs/ProductVariantUpdateBatch.md)
 - [ProductVariantUpdateBatchPayloadInner](docs/ProductVariantUpdateBatchPayloadInner.md)
 - [ProductVariantUpdateOptionsInner](docs/ProductVariantUpdateOptionsInner.md)
 - [ResponseAttributeAttributesetListResult](docs/ResponseAttributeAttributesetListResult.md)
 - [ResponseAttributeGroupListResult](docs/ResponseAttributeGroupListResult.md)
 - [ResponseAttributeListResult](docs/ResponseAttributeListResult.md)
 - [ResponseBatchJobListResult](docs/ResponseBatchJobListResult.md)
 - [ResponseBatchJobResult](docs/ResponseBatchJobResult.md)
 - [ResponseCartCatalogPriceRulesListResult](docs/ResponseCartCatalogPriceRulesListResult.md)
 - [ResponseCartCouponListResult](docs/ResponseCartCouponListResult.md)
 - [ResponseCartGiftcardListResult](docs/ResponseCartGiftcardListResult.md)
 - [ResponseCartMetaDataListResult](docs/ResponseCartMetaDataListResult.md)
 - [ResponseCartScriptListResult](docs/ResponseCartScriptListResult.md)
 - [ResponseCartShippingZonesListResult](docs/ResponseCartShippingZonesListResult.md)
 - [ResponseCategoryListResult](docs/ResponseCategoryListResult.md)
 - [ResponseCustomerAttributeListResult](docs/ResponseCustomerAttributeListResult.md)
 - [ResponseCustomerGroupListResult](docs/ResponseCustomerGroupListResult.md)
 - [ResponseCustomerListResult](docs/ResponseCustomerListResult.md)
 - [ResponseCustomerWishlistListResult](docs/ResponseCustomerWishlistListResult.md)
 - [ResponseMarketplaceProductFindResult](docs/ResponseMarketplaceProductFindResult.md)
 - [ResponseOrderAbandonedListResult](docs/ResponseOrderAbandonedListResult.md)
 - [ResponseOrderListResult](docs/ResponseOrderListResult.md)
 - [ResponseOrderPreestimateShippingListResult](docs/ResponseOrderPreestimateShippingListResult.md)
 - [ResponseOrderShipmentListResult](docs/ResponseOrderShipmentListResult.md)
 - [ResponseOrderStatusListResult](docs/ResponseOrderStatusListResult.md)
 - [ResponseOrderTransactionListResult](docs/ResponseOrderTransactionListResult.md)
 - [ResponseProductAttributeListResult](docs/ResponseProductAttributeListResult.md)
 - [ResponseProductBrandListResult](docs/ResponseProductBrandListResult.md)
 - [ResponseProductChildItemListResult](docs/ResponseProductChildItemListResult.md)
 - [ResponseProductCurrencyListResult](docs/ResponseProductCurrencyListResult.md)
 - [ResponseProductListResult](docs/ResponseProductListResult.md)
 - [ResponseProductOptionListResult](docs/ResponseProductOptionListResult.md)
 - [ResponseProductReviewListResult](docs/ResponseProductReviewListResult.md)
 - [ResponseReturnListResult](docs/ResponseReturnListResult.md)
 - [ResponseSubscriberListResult](docs/ResponseSubscriberListResult.md)
 - [ResponseTaxClassInfoResult](docs/ResponseTaxClassInfoResult.md)
 - [ResponseTaxClassListResult](docs/ResponseTaxClassListResult.md)
 - [ReturnAction](docs/ReturnAction.md)
 - [ReturnActionList200Response](docs/ReturnActionList200Response.md)
 - [ReturnActionList200ResponseResult](docs/ReturnActionList200ResponseResult.md)
 - [ReturnCount200Response](docs/ReturnCount200Response.md)
 - [ReturnCount200ResponseResult](docs/ReturnCount200ResponseResult.md)
 - [ReturnInfo200Response](docs/ReturnInfo200Response.md)
 - [ReturnOrderProduct](docs/ReturnOrderProduct.md)
 - [ReturnReason](docs/ReturnReason.md)
 - [ReturnReasonList200Response](docs/ReturnReasonList200Response.md)
 - [ReturnReasonList200ResponseResult](docs/ReturnReasonList200ResponseResult.md)
 - [ReturnStatus](docs/ReturnStatus.md)
 - [ReturnStatusList200Response](docs/ReturnStatusList200Response.md)
 - [ReturnStatusList200ResponseResult](docs/ReturnStatusList200ResponseResult.md)
 - [Script](docs/Script.md)
 - [Shipment](docs/Shipment.md)
 - [ShipmentItem](docs/ShipmentItem.md)
 - [ShipmentTrackingNumber](docs/ShipmentTrackingNumber.md)
 - [SpecialPrice](docs/SpecialPrice.md)
 - [State](docs/State.md)
 - [Status](docs/Status.md)
 - [StoreAttribute](docs/StoreAttribute.md)
 - [StoreAttributeAttributeSet](docs/StoreAttributeAttributeSet.md)
 - [StoreAttributeGroup](docs/StoreAttributeGroup.md)
 - [Subscriber](docs/Subscriber.md)
 - [TaxClass](docs/TaxClass.md)
 - [TaxClassCountries](docs/TaxClassCountries.md)
 - [TaxClassRate](docs/TaxClassRate.md)
 - [TaxClassStates](docs/TaxClassStates.md)
 - [TaxClassZipCodes](docs/TaxClassZipCodes.md)
 - [TaxClassZipCodesRange](docs/TaxClassZipCodesRange.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCount200Response](docs/WebhookCount200Response.md)
 - [WebhookCount200ResponseResult](docs/WebhookCount200ResponseResult.md)
 - [WebhookEvents200Response](docs/WebhookEvents200Response.md)
 - [WebhookEvents200ResponseResult](docs/WebhookEvents200ResponseResult.md)
 - [WebhookEvents200ResponseResultEventsInner](docs/WebhookEvents200ResponseResultEventsInner.md)
 - [WebhookList200Response](docs/WebhookList200Response.md)
 - [WebhookList200ResponseResult](docs/WebhookList200ResponseResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key

- **API key parameter name**: x-api-key
- **Location**: HTTP header

### StoreKeyAuth

- **Type**: API key

- **API key parameter name**: x-store-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@api2cart.com

