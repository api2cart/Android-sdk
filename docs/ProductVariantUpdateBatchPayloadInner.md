

# ProductVariantUpdateBatchPayloadInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**productId** | **String** |  | 
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**shortDescription** | **String** |  |  [optional]
**sku** | **String** |  |  [optional]
**upc** | **String** |  |  [optional]
**mpn** | **String** |  |  [optional]
**gtin** | **String** |  |  [optional]
**isbn** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**specialPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**costPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**retailPrice** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**advancedPrices** | [**List&lt;ProductUpdateBatchPayloadInnerAdvancedPricesInner&gt;**](ProductUpdateBatchPayloadInnerAdvancedPricesInner.md) | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**reserveQuantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**increaseQuantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**reduceQuantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**warehouseId** | **String** |  |  [optional]
**manufacturerId** | **String** |  |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**height** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**length** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**width** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**storeId** | **String** |  |  [optional]
**langId** | **String** |  |  [optional]
**taxClassId** | **String** |  |  [optional]
**backorderStatus** | **String** |  |  [optional]
**visible** | **String** |  |  [optional]
**isDefault** | **Boolean** |  |  [optional]
**inStock** | **Boolean** |  |  [optional]
**isVirtual** | **Boolean** |  |  [optional]
**downloadable** | **Boolean** |  |  [optional]
**manageStock** | **Boolean** |  |  [optional]
**isFreeShipping** | **Boolean** |  |  [optional]
**seoUrl** | **String** |  |  [optional]
**metaTitle** | **String** |  |  [optional]
**metaDescription** | **String** |  |  [optional]
**metaKeywords** | **List&lt;String&gt;** |  |  [optional]
**categoriesIds** | **List&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**storesIds** | **List&lt;String&gt;** |  |  [optional]
**images** | [**List&lt;ProductAddBatchPayloadInnerImagesInner&gt;**](ProductAddBatchPayloadInnerImagesInner.md) | The passed items will completely replace the original items |  [optional]
**productImagesIds** | **List&lt;String&gt;** |  |  [optional]
**relatedProductsIds** | **List&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**upSellProductsIds** | **List&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]
**crossSellProductsIds** | **List&lt;String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional]




